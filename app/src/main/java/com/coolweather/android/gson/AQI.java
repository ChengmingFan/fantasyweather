package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Fan on 2018/3/12.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
