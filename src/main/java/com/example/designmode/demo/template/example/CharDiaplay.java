package com.example.designmode.demo.template.example;

/**
 * @author george.zhang
 * @date 2020/9/29 9:51
 * @Description
 */
public class CharDiaplay extends AbstractDiaplay {

    public Character character;

    public CharDiaplay(Character character){
        this.character = character;
    }


    @Override
    public void open() {
        System.out.print("<<<");
    }

    @Override
    public void print() {
        System.out.print(character);
    }

    @Override
    public void close() {
        System.out.println(">>>");
    }
}
