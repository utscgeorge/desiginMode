package com.example.designmode.demo.factory.example;

import com.example.designmode.demo.factory.example.framework.Factory;
import com.example.designmode.demo.factory.example.framework.Product;
import com.example.designmode.demo.factory.example.idcard.IdcardFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IdcardFactory();
        Product p1 = factory.create("小红");
        Product p2 = factory.create("小明");
        Product p3 = factory.create("小刘");
        p1.use();
        p2.use();
        p3.use();
        List owners = ((IdcardFactory) factory).getOwners();
        System.out.println(owners);
    }
}
