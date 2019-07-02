package com.alien.gof23.mode1;

import com.alien.gof23.mode1.impl.CharDisplay;
import com.alien.gof23.mode1.impl.StringDisplay;

/**
 * 主入口
 *
 * @author Alien
 * @since 2019/6/30 18:28
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('H');
        StringDisplay stringDisplay = new StringDisplay("Hello,world!");
        StringDisplay stringDisplay1 = new StringDisplay("你好，世界！");

        charDisplay.display();
        stringDisplay.display();
        stringDisplay1.display();
    }
}
