package com.example.designmode.demo.iterator.example;

/**
 * @author george.zhang
 * @date 2020/9/28 16:49
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("Redis实战"));
        bookShelf.appendBook(new Book("springboot源码"));
        bookShelf.appendBook(new Book("spring源码"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book next = (Book) iterator.next();
            System.out.println(next.getName());
        }
    }
}
