package com.alien.gof23.mode1;

/**
 * 扮演适配器的类
 *
 * @author Alien
 * @since 2019/6/24 22:58
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
