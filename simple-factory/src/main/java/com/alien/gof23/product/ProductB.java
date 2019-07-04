package com.alien.gof23.product;

/**
 * B 产品
 *
 * @author Alien
 * @since 2019/7/4 22:15
 */
public class ProductB extends Product {
    ProductB() { }

    @Override
    public void use() {
        System.out.println("B产品被使用。");
    }
}
