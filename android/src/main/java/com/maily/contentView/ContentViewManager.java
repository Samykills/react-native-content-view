package com.maily.contentView;

import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ContentViewManager extends SimpleViewManager {
    @Override
    public String getName() {
        return "ContentView";
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        return new ContentView(reactContext);
    }

    @ReactProp(name = "text")
    public void setContentViewText(ContentView contentView, String contentViewText) {
        contentView.setContentViewText(contentViewText);
    }

    @ReactProp(name = "textSize")
    public void setContentViewTextSize(ContentView contentView, float contentViewText) {
        contentView.setContentViewTextSize(contentViewText);
    }

    @ReactProp(name = "buttonColor")
    public void setButtonColor(ContentView contentView, String buttonColor) {
        contentView.setButtonColor(buttonColor);
    }

    @ReactProp(name = "buttonText")
    public void setButtonText(ContentView contentView, String buttonText) {
        contentView.setButtonText(buttonText);
    }

    @ReactProp(name="buttonTextColor")
    public void setButtonTextColor(ContentView contentView,String buttonTextColor){
        contentView.setButtonTextColor(buttonTextColor);
    }
}
