package com.alien.gof23.method1;

import com.alien.gof23.method1.bean.Book;
import com.alien.gof23.method1.bean.BookShelf;

import java.util.Iterator;

/**
 * 入口类
 *
 * @author Alien
 * @since 2019/6/23 21:58
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("第一本书"));
        bookShelf.appendBook(new Book("第二本书"));
        bookShelf.appendBook(new Book("第三本书"));
        bookShelf.appendBook(new Book("第四本书"));
        bookShelf.appendBook(new Book("第五本书"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
    }
}
