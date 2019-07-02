package com.alien.gof23;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 主入口
 *
 * @author Alien
 * @since 2019/6/28 21:55
 */
public class Main {

    public static void main(String[] args) {
        lazyManMadel();
        hungryManmodel();

        reflect();
    }

    private  static void reflect() {
        //饿汉模式、懒汉模式、类加载机制都存在反射的问题。枚举方式不存在。
        //以 类加载机制说明问题
        try {
            Constructor<InnerClassModel> constructor =
                    InnerClassModel.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            //构造两个不同对象
            InnerClassModel s1 = (InnerClassModel) constructor.newInstance();
            InnerClassModel s2 = (InnerClassModel) constructor.newInstance();
            System.out.println(s1.equals(s2));

            Constructor<SigletonEnum> constructorEnum =
                    SigletonEnum.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            //构造两个不同对象
            SigletonEnum s3 = (SigletonEnum) constructorEnum.newInstance();
            SigletonEnum s4 = (SigletonEnum) constructorEnum.newInstance();
            System.out.println(s3.equals(s4));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void hungryManmodel() {
        // 在 getInstance 方法执行前先引用了 tmp，
        // 会在 getInstance 方法执行前就初始化对象，但是只会有一个实例，因为类只被初始化一次
        int a = HungryManModel.tmp;
        //静态类加载模式可以避免这种问题
        int b = InnerClassModel.tmp;
    }

    private static void lazyManMadel() {
        System.out.println("懒汉模式 开始...");
        LazyManModel lazyManMode1 = LazyManModel.getInstance();
        LazyManModel lazyManMode2 = LazyManModel.getInstance();
        if (lazyManMode1 == lazyManMode2) {
            System.out.println("相同对象");
        } else {
            System.out.println("不同对象");
        }
    }
}
