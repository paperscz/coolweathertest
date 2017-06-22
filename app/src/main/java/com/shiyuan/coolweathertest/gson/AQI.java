package com.shiyuan.coolweathertest.gson;

/**
 * Created by yuetu-develop on 2017/6/21.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
