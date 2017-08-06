package com.example.jun.coolweather.gson;

/**
 * Created by JUN on 2017/8/6.
 * "aqi":{
 "city":{
 "aqi":"83",
 "co":"1",
 "no2":"73",
 "o3":"62",
 "pm10":"102",
 "pm25":"61",
 "qlty":"良",
 "so2":"8"}
 },
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;
        public String pm25;
    }
}
