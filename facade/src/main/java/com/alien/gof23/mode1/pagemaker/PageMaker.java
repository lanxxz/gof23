package com.alien.gof23.mode1.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用 {@link Database} 和 {@link HtmlWriter} 来生成指定用户的 Web 页面
 *
 * @author alien
 * @since 2019-08-04 18:46
 */
public class PageMaker {
    private PageMaker(){}

    public static void makeWelcomePage(String mailaddr, String filename) throws IOException {
        Properties properties = Database.getProperties("maildata");
        String username = properties.getProperty(mailaddr);
        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
        writer.title("Wecome to " + username + "'s page");
        writer.paragraph(username + " 欢迎来到 " + username + " 的主页");
        writer.paragraph("等着你的邮件哦！");
        writer.mailto(mailaddr, username);
        writer.close();
        System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
    }

}
