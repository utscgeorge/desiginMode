package com.example.designmode.demo.adapter.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties implements FileIO{
    Properties properties = new Properties();
    @Override
    public void readFromFile(String filename) throws Exception {
        InputStream inputStream = new FileInputStream(filename);
        properties.load(inputStream);
    }

    @Override
    public void writeToFile(String filename) throws Exception {
        OutputStream outputStream = new FileOutputStream(filename);
        properties.store(outputStream,"new file");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
