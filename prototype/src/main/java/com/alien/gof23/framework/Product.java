package com.alien.gof23.framework;

/**
 * 复制功能的接口
 *
 * @author Alien
 * @since 2019/7/8 21:56
 */
public interface Product extends Cloneable {
    /**
     * @author Alien
     * @description 定义怎么使用
     * @date 22:00 2019/7/8
     * @param s
     * @return void
     **/
    void use(String s);

    /**
     * @author Alien
     * @description 复制实例的方法
     * @date 22:02 2019/7/8
     * @return com.alien.gof23.framework.Product
     **/
    Product createClone();
}
