package com.example.designmode.demo.factory.example.idcard;

import com.example.designmode.demo.factory.example.framework.Factory;
import com.example.designmode.demo.factory.example.framework.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IdcardFactory extends Factory {

    public List<Idcard> list = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new Idcard(owner, UUID.randomUUID().toString());
    }

    @Override
    protected void registProduct(Product product) {
        list.add((Idcard) product);
    }

    public List getOwners(){
        return list;
    }

}
