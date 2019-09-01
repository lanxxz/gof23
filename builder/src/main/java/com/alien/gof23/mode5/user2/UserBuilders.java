package com.alien.gof23.mode5.user2;

/**
 * program: gof23
 * description:
 *
 * @author: alien
 * @since: 2019/09/01 21:17
 */
public interface UserBuilders {
    interface Name {
        Build name(String name);
    }

    interface Build {
        Build password(String password);
        User2 build();
    }
}
