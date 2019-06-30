package com.alien.gof23.template.mode1.impl;

import com.alien.gof23.template.mode1.AbstractDisplay;

/**
 * CharDisplay 类是 {@link AbstractDisplay} 的子类
 *
 * @author Alien
 * @since 2019/6/30 18:19
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
