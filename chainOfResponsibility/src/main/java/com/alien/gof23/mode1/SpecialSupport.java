package com.alien.gof23.mode1;

/**
 * 用于解决问题的类(解决指定编号的类)
 *
 * @author alien
 * @since 2019-07-30 22:26
 */
public class SpecialSupport extends Support {
    private int number;
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
