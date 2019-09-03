package com.alien.mode1;

import java.util.HashMap;
import java.util.Map;

/**
 * program: gof23
 * description: 表示生成和共用 {@link BigChar} 类的实例的类
 *
 * @author: alien
 * @since: 2019/09/03 22:16
 */
public class BigCharFactory {
    /**
     * description: 管理已经生成的 {@link BigChar} 对象
     * @since: 2019-09-03
     */
    private Map<String, BigChar> pool = new HashMap<>();

    private static class InnerClass {
        private static final BigCharFactory factory = new BigCharFactory();
    }

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return InnerClass.factory;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = pool.get(charName + "");
        if (bc == null) {
            bc = new BigChar(charName);
            pool.put(charName + "", bc);
        }
        return bc;
    }

}
