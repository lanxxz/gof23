package com.alien.mode2;

/**
 * program: gof23
 * description: 关闭状态
 *
 * @author: alien
 * @since: 2019/09/01 18:07
 */
public class ClosingState extends LiftState {
    private static final ClosingState singleton = new ClosingState();
    private ClosingState() {}
    public static ClosingState getInstance() {
        return singleton;
    }

    @Override
    public void open() {
        super.context.setLiftState(OpenningState.getInstance());
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        super.context.setLiftState(RunningState.getInstance());
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(StoppingState.getInstance());
        super.context.getLiftState().stop();
    }
}
