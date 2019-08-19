package com.alien.mode1;

/**
 * @program: gof23
 * @description: 以数字形式显示观察到的数值
 * @author: alien
 * @since: 2019/08/19 23:20
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
