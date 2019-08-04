package com.alien.gof23.mode1;

/**
 * 主入口
 *
 * @author alien
 * @since 2019-07-27 23:45
 */
public class Main {
    public static void main(String[] args) {
        StringDisplay stringDisplay = new StringDisplay("Hello, world!");
        SideBorder sideBorder = new SideBorder(stringDisplay, '#');
        FullBorder fullBorder = new FullBorder(sideBorder);
        stringDisplay.show();
        sideBorder.show();
        fullBorder.show();

        new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("Alien!")
                                        ), '*'
                                )
                        )
                ), '/'
        ).show();
    }
}
