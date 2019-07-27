package com.alien.gof23;

/**
 * 主入口
 *
 * @author alien
 * @since 2019-07-27 21:23
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            rootDir.printLine();

            System.out.println();

            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrDir.add(yuki);
            usrDir.add(hanako);
            usrDir.add(tomura);

            File file = new File("Composite.java", 200);
            yuki.add(new File("diary.html", 100));
            yuki.add(file);
            hanako.add(new File("meno.txt", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            rootDir.printLine();

            System.out.println();

            System.out.println("file = " + file.getFullName());
            System.out.println("yuki = " + yuki.getFullName());
        } catch (FileTreatMentException e) {
            System.err.println(e.getMessage());
        }
    }
}
