package com.alien.gof23.mode1.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的产品<br/>
 * 表示 HTML 页面的类
 *
 * @author Alien
 * @since 2019/7/14 22:02
 */
public abstract class Page implements HTMLLabel {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        // output 方法是一个 template method 方法
        String filename = title + ".html";
        try (Writer writer = new FileWriter(filename)) {
            writer.write(this.makeHtml());
            System.out.println(filename + " 编写完毕。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
