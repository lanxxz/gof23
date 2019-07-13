package com.alien.gof23.mode3;

/**
 * TODO
 *
 * @author Alien
 * @since 2019/7/13 21:41
 */
public class Mode3Main {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();
    }
}
