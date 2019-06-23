package com.alien.gof23.iterator.method1.bean;

import com.alien.gof23.iterator.method1.Aggregate;

import java.util.Iterator;

/**
 * 表示书架的类
 *
 * @author Alien
 * @since 2019/6/23 21:43
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    /**
     * @author Alien
     * @description 添加书籍
     * @date 21:55 2019/6/23
     * @param book
     **/
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    /**
     * @author Alien
     * @description 返回第 index 本书
     * @date 21:54 2019/6/23
     * @param index 索引，表示第几本书
     * @return com.alien.gof23.iterator.method1.bean.Book
     **/
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * @author Alien
     * @description 返回总的书本
     * @date 21:54 2019/6/23
     * @return int
     **/
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
