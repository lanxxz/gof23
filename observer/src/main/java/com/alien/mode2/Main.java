package com.alien.mode2;

import java.util.HashSet;

/**
 * @program: gof23
 * @description: 主入口<br/>
 * 本实例实现的是当集合添加元素时，打印出元素的值
 * @author: alien
 * @since: 2019/08/21 16:48
 */
public class Main {
    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

        set.addObserver((s, e) -> System.out.println(e));

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }

    }
}
