package com.alien.mode1;

import com.alien.mode1.game.Gamer;
import com.alien.mode1.game.Memento;

/**
 * @program: gof23
 * @description: 主入口
 * @author: alien
 * @since: 2019/08/21 18:10
 */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("======");
            System.out.println("当前状态：" + gamer);
            gamer.bet();
            System.out.println("所持有的金币：" + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("所持有的金币增加了好多，因此保存当前状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney()/2) {
                System.out.println("所持有金币减少了好多，因此恢复至以前状态");
                gamer.restoreMemento(memento);
            }
        }


    }
}
