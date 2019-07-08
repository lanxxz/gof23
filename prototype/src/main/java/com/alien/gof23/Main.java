package com.alien.gof23;

import com.alien.gof23.framework.Manager;
import com.alien.gof23.framework.MessageBox;
import com.alien.gof23.framework.Product;
import com.alien.gof23.framework.UnderlinePen;

/**
 * 主入口
 *
 * @author Alien
 * @since 2019/7/8 21:55
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, World.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, World.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World.");
    }
}
