package com.alien.mode1;

/**
 * program: gof23
 * description: 表示管理金库状态,并与报警中心联系的接口
 * @author: alien
 * @since: 2019/08/28 22:34
 */
public interface Context {
    /**
     * method name: setClock <br/>
     * description: 设置时间
     * @param hour: 小时
     * @return: void
     * @date: 2019-08-28
     */
    void setClock(int hour);

    /**
     * method name: changeState <br/>
     * description: 改变状态
     * @param state: 金库状态类
     * @return: void
     * @date: 2019-08-28
     */
    void changeState(State state);

    /**
     * method name: callSecurityCenter <br/>
     * description: 联系警报中心
     * @param msg: 消息
     * @return: void
     * @date: 2019-08-28
     */
    void callSecurityCenter(String msg);

    /**
     * method name: recordLog <br/>
     * description: 在警报中心留下记录
     * @param msg: 消息
     * @return: void
     * @date: 2019-08-28
     */
    void recordLog(String msg);

}
