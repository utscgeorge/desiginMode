package com.example.designmode.demo.abstractfactory.example.listfactory;

import com.example.designmode.demo.abstractfactory.example.factory.Item;
import com.example.designmode.demo.abstractfactory.example.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {

    public ListPage(String title,String author){
        super(title,author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = items.iterator();
        while(iterator.hasNext()){
            buffer.append(iterator.next().makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+author+"</address>\n");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
