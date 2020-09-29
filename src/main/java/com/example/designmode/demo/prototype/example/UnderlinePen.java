package com.example.designmode.demo.prototype.example;

/**
 * @author george.zhang
 * @date 2020/9/29 15:13
 * @Description
 */
public class UnderlinePen extends ParentProduct implements Product {

    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar=ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""+s+"\"");
        System.out.print(" ");
        for(int i=0;i<length;i++){
            System.out.print(ulchar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        return createClone1();
    }
}
