package com.alien.gof23.mode2;

/**
 * 主入口
 *
 * @author Alien
 * @since 2019/7/13 21:07
 */
public class Mode2Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.NutritionFactsBuilder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).carbohydrate(27).builder();


    }
}
