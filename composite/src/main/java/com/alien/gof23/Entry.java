package com.alien.gof23;

/**
 * 抽象类，用于实现 File 和Directory 类的一致性
 *
 * @author alien
 * @since 2019-07-27 20:57
 */
public abstract class Entry {
    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    protected abstract void printList(String prefix);

    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public void printLine() {
        printList("");
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        Entry entry = this;
        do {
            fullName.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return fullName.toString();
    }
}
