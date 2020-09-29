package com.example.designmode.demo.template.example;

/**
 * @author george.zhang
 * @date 2020/9/29 9:54
 * @Description
 */
public class StringDiaplay extends AbstractDiaplay {

    private String str;
    private int width;

    public StringDiaplay(String str){
        this.str=str;
        this.width=str.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+str+"|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
