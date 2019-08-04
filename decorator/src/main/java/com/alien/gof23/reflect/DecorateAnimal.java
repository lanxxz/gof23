package com.alien.gof23.reflect;

import java.lang.reflect.*;

/**
 * TODO
 *
 * @author alien
 * @since 2019-08-04 20:26
 */
public class DecorateAnimal implements Animal {
    // 被包装的动物
    private Animal animal;
    // 使用哪一种包装器
    private Class<? extends Feature> clz;
    public DecorateAnimal(Animal animal, Class<? extends Feature> clz) {
        this.animal = animal;
        this.clz = clz;
    }

    @Override
    public void doStuff() {
        // 不使用 lambda 表达式的写法
        /*
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object p, Method m, Object[] args) throws Throwable {
                Object o = null;
                // 设置包装条件
                if (Modifier.isPublic(m.getModifiers())) {
                    o = m.invoke(clz.newInstance(), args);
                }
                animal.doStuff();
                return o;
            }
        };
        */
        InvocationHandler invocationHandler = (p, m, args) -> {
            Object o = null;
            // 设置包装条件
            if (Modifier.isPublic(m.getModifiers())) {
                o = m.invoke(clz.newInstance(), args);
            }
            animal.doStuff();
            return o;
        };
        // 当前加载器
        ClassLoader classLoader = getClass().getClassLoader();
        // 动态代理，由 Handler 决定如何包装
        Feature feature =
                (Feature) Proxy.newProxyInstance(classLoader, clz.getInterfaces(), invocationHandler);
        feature.load();
    }
}
