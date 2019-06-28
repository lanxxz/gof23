package com.alien.gof23.sigleton;

import java.util.concurrent.SynchronousQueue;

/**
 * 懒汉模式<br/>
 * 如果单例初始化的值是 null，还未构建，则构建单例对象并返回。这种模式称为懒汉模式。<br/>
 *
 * @author Alien
 * @since 2019/6/28 22:17
 */
public class LazyManModel {
    // 使用 volatile 避免指令重排， 还可以保证线程访问的变量值是主内存中的最新值。
    private volatile static LazyManModel lazyManModel = null;

    private LazyManModel() {}

    public static LazyManModel getInstance() {
        // 双重检测机制，避免多线程模式下创建多个实例
        if (lazyManModel == null) {
            // 这里不能使用对象锁
            synchronized (LazyManModel.class) {
                if (lazyManModel == null) {
                    lazyManModel = new LazyManModel();
                }
            }
        }
        return lazyManModel;
    }

}
