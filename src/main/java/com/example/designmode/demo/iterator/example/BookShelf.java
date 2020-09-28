package com.example.designmode.demo.iterator.example;

/**
 * @author george.zhang
 * @date 2020/9/28 16:38
 * @Description
 */
public class BookShelf implements Aggregate {

    private Book[] bookShelf;
    private int last=0;

    public BookShelf(int maxsize){
        bookShelf = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return bookShelf[index];
    }

    public void appendBook(Book book){
        this.bookShelf[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
