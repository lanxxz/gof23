package com.alien.mode2;

/**
 * @program: gof23
 * @description: 回调接口，观察者预定和取消订阅都会传递给方法
 * @author: alien
 * @since: 2019/08/21 16:36
 */
@FunctionalInterface
public interface SetObserver<E> {
    /**
     * method name: added <br/>
     * @description: 当元素添加到可观测集时调用
     * @param set:
     * @param element:
     * @return: void
     * @date: 2019-08-21
     */
    void added(ObservableSet<E> set, E element);
}
