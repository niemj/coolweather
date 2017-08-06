package com.example.jun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JUN on 2017/8/6.
 * "basic":{
 "city":"苏州",
 "cnty":"中国",
 "id":"CN101190401",
 "lat":"31.29937935",
 "lon":"120.61958313",
 "update":{
 "loc":"2017-08-05 21:51",
 "utc":"2017-08-05 13:51"}
 },
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }


}
