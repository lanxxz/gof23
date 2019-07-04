package com.alien.gof23.idcard;

import com.alien.gof23.framework.Product;

/**
 * 产品 {@link Product} 的子类
 *
 * @author Alien
 * @since 2019/7/2 23:09
 */
public class IDCard extends Product {

    private String owner;
    //使用默认修饰，让包外不可 创建实例，即通过 new 创建
    IDCard(String owner) {
        System.out.println("Made " + owner + "'s ID card.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use " + owner + "'s ID Card.");
    }

    public String getOwner() {
        return owner;
    }
}
