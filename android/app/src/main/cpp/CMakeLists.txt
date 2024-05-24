cmake_minimum_required(VERSION 3.4.1)

set(LIB_NAME "adder")

add_library(${LIB_NAME} SHARED adder.cpp)

find_library(log-lib log)

include_directories(${CMAKE_SOURCE_DIR}/src/main/cpp)
include_directories(${CMAKE_SOURCE_DIR}/../../../.cxx/Debug/4no4r4g3/arm64-v8a)

target_link_libraries(${LIB_NAME} ${log-lib})
