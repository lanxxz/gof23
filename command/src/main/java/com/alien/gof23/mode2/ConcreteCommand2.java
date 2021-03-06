package com.alien.gof23.mode2;

/**
 * program: gof23
 * description: 具体命令类
 *
 * @author: alien
 * @since: 2019/09/15 23:17
 */
public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
