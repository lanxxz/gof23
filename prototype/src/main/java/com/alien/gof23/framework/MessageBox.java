package com.alien.gof23.framework;

/**
 *
 *
 * @author Alien
 * @since 2019/7/8 22:09
 */
public class MessageBox implements Product {
    private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        for (int i = 0; i < len + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < len + 4; i++) {
            System.out.print(decochar);
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
