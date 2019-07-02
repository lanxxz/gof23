package com.alien.gof23.mode1;

/**
 * 广告牌类
 *
 * @author Alien
 * @since 2019/6/24 22:50
 */
public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }

    /**
     * @author Alien
     * @description 输出带括号的广告
     * @date 22:55 2019/6/24
     **/
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    /**
     * @author Alien
     * @description 输出带*号的广告
     * @date 22:55 2019/6/24
     **/
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
