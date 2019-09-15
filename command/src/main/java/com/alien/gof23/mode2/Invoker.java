package com.alien.gof23.mode2;

/**
 * program: gof23
 * description: 发动着
 *
 * @author: alien
 * @since: 2019/09/15 23:19
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command =command;
    }

    public void action() {
        command.execute();
    }

}
