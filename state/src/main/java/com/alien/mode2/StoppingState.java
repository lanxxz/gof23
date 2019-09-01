package com.alien.mode2;

import javafx.scene.paint.Stop;

/**
 * program: gof23
 * description: 停止状态
 *
 * @author: alien
 * @since: 2019/09/01 18:20
 */
public class StoppingState extends LiftState {
    private final static StoppingState singleton = new StoppingState();
    private StoppingState() {}
    public static StoppingState getInstance() {
        return singleton;
    }

    @Override
    public void open() {
        super.context.setLiftState(OpenningState.getInstance());
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯停止状态下门是关闭的!");
    }

    @Override
    public void run() {
        super.context.setLiftState(RunningState.getInstance());
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止...");
    }
}
