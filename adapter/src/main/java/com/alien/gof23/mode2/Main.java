package com.alien.gof23.mode2;

import com.alien.gof23.mode1.Print;

/**
 * 主入口
 *
 * @author Alien
 * @since 2019/6/24 23:10
 */
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
