package com.example.designmode.demo.abstractfactory.example.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item{
    protected List<Item> items = new ArrayList<>();
    public Tray(String caption){
        super(caption);
    }
    public void add(Item item){
        items.add(item);
    }
}
