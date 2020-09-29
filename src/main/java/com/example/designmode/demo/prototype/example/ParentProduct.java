package com.example.designmode.demo.prototype.example;

/**
 * @author george.zhang
 * @date 2020/9/29 16:23
 * @Description
 */
public class ParentProduct implements Cloneable {
    public Product createClone1() {
        Product p=null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
