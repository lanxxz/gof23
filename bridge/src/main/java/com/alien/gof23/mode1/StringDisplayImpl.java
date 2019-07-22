package com.alien.gof23.mode1;

/**
 * TODO
 *
 * @author alien
 * @since 2019-07-22 21:05
 */
public class StringDisplayImpl extends DisplayImpl {
    //要显示的字符串
    private String string;

    //字符串的宽度
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
}
