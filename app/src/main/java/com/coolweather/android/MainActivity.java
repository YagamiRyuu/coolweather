package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //缓存数据判断
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //缓存数据判断
        if (prefs.getString("weather", null) != null) {
            //不为空说明之前已经请求过天气数据
            //直接跳转到WeatherAcitivity
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
