package com.alien.mode1.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: gof23
 * @description: 表示 {@link Gamer} 状态的类
 * @author: alien
 * @since: 2019/08/21 18:20
 */
public class Memento {
    // 所持有的金币
    int money;
    // 获得的水果
    ArrayList<String> fruits;

    Memento(int money) {
        this.money = money;
        fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
}
