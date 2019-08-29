package com.alien.mode1;

/**
 * program: gof23
 * description: 表示金币状态的接口
 * @author: alien
 * @since: 2019/08/28 22:33
 */
public interface State {

    /**
     * method name: doClock <br/>
     * description: 设置时间
     * @param context: 表示管理金库状态,并与报警中心联系的接口
     * @param hour: 小时
     * @return: void
     * @date: 2019-08-28
     */
    void doClock(Context context, int hour);

    /**
     * method name: doUse <br/>
     * description: 使用金库
     * @param context: 金库状态
     * @return: void
     * @date: 2019-08-29
     */
    void doUse(Context context);

    /**
     * method name: doAlarm <br/>
     * description: 按下警铃
     * @param context: 金库状态
     * @return: void
     * @date: 2019-08-29
     */
    void doAlarm(Context context);

    /**
     * method name: doPhone <br/>
     * description: 正常通话
     * @param context: 金库状态
     * @return: void
     * @date: 2019-08-29
     */
    void doPhone(Context context);

}
