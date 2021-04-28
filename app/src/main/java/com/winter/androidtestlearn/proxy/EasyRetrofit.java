package com.winter.androidtestlearn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/26
 * desc :
 */
public class EasyRetrofit {
    final Map<Method, ServiceMethod> serviceMethodCache = new ConcurrentHashMap<>();
    public <T> T create(Class<T> service) {
        return (T) Proxy.newProxyInstance(service.getClassLoader(), new Class[]{service}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
    }

    private ServiceMethod loadMethod(Method method){
        ServiceMethod serviceMethod = serviceMethodCache.get(method);
        if(serviceMethod != null){
            return serviceMethod;
        }
        synchronized (serviceMethodCache){
            serviceMethod = serviceMethodCache.get(method);
            if(serviceMethod == null){
                serviceMethod = new ServiceMethod.Builder(this, method).build();
                serviceMethodCache.put(method, serviceMethod);
            }
        }
        return serviceMethod;
    }
}
