package com.alien.gof23;

import java.util.Iterator;

/**
 * {@link Visitor} 的子类，显示文件和文件夹一览
 *
 * @author alien
 * @since 2019-07-28 15:41
 */
public class ListVisitor extends Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> iterator = directory.iterator();
        for (;iterator.hasNext();) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
