package com.alien.gof23.iterator.method1.bean;

import java.util.Iterator;

/**
 * 实现了 Itertor 类, 包含了遍历集合所必要的信息
 *
 * @author Alien
 * @since 2019/6/23 21:48
 */
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength()? true: false;
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

}
