package com.winter.androidtestlearn.click;

import android.app.Activity;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/27
 * desc :
 */
public class ClickUtils {
    public static void init(Activity activity){
        Class<? extends Activity> aClass = activity.getClass();
        //获取所有方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
        }
    }
}
