// android/app/src/main/java/com/adderapp/AdderModule.java
package com.adderapp;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class AdderModule extends ReactContextBaseJavaModule {
    static {
        System.loadLibrary("adder");
    }

    public AdderModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "AdderModule";
    }

    public native int add(int a, int b);

    @ReactMethod
    public void addNumbers(int a, int b, Promise promise) {
        try {
            int result = add(a, b);
            promise.resolve(result);
        } catch (Exception e) {
            promise.reject("Error", e);
        }
    }
}
