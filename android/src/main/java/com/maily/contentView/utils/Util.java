package com.maily.contentView.utils;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeArray;
import com.google.gson.Gson;

public class Util {
    private static final String LinkerUtil = "LinkerUtil";
    private static Gson gson = new Gson();

    /**
     * This is used to invoke a JS function from native code. more suited in case of reactive programming.
     *
     * @param functionName
     * @param param
     * @param reactContext
     */
    public static void callJSfunction(String functionName, Object param, ReactContext reactContext) {
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        WritableNativeArray params = new WritableNativeArray();
        if (param != null) {
            String jsonObject = gson.toJson(param);
            params.pushString(jsonObject);
        }
        catalystInstance.callFunction(LinkerUtil, functionName, params);
    }

}
