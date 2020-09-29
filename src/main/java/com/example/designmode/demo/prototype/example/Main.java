package com.example.designmode.demo.prototype.example;

/**
 * @author george.zhang
 * @date 2020/9/29 14:55
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.registry("strong message",underlinePen);
        manager.registry("warn box",messageBox1);
        manager.registry("slash box",messageBox2);

        Product strong_message = manager.create("strong message");
        strong_message.use("Hello World");
        Product warn_box = manager.create("warn box");
        warn_box.use("Hello World");
        Product slash_box = manager.create("slash box");
        slash_box.use("Hello World");
        System.out.println(underlinePen==strong_message);

    }
}
