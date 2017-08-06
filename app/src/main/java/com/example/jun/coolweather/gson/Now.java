package com.example.jun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JUN on 2017/8/6.
 * "now":{
 "cond":{
 "code":"101",
 "txt":"多云"},
 "fl":"34",
 "hum":"89",
 "pcpn":"0",
 "pres":"1002",
 "tmp":"29",
 "vis":"5",
 "wind":{
 "deg":"3",
 "dir":"北风",
 "sc":"微风",
 "spd":"3"}},
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }


}
