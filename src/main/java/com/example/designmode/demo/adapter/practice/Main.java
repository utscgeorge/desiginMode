package com.example.designmode.demo.adapter.practice;


import org.apache.commons.lang.exception.ExceptionUtils;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year","2004");
            fileIO.setValue("month","4");
            fileIO.setValue("day","21");
            fileIO.writeToFile("newfile.txt");
        }catch (Exception e){
            ExceptionUtils.getFullStackTrace(e);
        }
    }
}
