package com.alien.gof23.mode1.listfactory;

import com.alien.gof23.mode1.factory.Item;
import com.alien.gof23.mode1.factory.Tray;

/**
 * {@link Tray} 的实现类
 *
 * @author Alien
 * @since 2019/7/14 22:52
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n")
                .append(caption + "\n")
                .append("<ul>\n");
        for (Item item: tray) {
            builder.append(item.makeHtml());
        }
        builder.append("</ul>\n").append("</li>\n");
        return builder.toString();
    }
}
