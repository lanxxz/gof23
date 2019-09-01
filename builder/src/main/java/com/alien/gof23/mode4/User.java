package com.alien.gof23.mode4;

/**
 * program: gof23
 * description: 用户类
 *
 * @author: alien
 * @since: 2019/09/01 20:22
 */
public class User {
    private final String name;

    private final String password;

    private User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static User build(Builder<TRUE, TRUE> builder){
        return new User(builder.name, builder.password);
    }

    public static Builder<FALSE, FALSE> builder() {
        return new Builder<FALSE, FALSE>();
    }

    public static class Builder<HNAME, HPASSWORD> {
        private String name;
        private String password;

        private Builder() {}
        private Builder(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public Builder<TRUE, HPASSWORD> name(String name) {
            this.name = name;
            return new Builder<TRUE, HPASSWORD>(name, this.password);
        }

        public Builder<HNAME, TRUE> password(String password) {
            this.password = password;
            return new Builder<HNAME, TRUE>(this.name, password);
        }
    }

    static abstract class TRUE {}

    static abstract class FALSE {}
}
