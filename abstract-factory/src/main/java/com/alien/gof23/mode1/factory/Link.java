package com.alien.gof23.mode1.factory;

/**
 * 抽象的零件<br/>
 * 抽象的表示 HTML 的超链接的类
 *
 * @author Alien
 * @since 2019/7/14 21:54
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
