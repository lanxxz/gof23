package com.alien.gof23.mode5.user2;

/**
 * program: gof23
 * description:
 *
 * @author: alien
 * @since: 2019/09/01 21:02
 */
public class UserBuilder implements UserBuilders.Name, UserBuilders.Build {
    private String name;
    private String password;

    @Override
    public UserBuilders.Build name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilders.Build password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public User2 build() {
        return new User2(this.name, this.password);
    }
}
