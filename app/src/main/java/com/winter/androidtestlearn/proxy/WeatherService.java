package com.winter.androidtestlearn.proxy;

import com.winter.androidtestlearn.proxy.annotation.Field;
import com.winter.androidtestlearn.proxy.annotation.GET;
import com.winter.androidtestlearn.proxy.annotation.POST;
import com.winter.androidtestlearn.proxy.annotation.Query;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/26
 * desc :
 */
public interface WeatherService {
    @GET("/v/e")
    void getWeather(@Query("city") String city, @Query("key") String key);

    @POST("/v/e")
    void getWeatherPost(@Field("city") String city, @Field("key") String key);
}
