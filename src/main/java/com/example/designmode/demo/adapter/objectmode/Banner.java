package com.example.designmode.demo.adapter.objectmode;

public class Banner {
    public String str;
    public Banner(String str){
        this.str = str;
    }
    public void showWithPara(){
        System.out.println("("+str+")");
    }
    public void showWithAster(){
        System.out.println("*"+str+"*");
    }

}
