package com.alien.gof23.mode1;

import com.alien.gof23.mode1.pagemaker.PageMaker;

import java.io.IOException;

/**
 * 主入口
 *
 * @author alien
 * @since 2019-08-03 16:21
 */
public class Main {
    public static void main(String[] args) {
        try {
            PageMaker.makeWelcomePage("hyuki@yuki.com", "Wecome.html");
            PageMaker.makeLinkPage("linkPage.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
