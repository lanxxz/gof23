package com.alien.gof23.mode1;

/**
 * TODO
 *
 * @author alien
 * @since 2019-07-22 23:34
 */
public class IncreaseDisplay extends CountDisplay {
    private int step;

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
