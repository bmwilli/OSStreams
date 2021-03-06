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

#ifndef SPL_RUNTIME_UTILITY_VISIBILITY_H
#define SPL_RUNTIME_UTILITY_VISIBILITY_H

#if __GNUC__
#define PUSH_DLL_PUBLIC _Pragma("GCC visibility push(default)");
#define PUSH_DLL_HIDDEN _Pragma("GCC visibility push(hidden)");
#define POP_DLL_PUBLIC _Pragma("GCC visibility pop");
#define POP_DLL_HIDDEN _Pragma("GCC visibility pop");
#define DLL_PUBLIC __attribute__((visibility("default")))
#define DLL_HIDDEN __attribute__((visibility("hidden")))
#else
#define PUSH_DLL_PUBLIC
#define PUSH_DLL_HIDDEN
#define POP_DLL_PUBLIC
#define POP_DLL_HIDDEN
#define DLL_PUBLIC
#define DLL_HIDDEN
#endif

#endif /* SPL_RUNTIME_UTILITY_VISIBILITY_H */
