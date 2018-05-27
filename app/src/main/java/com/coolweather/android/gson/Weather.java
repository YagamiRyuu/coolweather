package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Yagami on 2018/5/27.
 */

public class Weather {

    /**
     * Weather类作为总的实例类来引用以上各个实体类
     */

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    //由于daily_forecast 中包含的是一个数组，因此这里用List集合来引用Forecast类
    public List<Forecast> forecastList;
}
