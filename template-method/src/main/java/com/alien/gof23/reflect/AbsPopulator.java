package com.alien.gof23.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 负责数据初始化的类，具体的实现交由子类实现
 *
 * @author alien
 * @since 2019-08-01 22:33
 */
public abstract class AbsPopulator {

    public final void dataInitialing() throws Exception {
        // 获取所有的 public 方法
        Method[] methods = getClass().getMethods();
        for (Method m: methods) {
            // 判断是否有数据初始化方法
            if (isInitDataMethod(m)) {
                Object invoke = m.invoke(this);
            }
        }
    }

    // 判断是否数据初始化方法，基本方法鉴别器
    private boolean isInitDataMethod(Method m) {
        // init开始的公共的返回值是void的输入参数为空的非抽象方法
        return m.getName().startsWith("init")
                && Modifier.isPublic(m.getModifiers())
                && m.getReturnType().equals(Void.TYPE)
                && !m.isVarArgs()
                && !Modifier.isAbstract(m.getModifiers());

    }
}
