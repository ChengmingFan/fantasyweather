package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Fan on 2018/3/11.
 */

public class Weather {
   public String status;
   public Basic basic;
   public AQI aqi;
   public Now now;
   public Suggestion suggestion;
   @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
