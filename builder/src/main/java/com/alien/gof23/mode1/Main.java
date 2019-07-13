package com.alien.gof23.mode1;

/**
 * 主入口
 *
 * @author Alien
 * @since 2019/7/13 18:46
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            usage();
            System.exit(0);
        }

        if ("plain".equals(args[0])) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getResult());
        } else if ("html".equals(args[0])) {
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            System.out.println(htmlBuilder.getResult());
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: Main plain 编写纯文本文档。");
        System.out.println("Usage: Main plain 编写 HTML 文档。");
    }
}
