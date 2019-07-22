package com.alien.gof23.mode1;

/**
 * TODO
 *
 * @author alien
 * @since 2019-07-22 21:13
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, world!"));
        Display d2 = new Display(new StringDisplayImpl("Hello, unvierse."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, China!"));
        d1.display();
        System.out.println();
        d2.display();
        System.out.println();
        d3.display();
        System.out.println();
        d3.multiDisplay(3);
        // 扩展
        IncreaseDisplay increaseDisplay = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay display = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        increaseDisplay.increaseDisplay(4);
        System.out.println();
        display.increaseDisplay(6);
    }
}
