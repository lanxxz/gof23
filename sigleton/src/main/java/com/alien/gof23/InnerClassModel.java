package com.alien.gof23;

/**
 * 使用静态内部类实现单例<br/>
 * 这种跟 饿汉模式 区别不大。是饿汉模式的一个变种。
 *
 * @author Alien
 * @since 2019/6/28 22:43
 */
public class InnerClassModel {

    private static class LazyHolder {
        private static final InnerClassModel INSTANCE = new InnerClassModel();
    }

    public static int tmp = 1;

    private InnerClassModel() {
        //测试代码
        System.out.println("create InnerClassModel...");
    }

    public static InnerClassModel getInstance() {
        return LazyHolder.INSTANCE;
    }

}
