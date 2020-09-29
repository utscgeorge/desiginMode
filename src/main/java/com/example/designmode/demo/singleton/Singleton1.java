package com.example.designmode.demo.singleton;

/**
 * @author george.zhang
 * @date 2020/9/29 11:08
 * @Description 饿汉式:没有使用也会加载到内存,消耗内存资源
 */
public class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton1;
    }

}
