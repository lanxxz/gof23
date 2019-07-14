package com.alien.gof23.mode1.listfactory;

import com.alien.gof23.mode1.factory.Item;
import com.alien.gof23.mode1.factory.Page;

/**
 * {@link Page} 的实现类
 *
 * @author Alien
 * @since 2019/7/14 23:03
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>" + title + "</title><head>\n")
                .append("<body>\n")
                .append("<h1>" + title + "</h1>\n")
                .append("<ul>\n");
        for (Item item: content) {
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n")
                .append("<hr><address>" + author + "</address>")
                .append("</body></html>\n");
        return builder.toString();
    }
}
