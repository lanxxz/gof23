package com.alien.gof23.mode5.user1;

/**
 * program: gof23
 * description:
 *
 * @author: alien
 * @since: 2019/09/01 21:02
 */
public class UserBuilder implements UserBuilders.Name, UserBuilders.Password, UserBuilders.Build {
    private String name;
    private String password;

    @Override
    public UserBuilders.Password name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilders.Build password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public User build() {
        return new User(this.name, this.password);
    }
}
