package com.example.designmode.demo.singleton.example;

/**
 * @author george.zhang
 * @date 2020/9/29 11:26
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Singleton5.SINGLETON_5.method();

        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        if(instance1 == instance2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
