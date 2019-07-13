package com.alien.gof23.mode3;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 披萨
 *
 * @author Alien
 * @since 2019/7/13 21:10
 */
public abstract class Pizza {
    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        //创建elementType类型的空集
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            // Objects.requireNonNull 为空时抛出空指针异常
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // 子类需要重写，返回 this
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
