/*
 * Copyright 2021 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef SPL_RUNTIME_WINDOW_IMPL_COUNT_COUNT_SLIDING_WINDOW_IMPL_H
#define SPL_RUNTIME_WINDOW_IMPL_COUNT_COUNT_SLIDING_WINDOW_IMPL_H

#include <SPL/Runtime/Window/CountStarSlidingWindowImpl.h>
#include <SPL/Runtime/Window/StarCountSlidingWindowImpl.h>

namespace SPL {

template<class T, class G, class D, class S>
class CountCountSlidingWindowImpl
  : public CountStarSlidingWindowImpl<T, G, D, S>
  , public StarCountSlidingWindowImpl<T, G, D, S>
{
  public:
#include "SlidingTypedefs.h"
    CountCountSlidingWindowImpl(WindowType& window)
      : SlidingWindowImpl<T, G, D, S>(window)
      , CountStarSlidingWindowImpl<T, G, D, S>(window)
      , StarCountSlidingWindowImpl<T, G, D, S>(window)
    {}

    CountCountSlidingWindowImpl(WindowType& window, PartitionEvictionImpl<T, G, D, S>& pEP)
      : SlidingWindowImpl<T, G, D, S>(window, pEP)
      , CountStarSlidingWindowImpl<T, G, D, S>(window)
      , StarCountSlidingWindowImpl<T, G, D, S>(window)
    {}

    virtual ~CountCountSlidingWindowImpl() {}

    void insert(TupleType const& tuple, PartitionType const& partition)
    {
        // Perform any actions necessary before inserting a tuple
        this->beforeTupleInserted();

        DataType& gdata = this->insertPartition(partition);
        CountStarSlidingWindowImpl<T, G, D, S>::evict(gdata, tuple, partition);
        CountStarSlidingWindowImpl<T, G, D, S>::insert(gdata, tuple, partition);
        StarCountSlidingWindowImpl<T, G, D, S>::trigger(gdata, tuple, partition);
    }

    virtual void partitionEvicted(PartitionType const& partition)
    {
        CountStarSlidingWindowImpl<T, G, D, S>::partitionEvicted(partition);
        StarCountSlidingWindowImpl<T, G, D, S>::partitionEvicted(partition);
        SlidingWindowImpl<T, G, D, S>::partitionEvicted(partition);
    }

#ifndef NDEBUG
    size_t hash() const
    {
        // Common base, right parent
        size_t result = SlidingWindowImpl<T, G, D, S>::hash();
        result ^= StarCountSlidingWindowImpl<T, G, D, S>::hash();
        return result;
    }
#endif

  protected:
    void doCheckpoint(Checkpoint& ckpt) const
    {
        // Common base, right parent
        SlidingWindowImpl<T, G, D, S>::doCheckpoint(ckpt);
        StarCountSlidingWindowImpl<T, G, D, S>::doCheckpoint(ckpt);
        WRITE_HASH(ckpt);
    }

    void doReset(Checkpoint& ckpt)
    {
        // Common base, right parent
        SlidingWindowImpl<T, G, D, S>::doReset(ckpt);
        StarCountSlidingWindowImpl<T, G, D, S>::doReset(ckpt);
        VERIFY_HASH(ckpt);
    }

    void doResetToInitialState(int cause)
    {
        // Right parent, common base
        StarCountSlidingWindowImpl<T, G, D, S>::doResetToInitialState(cause);
        SlidingWindowImpl<T, G, D, S>::doResetToInitialState(cause);
    }

    void print(std::ostream& stream) const
    {
        // Common base, right parent
        stream << "CountCountSlidingWindowImpl={";
        SlidingWindowImpl<T, G, D, S>::print(stream);
        stream << ", ";
        StarCountSlidingWindowImpl<T, G, D, S>::print(stream);
        stream << "}";
    }
};
};

#endif /* SPL_RUNTIME_WINDOW_IMPL_COUNT_COUNT_SLIDING_WINDOW_IMPL_H */
