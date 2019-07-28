package com.alien.gof23;

import java.util.Iterator;

/**
 * 主入口
 *
 * @author alien
 * @since 2019-07-28 14:21
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory root = new Directory("root");
            Directory bin = new Directory("bin");
            Directory tmp = new Directory("tmp");
            Directory usr = new Directory("usr");
            root.add(bin);
            root.add(tmp);
            root.add(usr);
            bin.add(new File("vi", 10000));
            bin.add(new File("latex", 20000));
            root.accept(new ListVisitor());

            System.out.println();
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usr.add(yuki);
            usr.add(hanako);
            usr.add(tomura);

            File file = new File("Composite.java", 200);
            yuki.add(new File("diary.html", 100));
            yuki.add(file);
            hanako.add(new File("meno.txt", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            root.accept(new ListVisitor());

            System.out.println();
            FileFindVisitor ffv = new FileFindVisitor(".html");
            root.accept(ffv);
            System.out.println("HTML files is ");
            Iterator<Entry> foundFiles = ffv.getFoundFiles();
            for (;foundFiles.hasNext();) {
                Entry next = foundFiles.next();
                System.out.println(next.toString());
            }

            System.out.println();
            ElementArrayList elementArrayList = new ElementArrayList();
            elementArrayList.add(bin);
            elementArrayList.add(usr);
            elementArrayList.accept(new ListVisitor());


        } catch (FileTreatementException e) {
            e.printStackTrace();
        }
    }
}
