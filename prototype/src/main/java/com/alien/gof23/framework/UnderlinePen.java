package com.alien.gof23.framework;

/**
 *
 *
 * @author Alien
 * @since 2019/7/8 22:15
 */
public class UnderlinePen implements Product {
    private char ulchar;
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < len; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            // 弱复制
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }
        return p;
    }
}
