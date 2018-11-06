//
// Created by Jingdong on 2018/11/5.
//
//引入上面生成的头文件，并实现头文件中声明的方法
#include "com_pang_sopang_testso_JniUtils.h"
JNIEXPORT jstring JNICALL Java_com_sina_deviceidjnisdk_LcsGetKey_getHwPubKey
        (JNIEnv *env, jobject obj){
    char *str="this is pub key";
    return (*env)->NewStringUTF(env, str);
}
JNIEXPORT jstring JNICALL Java_com_sina_deviceidjnisdk_LcsGetKey_getHwPrivateKey
        (JNIEnv *env, jobject obj){
    char *str="this is private key";
    return (*env)->NewStringUTF(env, str);
}

