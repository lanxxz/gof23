package com.alien.gof23.reflect;

/**
 * 主入口
 *
 * @author alien
 * @since 2019-08-04 20:41
 */
public class Main {
    public static void main(String[] args) {
        // 定义名为 Jetty 的老鼠
        Animal jetty = new Rat();
        // 为 Jetty 添加飞行能力
        jetty = new DecorateAnimal(jetty, FlyFeature.class);
        // 为 Jetty 添加钻地能力
        jetty = new DecorateAnimal(jetty, DigFeature.class);
        jetty.doStuff();
    }
}
