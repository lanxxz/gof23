package com.alien.gof23.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用 {@link Product} 接口来复制实例
 *
 * @author Alien
 * @since 2019/7/8 22:03
 */
public class Manager {
    /**
     * @author Alien
     * @description 用于保存 Product 的实例
     * @date 22:05 2019/7/8
     **/
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product product = showcase.get(protoname);
        return product.createClone();
    }
}
