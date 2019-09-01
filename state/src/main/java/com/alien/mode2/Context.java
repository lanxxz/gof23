package com.alien.mode2;

/**
 * program: gof23
 * description: 上下文类
 *
 * @author: alien
 * @since: 2019/09/01 17:52
 */
public class Context {
    /**
     * description: 定义电梯当前状态
     * @since: 2019-09-01
     */
    private LiftState liftState;
    public LiftState getLiftState() {
        return liftState;
    }
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
