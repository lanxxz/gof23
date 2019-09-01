package com.alien.gof23.mode5.user1;

/**
 * program: gof23
 * description:
 *
 * @author: alien
 * @since: 2019/09/01 21:05
 */
public class User {
    private String name;
    private String password;
    User(String name, String password) {
        this.name = name;
        this.password =password;
    }

    public static UserBuilders.Name builder() {
        return new UserBuilder();
    }
}
