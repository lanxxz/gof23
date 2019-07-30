package com.alien.gof23.mode1;

/**
 * 用于解决问题(解决编号小于制定编号的问题)
 *
 * @author alien
 * @since 2019-07-30 22:21
 */
public class LimitSupport extends Support {
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
