package com.alien.gof23.mode5;


import com.alien.gof23.mode5.user1.User;
import com.alien.gof23.mode5.user2.User2;

/**
 * program: gof23
 * description: 主入口<br/>
 * 分段生成器模式:指为每一个字段的赋值都定义专门的类和方法<br/>
 *
 * @author: alien
 * @since: 2019/09/01 20:59
 */
public class Main {
    public static void main(String[] args) {
        // 编译错误
//        new User("moli", "123456");

        User user = User.builder().name("moli")
                .password("123456").build();

        // 默认值处理方案
        User2.builder2().name("milo").password("123456").build();

        // 函数式表达式实现
        User2.builder().apply("milo").apply("123456").get();

    }
}
