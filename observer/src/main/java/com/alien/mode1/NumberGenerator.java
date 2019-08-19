package com.alien.mode1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: gof23
 * @description: 表示生成数值的抽象类
 * @author: alien
 * @since: 2019/08/19 23:07
 */
public abstract class NumberGenerator {
    /**
     * @description: 保存 oberver 们
     * @date: 2019-08-19
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * method name: addObserver <br/>
     * @description 注册 Oberver
     * @param observer: 待注册的观察者
     * @return: NumberGenerator
     * @date: 2019-08-19
     */
    public NumberGenerator addObserver(Observer observer) {
        observers.add(observer);
        return this;
    }

    /**
     * method name: deleteObserver <br/>
     * @description: 删除 Observer
     * @param observer: 待删除的 观察者
     * @return: void
     * @date: 2019-08-19
     */
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * method name: notifyObserver <br/>
     * @description: 向 Observer 发送通知
     * @return: void
     * @date: 2019-08-19
     */
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    /**
     * method name: getNumber <br/>
     * @description: 获取数值
     * @return: int
     * @date: 2019-08-19
     */
    public abstract int getNumber();

    /**
     * method name: execute <br/>
     * @description: 生成数值
     * @return: void
     * @date: 2019-08-19
     */
    public abstract void execute();

}
