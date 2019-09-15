package com.alien.gof23.mode2;

/**
 * program: gof23
 * description: 具体接收者
 *
 * @author: alien
 * @since: 2019/09/15 23:12
 */
public class ConcreteReciver2 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("ConcreteReciver2 do something...");
    }
}
