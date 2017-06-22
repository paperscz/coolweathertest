package com.shiyuan.coolweathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yuetu-develop on 2017/6/21.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public  More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }

}
