package com.alien.gof23.template.mode1.impl;

import com.alien.gof23.template.mode1.AbstractDisplay;

/**
 * CharDisplay 类是 {@link AbstractDisplay} 的子类
 *
 * @author Alien
 * @since 2019/6/30 18:23
 */
public class StringDisplay extends AbstractDisplay {

    private String string;
    private int width;
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
