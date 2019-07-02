package com.alien.gof23;

/**
 * 饿汉模式<br/>
 * 不管需不需要用到实例都要去创建实例，即在类产生的时候就创建好实例，这是一种空间换时间的做法。<br/>
 *
 * @author Alien
 * @since 2019/6/28 22:28
 */
public class HungryManModel {

    private HungryManModel() {
        //测试代码
        System.out.println("create HungryManModel...");
    }

    // 在 getInstance 方法执行前先引用了 tmp，
    // 会在 getInstance 方法执行前就初始化对象，但是只会有一个实例，因为类只被初始化一次
    public static int tmp = 1;

    private final static HungryManModel INSTANCE = new HungryManModel();

    private static HungryManModel getInstance() {
        return INSTANCE;
    }
}
