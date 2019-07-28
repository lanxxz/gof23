package com.alien.gof23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 表示文件夹的类
 *
 * @author alien
 * @since 2019-07-28 14:19
 */
public class Directory extends Entry {
    private String name;
    private List<Entry> dir = new ArrayList<>();
    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: dir) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Entry add(Entry entry) throws FileTreatementException {
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator<Entry> iterator() throws FileTreatementException {
        return dir.iterator();
    }
}
