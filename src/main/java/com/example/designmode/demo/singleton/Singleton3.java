package com.example.designmode.demo.singleton;

/**
 * @author george.zhang
 * @date 2020/9/29 11:14
 * @Description 双重加锁检查保证线程安全,volatile保证生成实例顺序正确
 */
public class Singleton3 {

    private volatile static Singleton3 singleton3 =null;

    private Singleton3(){};

    public static Singleton3 getInstance(){
        if(singleton3 ==null){
            synchronized (Singleton3.class){
                if(singleton3==null){
                    singleton3=new Singleton3();
                }
            }
        }
        return singleton3;
    }

}
