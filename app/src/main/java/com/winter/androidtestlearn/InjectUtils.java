package com.winter.androidtestlearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/26
 * desc :
 */
public class InjectUtils {

    public static void init(Activity activity) {
        Class<? extends Activity> aClass = activity.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(InjectView.class)) {
                InjectView annotation = declaredField.getAnnotation(InjectView.class);
                if (annotation != null) {
                    int value = annotation.value();
                    View view = activity.findViewById(value);
                    //反射设置属性
                    declaredField.setAccessible(true);
                    try {
                        declaredField.set(activity, view);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void initAutoWired(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            Class<? extends Activity> aClass = activity.getClass();
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                if (declaredField.isAnnotationPresent(AutoWired.class)) {
                    AutoWired annotation = declaredField.getAnnotation(AutoWired.class);
                    String key = TextUtils.isEmpty(annotation.value()) ? declaredField.getName() : annotation.value();
                    if(extras.containsKey(key)){
                        Object obj = extras.get(key);
                        Class<?> componentType = declaredField.getType().getComponentType();
                        if(declaredField.getType().isArray()&& Parcelable.class.isAssignableFrom(componentType)){
                            Object[] objs = (Object[]) obj;
                            Object[] objects = Arrays.copyOf(objs, objs.length, (Class<? extends Object[]>) declaredField.getType());
                            obj = objects;
                        }
                        declaredField.setAccessible(true);
                        declaredField.set(activity,obj);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
