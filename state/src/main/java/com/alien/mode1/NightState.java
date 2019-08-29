package com.alien.mode1;

/**
 * program: gof23
 * description: 表示晚上状态的类
 *
 * @author: alien
 * @since: 2019/08/29 22:21
 */
public class NightState implements State {
    private static class InnerClass {
        private static final NightState singleton = new NightState();
    }

    private NightState() {}

    public static NightState getInstance() {
        return InnerClass.singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急,晚上使用金库!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(晚上)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
