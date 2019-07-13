package com.alien.gof23.mode1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HTML 文档
 *
 * @author Alien
 * @since 2019/7/13 18:34
 */
public class HtmlBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
            writer.print("<html><head><title>");
            writer.print(title);
            writer.println("</title></head><body>");
            writer.println("<h1>" + title + "/<h1>");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItem(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
