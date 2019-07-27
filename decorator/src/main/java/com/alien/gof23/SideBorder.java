package com.alien.gof23;

/**
 * 用于只显示左右边框的类
 *
 * @author alien
 * @since 2019-07-27 23:32
 */
public class SideBorder extends Border {

    // 表示装饰边框的字符
    private char borderChar;

    protected SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
