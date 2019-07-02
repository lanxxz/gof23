package com.alien.gof23.framework;

/**
 * 工厂类<bt/>
 * 使用 template method 模式实现
 *
 * @author Alien
 * @since 2019/7/2 23:00
 */
public abstract class Factory {

    /**
     * @author Alien
     * @description 创建产品的方法
     * @date 23:06 2019/7/2
     * @param owner
     * @return com.alien.gof23.framework.Product
     **/
    protected abstract Product createProduct(String owner);

    /**
     * @author Alien
     * @description 注册产品的方法
     * @date 23:07 2019/7/2
     * @param product
     * @return void
     **/
    protected abstract void registerProduct(Product product);

    /**
     * @author Alien
     * @description chua创建产品并注册
     * @date 23:08 2019/7/2
     * @param owner
     * @return com.alien.gof23.framework.Product
     **/
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
