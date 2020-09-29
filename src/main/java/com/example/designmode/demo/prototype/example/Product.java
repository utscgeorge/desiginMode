package com.example.designmode.demo.prototype.example;

/**
 * @author george.zhang
 * @date 2020/9/29 14:56
 * @Description
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
