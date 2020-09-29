package com.example.designmode.demo.prototype.example;

import java.util.HashMap;

/**
 * @author george.zhang
 * @date 2020/9/29 14:58
 * @Description 用于封装具体原型的克隆方法
 */
public class Manager {

    private HashMap<String,Product> proto  =new HashMap<>();

    public void registry(String name,Product product){
        this.proto.put(name,product);
    }

    public Product create(String protoname){
        Product product = proto.get(protoname);
        Product clone = product.createClone();
        return clone;
    }

}
