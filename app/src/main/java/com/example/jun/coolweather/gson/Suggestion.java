package com.example.jun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JUN on 2017/8/6.
 * "suggestion":{
 "air":{
 "brf":"良",
 "txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},
 "comf":{
 "brf":"较不舒适",
 "txt":"白天天气多云，同时会感到有些热，不很舒适。"},
 "cw":{
 "brf":"较适宜",
 "txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},
 "drsg":{
 "brf":"炎热",
 "txt":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"},
 "flu":{
 "brf":"少发",
 "txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},
 "sport":{
 "brf":"较不宜",
 "txt":"天气较好，但风力较强，在户外要选择合适的运动，另外考虑到天气炎热，建议停止高强度运动。"},
 "trav":{
 "brf":"一般",
 "txt":"天气较好，温度高，让人感觉热，幸好风比较大，能缓解炎热的天气。外出旅游请注意防暑降温和防晒。"},
 "uv":{
 "brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}}
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }

}
