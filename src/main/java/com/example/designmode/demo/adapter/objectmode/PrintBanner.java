package com.example.designmode.demo.adapter.objectmode;

public class PrintBanner extends Print {
    private Banner banner;
    PrintBanner(String str){
        banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithPara();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
