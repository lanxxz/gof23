package com.alien.gof23;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示文件夹的类
 *
 * @author alien
 * @since 2019-07-27 21:12
 */
public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

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
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        entry.parent = this;
        return this;
    }
}
