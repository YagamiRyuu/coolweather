package com.coolweather.android.gson;

/**
 * Created by Yagami on 2018/5/27.
 */

/**
 * 在创建五个实体类的过程中，我们使用了@SerializedName() 来命名JSON中的一些字段
 * 由于JSON中的一些字段不适合直接用来使用，因为不好理解
 * 所以可以使用@SerializedName()的方式，将JSON字段写在里面，然后在下面一行写上需要用的命名
 */
public class AQI {

    public AQICITY city;

    public class AQICITY{

        public String aqi;//空气质量指数

        public String co;//一氧化碳指数

        public String no2;//二氧化氮指数

        public String o3;//臭氧指数

        public String pm10;//PM10指数

        public String pm25;//PM2.5指数

        public String qlty;//空气质量（优/良/轻度污染/中度污染/重度污染/严重污染）

        public String so2;//二氧化硫指数
    }
}