package com.alien.gof23.mode2;

/**
 * program: gof23
 * description: 请求者 <br/>
 * 请求者 创建 命令 <br/>
 * 发动者 执行 命令 <br/>
 * 接受者 实施 命令 <br/>
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
