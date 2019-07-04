package com.alien.gof23.product;

/**
 * A 产品
 *
 * @author Alien
 * @since 2019/7/4 22:12
 */
public class ProductA extends Product {
    ProductA() {}

    @Override
    public void use() {
        System.out.println("A产品被使用。");
    }
}
