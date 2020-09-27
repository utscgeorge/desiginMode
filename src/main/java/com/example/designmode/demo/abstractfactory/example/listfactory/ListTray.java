package com.example.designmode.demo.abstractfactory.example.listfactory;

import com.example.designmode.demo.abstractfactory.example.factory.Item;
import com.example.designmode.demo.abstractfactory.example.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {

    public ListTray(String caption){
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<li>\n");
        stringBuffer.append(caption+"\n");
        stringBuffer.append("<ul>\n");
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()){
            stringBuffer.append(iterator.next().makeHTML());
        }
        stringBuffer.append("</ul>\n");
        stringBuffer.append("</li>\n");
        return stringBuffer.toString();
    }
}
