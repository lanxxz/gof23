package com.alien.gof23.mode1.tablefactory;

import com.alien.gof23.mode1.factory.Item;
import com.alien.gof23.mode1.factory.Page;

/**
 * {@link Page} 实现类
 *
 * @author Alien
 * @since 2019/7/15 21:32
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>" + title + "</title></head>\n")
                .append("<body>\n")
                .append("<h1>" + title + "</h1>\n")
                .append("<table width=\"80%\" border=\"3\">\n");
        for (Item item: content) {
            builder.append(item.makeHTML());
        }
        builder.append("</table>\n")
                .append("<hr><address>" + author + "</address>")
                .append("</body></html>\n");
        return builder.toString();
    }
}
