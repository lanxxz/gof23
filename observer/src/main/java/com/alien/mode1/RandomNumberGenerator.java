package com.alien.mode1;

import java.util.Random;

/**
 * @program: gof23
 * @description: {@link NumberGenerator} 的子类,它会生成随机数
 * @author: alien
 * @since: 2019/08/19 23:17
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObserver();
        }
    }
}
