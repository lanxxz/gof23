package com.alien.gof23;

import java.util.Iterator;

/**
 * {@link File} 和 {@link Directory} 的父类，他是抽象类(实现了 {@link Element} 接口)
 *
 * @author alien
 * @since 2019-07-28 14:15
 */
public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatementException {
        throw new FileTreatementException();
    }

    public Iterator iterator() throws FileTreatementException {
        throw new FileTreatementException();
    }

    @Override
    public String toString() {
        return getName() + "（" + getSize() + ")";
    }
}
