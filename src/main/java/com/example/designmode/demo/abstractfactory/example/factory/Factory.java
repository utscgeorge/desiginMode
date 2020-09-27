package com.example.designmode.demo.abstractfactory.example.factory;

import org.apache.commons.lang.exception.ExceptionUtils;

public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        }catch (Exception e){
            ExceptionUtils.getFullStackTrace(e);
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title,String autho);

}
