package com.alien.gof23.mode3;

import java.util.Objects;

/**
 * 纽约披萨
 *
 * @author Alien
 * @since 2019/7/13 21:20
 */
public class NyPizza extends Pizza {
    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NyPizza build() {
            return null;
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
