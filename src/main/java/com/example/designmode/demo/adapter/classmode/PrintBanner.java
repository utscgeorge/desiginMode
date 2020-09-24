package com.example.designmode.demo.adapter.classmode;

public class PrintBanner extends Banner implements Print{

    public String str;

    public PrintBanner(String str){
        this.str = str;
    }

    @Override
    public void printWeak() {
        showWithPara(str);
    }

    @Override
    public void printStrong() {
        showWithAster(str);
    }
}
