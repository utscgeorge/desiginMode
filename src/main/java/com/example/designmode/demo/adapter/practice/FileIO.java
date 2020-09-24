package com.example.designmode.demo.adapter.practice;

public interface FileIO {

    public void readFromFile(String filename) throws Exception;
    public void writeToFile(String filename) throws Exception;
    public void setValue(String key,String value);
    public String getValue(String key);
}
