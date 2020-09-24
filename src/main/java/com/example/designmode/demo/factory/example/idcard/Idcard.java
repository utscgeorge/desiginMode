package com.example.designmode.demo.factory.example.idcard;

import com.example.designmode.demo.factory.example.framework.Product;

public class Idcard extends Product {

    private String owner;
    private String number;
    Idcard(String owner,String number){
        System.out.println("生产了"+owner+"的ID卡,编号:"+number);
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println("使用了"+owner+"的ID卡,编号:"+number);
    }

    public String getOwner(){
        return owner+":"+number;
    }

}
