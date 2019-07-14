package com.alien.gof23.mode1.listfactory;

import com.alien.gof23.mode1.factory.Factory;
import com.alien.gof23.mode1.factory.Link;
import com.alien.gof23.mode1.factory.Page;
import com.alien.gof23.mode1.factory.Tray;

/**
 * 具体实现工厂<br/>
 * 这里可以结合 prototype 模式实现
 *
 * @author Alien
 * @since 2019/7/14 22:47
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
