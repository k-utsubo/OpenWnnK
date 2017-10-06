
cmake_minimum_required(VERSION 3.4.1)

add_library(
             libWnnEngDic
             SHARED
             WnnEngDic.c)


find_library(
              log-lib
              log )


target_link_libraries(
                       libWnnEngDic
                       ${log-lib} )