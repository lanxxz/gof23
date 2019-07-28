package com.alien.gof23;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 使得 {@link File} 和 {@link Directory} 可以被添加到本类中<br>
 * 本类继承 {@link ArrayList} 和实现 {@link Element} 接口
 *
 * @author alien
 * @since 2019-07-28 20:12
 */
public class ElementArrayList extends ArrayList<Entry> implements Element {
    @Override
    public void accept(Visitor visitor) {
        Iterator<Entry> iterator = iterator();
        for (;iterator.hasNext();) {
            Entry entry = iterator.next();
            entry.accept(visitor);
        }
    }
}
