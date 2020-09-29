package com.example.designmode.demo.singleton;

/**
 * @author george.zhang
 * @date 2020/9/29 11:11
 * @Description 懒汉式:synchronized导致效率不高
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if(singleton2==null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
