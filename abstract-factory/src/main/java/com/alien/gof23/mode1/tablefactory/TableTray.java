package com.alien.gof23.mode1.tablefactory;

import com.alien.gof23.mode1.factory.Item;
import com.alien.gof23.mode1.factory.Tray;

/**
 * {@link Tray} 实现类
 *
 * @author Alien
 * @since 2019/7/15 21:24
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<td>")
                .append("<table width=\"100%\" border=\"1\"><tr>")
                .append("<td bgcolor=\"cccccc\" align=\"center\" colspan=\">"
                        + tray.size() + "\"><b>" + caption + "</b></td>")
                .append("</tr>\n")
                .append("<tr>\n");
        for (Item item: tray) {
            builder.append(item.makeHTML());
        }
        builder.append("</tr></table>").append("</td>");
        return builder.toString();
    }
}
