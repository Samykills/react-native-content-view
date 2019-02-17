package com.maily.contentView;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ContentView extends LinearLayout {

    private View view = null;
    private Button buttonView = null;
    private TextView textView = null;

    public ContentView(@NonNull Context context) {
        super(context);
        view = View.inflate(context, R.layout.content_view, this);
        buttonView = view.findViewById(R.id.contentViewButton);
        buttonView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        textView = view.findViewById(R.id.contentViewText);
//        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void setContentViewText(String contentViewText) {
        textView.setText(contentViewText);
    }

    public void setContentViewTextSize(float contentViewTextSize) {
        textView.setTextSize(contentViewTextSize);
    }

    public void setButtonColor(String buttonBackgroundColor) {
        buttonView.setBackgroundColor(Color.parseColor(buttonBackgroundColor));
    }

    public void setButtonText(String buttonText) {
        buttonView.setText(buttonText);
    }

    public void setButtonTextColor(String buttonTextColor) {
        buttonView.setTextColor(Color.parseColor(buttonTextColor));
    }

}
