#
# Copyright 2021 IBM Corporation
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

file(GLOB SOURCES RELATIVE ${CMAKE_CURRENT_SOURCE_DIR} *.cpp)

list(REMOVE_ITEM SOURCES 
  XmlTest.cpp)

add_format_target(spl_testsrc_runtime_format SOURCES)

#
# NOTE(xrg): TumblingWindow.h uses a BOOST_STATIC_ASSERT that does not play
# well with clang-tidy. Once this is fixed, please uncomment the line below:
#
# add_lint_target(spl_testsrc_runtime_lint gnu++03 SOURCES)
#

foreach(SOURCE ${SOURCES})
  get_filename_component(FILENAME ${SOURCE} NAME_WE)
  CamelToSnakeWithSep(BINARY ${FILENAME} "-")
  add_executable(${BINARY} ${SOURCE})
  target_link_libraries(${BINARY} -Wl,-z,defs streams-spl-compiler)
  add_test(NAME ${BINARY}-test COMMAND ${BINARY})
  set_property(TEST ${BINARY}-test PROPERTY ENVIRONMENT
    "STREAMS_INSTALL=${INSTALL_DIR}")
endforeach()
