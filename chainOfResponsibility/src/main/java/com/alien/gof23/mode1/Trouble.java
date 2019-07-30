package com.alien.gof23.mode1;

/**
 * 表示发生的问题的类<br/>
 * 它带有问题编号
 *
 * @author alien
 * @since 2019-07-30 22:00
 */
public class Trouble {
    // 问题编号
    private int number;
    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
