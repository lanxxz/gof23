package com.alien.gof23.product;

/**
 * 创建产品的工厂类
 *
 * @author Alien
 * @since 2019/7/4 22:19
 */
public class ProductFactory {
    private ProductFactory(){}

    public static Product create(String name) {
        switch (name) {
            case "A":
                return new ProductA();
            case "B":
                return  new ProductB();
            default:
                throw new NullPointerException("不存在该类。");
        }
    }
}
