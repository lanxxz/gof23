package com.alien.gof23.mode1.tablefactory;

import com.alien.gof23.mode1.factory.Link;

/**
 * {@link Link} 的实现类
 *
 * @author Alien
 * @since 2019/7/15 21:22
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<td><a href=\"" + url +
                "\">" + caption + "</a></td>\n";
    }
}
