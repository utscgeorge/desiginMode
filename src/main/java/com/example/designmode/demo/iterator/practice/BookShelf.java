package com.example.designmode.demo.iterator.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author george.zhang
 * @date 2020/9/28 16:38
 * @Description 将数值改成List集合同样运行,说明Iterator可以将集合的实现和迭代分离
 */
public class BookShelf implements Aggregate {

    private List<Book> bookShelf;

    public BookShelf(int initSize){
        bookShelf = new ArrayList<>(initSize);
    }

    public Book getBookAt(int index){
        return bookShelf.get(index);
    }

    public void appendBook(Book book){
        this.bookShelf.add(book);
    }

    public int getLength(){
        return this.bookShelf.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
