package com.alien.gof23.mode1;

/**
 * 用来处理问题的具体类(永远不处理问题)
 *
 * @author alien
 * @since 2019-07-30 22:19
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
