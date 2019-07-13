package com.alien.gof23.mode3;

/**
 * 披萨饺
 *
 * @author Alien
 * @since 2019/7/13 21:35
 */
public class Calzone extends Pizza{
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // 默认为 false

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
