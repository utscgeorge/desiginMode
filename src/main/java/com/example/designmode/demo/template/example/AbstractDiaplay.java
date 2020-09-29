package com.example.designmode.demo.template.example;

/**
 * @author george.zhang
 * @date 2020/9/29 9:49
 * @Description
 */
public abstract class AbstractDiaplay {
    public final void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();
}
