package com.example.jun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JUN on 2017/8/6.
 * "daily_forecast":[
 {"astro":{
 "mr":"16:59",
 "ms":"02:52",
 "sr":"05:17",
 "ss":"18:51"},
 "cond":{
 "code_d":"300",
 "code_n":"101",
 "txt_d":"阵雨",
 "txt_n":"多云"},
 "date":"2017-08-05",
 "hum":"68",
 "pcpn":"18.1",
 "pop":"48",
 "pres":"1002",
 "tmp":{
 "max":"36",
 "min":"28"},
 "uv":"11",
 "vis":"14",
 "wind":{
 "deg":"334",
 "dir":"西北风",
 "sc":"微风",
 "spd":"5"}},
 {"astro":{
 "mr":"17:45",
 "ms":"03:42",
 "sr":"05:18",
 "ss":"18:50"},
 "cond":{
 "code_d":"101",
 "code_n":"101",
 "txt_d":"多云",
 "txt_n":"多云"},
 "date":"2017-08-06",
 "hum":"63",
 "pcpn":"0.3",
 "pop":"99",
 "pres":"1001",
 "tmp":{
 "max":"35",
 "min":"29"},
 "uv":"11",
 "vis":"18",
 "wind":{
 "deg":"266",
 "dir":"西风",
 "sc":"微风",
 "spd":"7"}},
 {"astro":{
 "mr":"18:28",
 "ms":"04:35",
 "sr":"05:19",
 "ss":"18:49"},
 "cond":{
 "code_d":"101",
 "code_n":"101",
 "txt_d":"多云",
 "txt_n":"多云"},
 "date":"2017-08-07",
 "hum":"59",
 "pcpn":"0.0",
 "pop":"30",
 "pres":"1000",
 "tmp":{
 "max":"36",
 "min":"28"},
 "uv":"11",
 "vis":"20",
 "wind":{
 "deg":"269",
 "dir":"西风",
 "sc":"微风",
 "spd":"10"}}],
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }

}
