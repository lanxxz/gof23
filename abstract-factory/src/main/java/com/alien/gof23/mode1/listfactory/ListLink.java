package com.alien.gof23.mode1.listfactory;

import com.alien.gof23.mode1.factory.Link;

/**
 * {@link Link} 的实现类
 *
 * @author Alien
 * @since 2019/7/14 22:50
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" +
                caption + "</a></li>\n";
    }
}
