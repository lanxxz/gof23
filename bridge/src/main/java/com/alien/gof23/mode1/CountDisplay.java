package com.alien.gof23.mode1;

/**
 * TODO
 *
 * @author alien
 * @since 2019-07-22 21:02
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for(int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
