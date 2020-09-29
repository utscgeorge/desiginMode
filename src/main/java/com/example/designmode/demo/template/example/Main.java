package com.example.designmode.demo.template.example;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author george.zhang
 * @date 2020/9/29 9:59
 * @Description
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("filename.txt");

        AbstractDiaplay charDiaplay = new CharDiaplay('H');
        AbstractDiaplay stringDiaplay = new StringDiaplay("Hello World.");
        charDiaplay.display();
        stringDiaplay.display();
    }
}
