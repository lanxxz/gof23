package com.alien.gof23.mode2;

/**
 * 营养表<br/>
 * 例子源于Effective Java 第三版
 *
 * @author Alien
 * @since 2019/7/13 20:52
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int fat;
    private final int calories;
    private final int sodium;
    private final int carbohydrate;

    public static class NutritionFactsBuilder {
        //必填参数
        private final int servingSize;
        private final int servings;

        //可选参数
        private int fat = 0;
        private int calories = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public NutritionFactsBuilder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public NutritionFactsBuilder calories(int val) {
            calories = val;
            return this;
        }

        public NutritionFactsBuilder fat(int val) {
            fat = val;
            return  this;
        }

        public NutritionFactsBuilder sodium(int val) {
            sodium = val;
            return  this;
        }

        public NutritionFactsBuilder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts builder() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(NutritionFactsBuilder builder) {
        servings = builder.servings;
        servingSize = builder.servingSize;
        fat = builder.fat;
        calories = builder.calories;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }


}
