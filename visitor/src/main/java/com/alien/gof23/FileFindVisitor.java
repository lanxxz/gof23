package com.alien.gof23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 汇集带有相同后缀名的类<br/>
 *
 * @author alien
 * @since 2019-07-28 19:53
 */
public class FileFindVisitor extends Visitor {
    private String fileType;
    private List<Entry> found = new ArrayList<>();

    public FileFindVisitor(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(fileType)) {
            found.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        for (;iterator.hasNext();) {
            Entry next = iterator.next();
            next.accept(this);
        }
    }

    public Iterator<Entry> getFoundFiles() {
        return found.iterator();
    }
}
