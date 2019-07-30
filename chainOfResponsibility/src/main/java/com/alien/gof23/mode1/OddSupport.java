package com.alien.gof23.mode1;

/**
 * 用于解决问题的类(解决期数编号的问题)
 *
 * @author alien
 * @since 2019-07-30 22:24
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
