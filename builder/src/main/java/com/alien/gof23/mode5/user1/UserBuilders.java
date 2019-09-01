package com.alien.gof23.mode5.user1;

/**
 * program: gof23
 * description:
 *
 * @author: alien
 * @since: 2019/09/01 21:00
 */
public interface UserBuilders {
    interface Name {
        Password name(String name);
    }

    interface Password {
        Build password(String password);
    }

    interface Build {
        User build();
    }
}
