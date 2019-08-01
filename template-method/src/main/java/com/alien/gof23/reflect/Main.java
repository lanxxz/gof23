package com.alien.gof23.reflect;

/**
 * 本子包通过反射实现模板模式<br/>
 * 本类时主入口
 *
 * @author alien
 * @since 2019-08-01 22:30
 */
public class Main {
    public static void main(String[] args) throws Exception {
        AbsPopulator populator = new UserPopulator();
        populator.dataInitialing();
    }
}
