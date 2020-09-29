package com.example.designmode.demo.prototype.example;

/**
 * @author george.zhang
 * @date 2020/9/29 15:03
 * @Description
 */
public class MessageBox extends ParentProduct implements Product {

    private char decoChar;
    public MessageBox(char decoChar){
        this.decoChar=decoChar;
    }


    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i=0;i<length+4;i++){
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar+" "+s+" "+decoChar);
        for(int i=0;i<length+4;i++){
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        return createClone1();
    }
}
