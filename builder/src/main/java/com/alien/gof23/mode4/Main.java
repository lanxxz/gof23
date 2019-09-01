package com.alien.gof23.mode4;

/**
 * program: gof23
 * description: 主入口<br/>
 * 建造者模式变种，添加编译器非空保障<br/>
 * 使用幽灵类型: 这种类型往往在运行时可以消失，因为在运行时没有任何作用，
 * 它们最大的特点就是没有任何实例（Java 的 Void 就是幽灵类型的例子），
 * 我们可以通过合理应用幽灵类型来提高代码的正确性。<br/>
 * 这种模式有一个缺点，别扭的 build 方法调用，它不再是链式的<br/>
 *
 * @author: alien
 * @since: 2019/09/01 20:38
 */
public class Main {
    public static void main(String[] args) {
        // 编译报错
//        User user1 = User.build(User.builder().name("milo"));
//        User user2 = User.build(User.builder().password("123456"));

        //编译成功
        User user3 = User.build(User.builder().password("123456").name("milo"));

        // 编译不通过
//        User2 user21 = User2.build(User2.builder().password("123456"));

        // 编译通过
        User2 user22 = User2.build(User2.builder().name("milo"));
        User2 user23 = User2.build(User2.builder().name("molo").password("123456"));
    }
}
