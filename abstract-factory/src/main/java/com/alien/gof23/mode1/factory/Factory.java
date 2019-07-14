package com.alien.gof23.mode1.factory;

/**
 * 抽象工厂类
 *
 * @author Alien
 * @since 2019/7/14 22:20
 */
public abstract class Factory {
    public static Factory getFactory(String name) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(name).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到" + name + "类。");
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
