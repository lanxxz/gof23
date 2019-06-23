package com.alien.gof23.iterator.method1.bean;

/**
 * 书的类
 *
 * @author Alien
 * @since 2019/6/23 21:42
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
