package com.alien.mode2;

/**
 * program: gof23
 * description: 运行状态
 *
 * @author: alien
 * @since: 2019/09/01 18:16
 */
public class RunningState extends LiftState {
    private final static RunningState singleton = new RunningState();
    private RunningState() {}
    public static RunningState getInstance() {
        return singleton;
    }

    @Override
    public void open() {
        throw new IllegalStateException("运行状态下不允许电梯开门");
    }

    @Override
    public void close() {
        System.out.println("电梯运行状态下，电梯门是关闭!");
    }

    @Override
    public void run() {
        System.out.println("电梯运行中...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(StoppingState.getInstance());
        super.context.getLiftState().stop();
    }
}
