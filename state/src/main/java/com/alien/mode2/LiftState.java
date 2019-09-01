package com.alien.mode2;

/**
 * program: gof23
 * description: 承担状态的产生以及状态间的转换过渡
 * @author: alien
 * @since: 2019/09/01 17:50
 */
public abstract class LiftState {
    protected Context context;
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * method name: open <br/>
     * description: 电梯门门开启动作
     * @return: void
     * @since: 2019-09-01
     */
    public abstract void open();

    /**
     * method name: close <br/>
     * description: 电梯门关闭动作
     * @return: void
     * @since: 2019-09-01
     */
    public abstract void close();

    /**
     * method name: run <br/>
     * description: 电梯运行动作
     * @return: void
     * @since: 2019-09-01
     */
    public abstract void run();

    /**
     * method name: stop <br/>
     * description: 电梯停止动作
     * @return: void
     * @since: 2019-09-01
     */
    public abstract void stop();

}
