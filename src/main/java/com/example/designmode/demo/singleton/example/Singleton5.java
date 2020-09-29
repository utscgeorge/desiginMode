package com.example.designmode.demo.singleton.example;

/**
 * @author george.zhang
 * @date 2020/9/29 11:21
 * @Description 枚举实现,天然单例,线程安全推荐使用
 */
public enum  Singleton5 {
    SINGLETON_5;
    public void method(){
        System.out.println("singtelon success");
    }
}
