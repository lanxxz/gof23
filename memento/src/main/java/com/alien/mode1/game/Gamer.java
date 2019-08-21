package com.alien.mode1.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: gof23
 * @description: 表示游戏主人公的类
 * @author: alien
 * @since: 2019/08/21 18:21
 */
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<String>();
    private Random random = new Random();
    private static String[] fruitsName = {
            "苹果", "葡萄", "香蕉", "橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    /**
     * method name: bet <br/>
     * @description: 投掷骰子进行游戏
     * @return: void
     * @date: 2019-08-21
     */
    public void bet() {
        int dict = random.nextInt(6) + 1;
        switch (dict) {
            case 1:
                money += 100;
                System.out.println("所持有的金币增加了");
                break;
            case 2:
                money /= 2;
                System.out.println("所持有的金币减半了");
                break;
            case 6:
                String fruit = getFruit();
                System.out.println("获得了水果：" + fruit);
                break;
            default:
                System.out.println("什么都没有发生");
        }
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }

    /**
     * method name: createMemento <br/>
     * @description: 创建快照
     * @return: com.alien.mode1.game.Memento
     * @date: 2019-08-21
     */
    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (String fruit: fruits) {
            if (fruit.startsWith("好吃的")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    /**
     * method name: restoreMemento <br/>
     * @description: 撤销
     * @param memento: 备忘录
     * @return: void
     * @date: 2019-08-21
     */
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
