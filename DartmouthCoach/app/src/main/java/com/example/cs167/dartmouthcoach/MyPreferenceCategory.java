package com.example.cs167.dartmouthcoach;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by xinbeifu on 5/17/17.
 */

public class MyPreferenceCategory extends PreferenceCategory {

    public MyPreferenceCategory(Context context){
        super(context);
    }

    public MyPreferenceCategory(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public MyPreferenceCategory(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }

    @Override
    protected void onBindView(View view){
        super.onBindView(view);
        TextView titleView = (TextView) view.findViewById(android.R.id.title);
        titleView.setTextColor(getContext().getColor(R.color.color1));
    }
}
