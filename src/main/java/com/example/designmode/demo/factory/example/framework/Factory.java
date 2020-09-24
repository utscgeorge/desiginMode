package com.example.designmode.demo.factory.example.framework;

public abstract class Factory {

    public final Product create(String owner){
        Product product = createProduct(owner);
        registProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registProduct(Product product);
}
