package com.alien.gof23.adapter.mode2;

import com.alien.gof23.adapter.mode1.Banner;
import com.alien.gof23.adapter.mode1.Print;

/**
 * 扮演适配器的类<br/>
 * 第二种方法的 {@link Banner} 类 和 {@link Print} 类 与 mode1 包 中的相同， mode2包中不在重复编写
 *
 * @author Alien
 * @since 2019/6/24 23:05
 */
public class PrintBanner implements Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
