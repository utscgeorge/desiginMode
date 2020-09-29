package com.example.designmode.demo.singleton;

/**
 * @author george.zhang
 * @date 2020/9/29 11:18
 * @Description 静态内部类,延迟加载,线程安全,推荐使用
 */
public class Singleton4 {

    private static class SingletonInnerClass{
        public static final Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4(){}

    public static Singleton4 getInstance(){
        return SingletonInnerClass.singleton4;
    }
}
