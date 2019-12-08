package com.alien.mode1;

/**
 * program: gof23
 * description: 主入口
 *
 * @author: alien
 * @since: 2019/12/08 20:34
 */
public class Client {

    public static void main(String[] args) {
        Factory.get(null).operation();
        System.out.println("=========");
        Factory.get(new Dependency()).operation();
    }
}
