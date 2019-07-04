package com.alien.gof23;

import com.alien.gof23.product.Product;
import com.alien.gof23.product.ProductFactory;

/**
 * 主入口
 *
 * @author Alien
 * @since 2019/7/4 22:12
 */
public class Main {
    public static void main(String[] args) {
        Product a = ProductFactory.create("A");
        a.use();
        Product b = ProductFactory.create("B");
        b.use();
    }
}
