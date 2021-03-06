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

//----------------------------------------------------------------------------
//
// Title-
//       Product.h
//
// Purpose-
//       Product level information
//
//----------------------------------------------------------------------------
#ifndef _PRODUCT_H_
#define _PRODUCT_H_

#include <UTILS/UTILSTypes.h>
#include <string>

UTILS_NAMESPACE_BEGIN

class Product
{

    /// Product level information
  public:
    /// Get the product name (e.g., "InfoSphere Streams")
    /// @return the product name
    static const std::string& getName();

    /// Get the product's version (e.g., "1.0")
    /// @return the product version
    static const std::string& getVersion();

    /// Get the install directory pathname (e.g., "/opt/ibm/streams")
    /// (this just abstracts out the fact that this info is currently
    /// captured in the STREAMS_INSTALL EV ... whose name should
    /// be changed).
    /// @return the install dir path
    static const std::string getInstallDir();

    /// Destructor
    virtual ~Product(void) throw();
};

UTILS_NAMESPACE_END

#endif

// Local Variables: ***
// mode:c++ ***
// End: ***
