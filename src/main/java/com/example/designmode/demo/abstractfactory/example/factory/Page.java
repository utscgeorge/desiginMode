package com.example.designmode.demo.abstractfactory.example.factory;

import org.apache.commons.lang.exception.ExceptionUtils;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> items = new ArrayList<>();
    public Page(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        items.add(item);
    }

    public void output(){
        try {
            String filename = title + ".txt";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename+"编写完成");
        }catch (Exception e){
            ExceptionUtils.getFullStackTrace(e);
        }
    }

    public abstract String makeHTML();

}
