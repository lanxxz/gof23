package com.alien.gof23.mode1.tablefactory;

import com.alien.gof23.mode1.factory.Factory;
import com.alien.gof23.mode1.factory.Link;
import com.alien.gof23.mode1.factory.Page;
import com.alien.gof23.mode1.factory.Tray;

/**
 * TODO
 *
 * @author Alien
 * @since 2019/7/15 21:38
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
