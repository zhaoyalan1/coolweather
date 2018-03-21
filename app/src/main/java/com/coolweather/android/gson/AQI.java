package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhaoyalan on 18/3/16.
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;
        public String pm25;
    }
}
