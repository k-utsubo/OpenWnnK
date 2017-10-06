
cmake_minimum_required(VERSION 3.4.1)

set(INCLUDE_DIR include)
include_directories (${INCLUDE_DIR})

add_library(
             libwnndict
             SHARED
             OpenWnnDictionaryImplJni.c
             	engine/ndapi.c
             	engine/neapi.c
             	engine/ndbdic.c
             	engine/ndfdic.c
             	engine/ndldic.c
             	engine/ndrdic.c
             	engine/necode.c
             	engine/ndcommon.c
             	engine/nj_str.c
             	include/nj_dic.h
             	include/nj_err.h
             	include/nj_ext.h
             	include/nj_lib.h
             	include/njd.h
             	include/njx_lib.h
             	)


find_library(
              log-lib
              log )


target_link_libraries(
                       libwnndict
                       ${log-lib} )