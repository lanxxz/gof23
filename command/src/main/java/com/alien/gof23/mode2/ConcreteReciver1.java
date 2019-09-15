package com.alien.gof23.mode2;

/**
 * program: gof23
 * description: 具体的接收者
 *
 * @author: alien
 * @since: 2019/09/15 23:11
 */
public class ConcreteReciver1 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("ConcreteReciver1 do something...");
    }
}
