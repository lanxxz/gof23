package com.alien.mode2;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

/**
 * program: gof23
 * description: 敞开门状态
 * @author: alien
 * @since: 2019/09/01 17:56
 */
public class OpenningState extends LiftState {
    private final static OpenningState singleton = new OpenningState();
    private OpenningState() {}
    public static OpenningState getInstance() {
        return singleton;
    }

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(ClosingState.getInstance());
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        throw new IllegalStateException("电梯开门状态下不允许运行!!!");
    }

    @Override
    public void stop() {
        System.out.println("开门状态下，电梯是停止的！");
    }
}
