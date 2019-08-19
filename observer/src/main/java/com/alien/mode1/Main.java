package com.alien.mode1;

/**
 * @program: gof23
 * @description: 主入口
 * @author: alien
 * @since: 2019/08/19 23:25
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        generator.addObserver(digitObserver).addObserver(graphObserver);
        generator.execute();
    }
}
