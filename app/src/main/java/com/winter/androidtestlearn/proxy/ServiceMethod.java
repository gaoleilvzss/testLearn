package com.winter.androidtestlearn.proxy;

import com.winter.androidtestlearn.proxy.annotation.GET;
import com.winter.androidtestlearn.proxy.annotation.POST;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/26
 * desc :
 */
public class ServiceMethod {
    public static class Builder {
        private final Annotation[] annotations;
        private final Annotation[][] parameterAnnotations;
        private EasyRetrofit easyRetrofit;

        public Builder(EasyRetrofit easyRetrofit, Method method) {

            this.easyRetrofit = easyRetrofit;
            annotations = method.getAnnotations();
            parameterAnnotations = method.getParameterAnnotations();
        }

        public ServiceMethod build() {
            /**
             * 处理方法上的注解
             */
            for (Annotation annotation : annotations) {
                if(annotation instanceof GET){

                }else if(annotation instanceof POST){

                }
            }


            return new ServiceMethod();
        }
    }
}
