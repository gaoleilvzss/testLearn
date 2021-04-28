package com.winter.lib_java_lean.generic;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/25
 * desc :
 */
public class NormalGeneric<T> {
    protected T data;
    public NormalGeneric(T data){
        this.data = data;
    }
    public NormalGeneric(){}
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        NormalGeneric<String> normalGeneric = new NormalGeneric<>();
        normalGeneric.setData("test");
        System.out.println(normalGeneric.getData());
        System.out.println(normalGeneric.test("test","a","add"));
    }

    /**
     * 泛型方法
     */
    public <K> K test(K... a){
        return a[0];
    }

    //? extends XX  表示泛型的上届 安全访问
    //？ super XX 表示泛型的下届 数据写入
    //泛型擦出 如果没有extends 虚拟机为object
    // 如果有extends 擦除后为第一个类型
}
