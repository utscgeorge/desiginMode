package com.example.designmode.demo.iterator.practice;

/**
 * @author george.zhang
 * @date 2020/9/28 16:43
 * @Description
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }



    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++;
        return book;
    }
}
