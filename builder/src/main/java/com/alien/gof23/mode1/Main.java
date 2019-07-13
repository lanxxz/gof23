package com.alien.gof23.mode1;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

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

        Director director = null;
        switch (args[0]) {
            case "plain":
                TextBuilder textBuilder = new TextBuilder();
                director = new Director(textBuilder);
                director.construct();
                System.out.println(textBuilder.getResult());
                break;
            case "html":
                HtmlBuilder htmlBuilder = new HtmlBuilder();
                director = new Director(htmlBuilder);
                director.construct();
                System.out.println(htmlBuilder.getResult());
                break;
            default:
                usage();
                System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: Main plain 编写纯文本文档。");
        System.out.println("Usage: Main plain 编写 HTML 文档。");
    }
}
