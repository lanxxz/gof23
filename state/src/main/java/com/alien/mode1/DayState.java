package com.alien.mode1;

/**
 * program: gof23
 * description: 表示白天状态的类
 *
 * @author: alien
 * @since: 2019/08/29 22:13
 */
public class DayState implements State {
    private static class InternalCls {
        private static final DayState singleton = new DayState();
    }

    private DayState() {}

    public static DayState getInstance() {
        return InternalCls.singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
