package com.example.a0325_2;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
    this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
     mainActivity.mTextView1.setText("You Clicked JE의 Button!");

    }
}
