package com.alien.gof23;

import com.alien.gof23.framework.Product;
import com.alien.gof23.idcard.IDCardFactory;

/**
 * 主入口
 *
 * @author Alien
 * @since 2019/7/2 22:53
 */
public class Main {
    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product card = factory.create("小米");
        Product alien = factory.create("Alien");
        Product june = factory.create("June");
        card.use();
        alien.use();
        june.use();

    }
}
