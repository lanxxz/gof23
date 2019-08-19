package com.alien.mode1;

/**
 * @program: gof23
 * @description: 以*形式表示数值的简单图表类
 * @author: alien
 * @since: 2019/08/19 23:23
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        for (int i = 0; i < generator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
