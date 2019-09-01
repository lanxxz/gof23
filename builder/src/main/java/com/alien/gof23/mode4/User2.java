package com.alien.gof23.mode4;

/**
 * program: gof23
 * description: 默认值处理的用户类
 *
 * @author: alien
 * @since: 2019/09/01 20:46
 */
public class User2 {
    private final String name;

    private final String password;

    private User2(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static User2 build(Builder<TRUE> builder){
        return new User2(builder.name, builder.password);
    }

    public static Builder<FALSE> builder() {
        return new Builder<FALSE>();
    }

    public static class Builder<HNAME> {
        private String name;
        private String password = "123456_";

        private Builder() {}
        private Builder(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public Builder<TRUE> name(String name) {
            this.name = name;
            return new Builder<TRUE>(name, this.password);
        }

        public Builder<HNAME> password(String password) {
            this.password = password;
            return new Builder<HNAME>(this.name, password);
        }
    }

    static abstract class TRUE {}

    static abstract class FALSE {}
}

