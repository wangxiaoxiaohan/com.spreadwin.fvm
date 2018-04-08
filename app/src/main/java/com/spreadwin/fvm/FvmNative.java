package com.spreadwin.fvm;

import android.util.Log;

/**
 * Created by LHD on 2018/4/8.
 */

public class FvmNative {
    static{
        try{
            Log.d("FVM","loadlibrary so");
            System.loadLibrary("fvm_spreadwin");
        }catch(UnsatisfiedLinkError e){
            e.printStackTrace();
            Log.e("FVM","loadlibrary so == "+e);
        }
    }
    public static native String fvmReadVersion();
    public static native int fvmUpdate();
    public static native int fvmSetAngleWidth(int angle, int width, int prop);
    public static native int fvmGetDirectAngle();
    public static native int fvmGetDirectWidth();
}
