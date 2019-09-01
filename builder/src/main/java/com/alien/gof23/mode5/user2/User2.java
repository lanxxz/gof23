package com.alien.gof23.mode5.user2;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * program: gof23
 * description:
 *
 * @author: alien
 * @since: 2019/09/01 21:18
 */
public class User2 {
    private String name;
    private String password;
    User2(String name, String password) {
        this.name = name;
        this.password =password;
    }


    public static Function<String, Function<String,Supplier<User2>>> builder() {
        return name -> password -> () -> new User2(name, password);
    }

    public static UserBuilders.Name builder2() {
        return new UserBuilder();
    }
}
