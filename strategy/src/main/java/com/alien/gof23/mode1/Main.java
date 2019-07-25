package com.alien.gof23.mode1;

import java.sql.SQLOutput;

/**
 * 主入口
 *
 * @author alien
 * @since 2019-07-25 22:37
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player taro = new Player("Taro", new WinningStrategy(seed1));
        Player hana = new Player("Hana", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand hand1 = taro.nextHand();
            Hand hand2 = hana.nextHand();
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner:" + taro);
                taro.win();
                hana.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                System.out.println("Winner:" + hana);
                taro.lose();
                hana.win();
            } else {
                System.out.println("Even...");
                taro.even();
                hana.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(taro.toString());
        System.out.println(hana.toString());
    }
}
