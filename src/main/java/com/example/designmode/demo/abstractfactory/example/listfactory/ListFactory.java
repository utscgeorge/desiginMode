package com.example.designmode.demo.abstractfactory.example.listfactory;

import com.example.designmode.demo.abstractfactory.example.factory.*;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String autho) {
        return new ListPage(title,autho);
    }
}
