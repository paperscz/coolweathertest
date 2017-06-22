package com.shiyuan.coolweathertest.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yuetu-develop on 2017/6/21.
 */

public class HttpUtil {

    public static void sendOKHttpRequst(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
