package com.sina.deviceidjnisdk;

public class LcsGetKey {

    //固定写法，表示我们要加载的资源文件为libJNISimple.so
    static {
        System.loadLibrary("lcsGetKey");
    }
    public static native String getHwPubKey();

    public static native String getHwPrivateKey();
}
