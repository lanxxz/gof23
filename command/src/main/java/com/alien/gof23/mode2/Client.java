package com.alien.gof23.mode2;

/**
 * program: gof23
 * description: 请求者
 *
 * @author: alien
 * @since: 2019/09/15 23:20
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReciver1();
        Command command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();
    }

}
