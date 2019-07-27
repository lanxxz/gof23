package com.alien.gof23;

/**
 * 用于显示字符串的抽象类
 *
 * @author alien
 * @since 2019-07-27 23:20
 */
public abstract class Display {
    // 获取横向字符数
    public abstract int getColumns();

    // 获取纵向行数
    public abstract int getRows();

    // 获取第 row 行的字符串
    public abstract String getRowText(int row);

    // 全部显示
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}

