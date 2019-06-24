package com.alien.gof23.adapter.mode1;

/**
 * 入口类
 *
 * @author Alien
 * @since 2019/6/24 23:00
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
