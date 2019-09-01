package com.alien.mode2;

/**
 * program: gof23
 * description: 主入口<br/>
 * 模拟电梯的运行
 * @author: alien
 * @since: 2019/09/01 17:50
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(ClosingState.getInstance());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
