package com.example.designmode.demo.abstractfactory.example;

import com.example.designmode.demo.abstractfactory.example.factory.Factory;
import com.example.designmode.demo.abstractfactory.example.factory.Link;
import com.example.designmode.demo.abstractfactory.example.factory.Page;
import com.example.designmode.demo.abstractfactory.example.factory.Tray;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(Factory.class.getName());

        Link people = factory.createLink("renmingdaily", "http://www.people.com.cn/");
        Link gmw = factory.createLink("gwmdaily", "http://www.gmw.com/");

        Link us_yahoo = factory.createLink("Yahoo", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo,Japan", "http://yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link goolge = factory.createLink("Goolge", "http://www.google.com/");

        Tray traynews = factory.createTray("daily");
        traynews.add(people);
        traynews.add(gmw);


        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("search");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(goolge);

        Page page = factory.createPage("LinkPage", "ZHANGHU");
        page.add(traynews);
        page.add(traysearch);
        page.output();


    }
}
