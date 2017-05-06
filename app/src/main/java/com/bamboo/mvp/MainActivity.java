package com.bamboo.mvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bamboo.mvp.x.XActivity;
import com.bamboo.mvp.x.XContract;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testX(View view) {
        Intent intent = new Intent(this, XActivity.class);
        intent.putExtra(XContract.PARAM_INT_A, 10);
        intent.putExtra(XContract.PARAM_INT_B, 20);
        startActivity(intent);
    }
}
