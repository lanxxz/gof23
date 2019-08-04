package com.alien.gof23.mode1.pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * 简单的web页面
 *
 * @author alien
 * @since 2019-08-04 17:02
 */
public class HtmlWriter {
    private Writer writer;
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<titie>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
    }

    public void link(String href, String caption) throws IOException {
        writer.write("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }




}
