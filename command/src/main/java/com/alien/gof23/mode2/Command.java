package com.alien.gof23.mode2;

/**
 * program: gof23
 * description: 抽象命令类
 *
 * @author: alien
 * @since: 2019/09/15 23:14
 */
public abstract class Command {
    /**
     * method name: execute <br/>
     * description: 每个命令类都必须有一个执行命令的方法

     * @return: void
     * @since: 2019-09-15
     */
    public abstract void execute();
}
