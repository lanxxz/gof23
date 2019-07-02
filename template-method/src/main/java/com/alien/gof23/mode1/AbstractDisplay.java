package com.alien.gof23.mode1;

/**
 * 抽象类
 *
 * @author Alien
 * @since 2019/6/30 18:07
 */
public abstract class AbstractDisplay {
    /**
     * @author Alien
     * @description 交由子类实现的抽象方法 open
     * @date 18:08 2019/6/30
     **/
    public abstract void open();

    /**
     * @author Alien
     * @description 交由子类实现的抽象方法 print
     * @date 18:15 2019/6/30
     **/
    public abstract  void print();

    /**
     * @author Alien
     * @description 交由子类实现的抽象方法 close
     * @date 18:16 2019/6/30
     **/
    public abstract void close();

    /**
     * @author Alien
     * @description 抽象类中实现的 display 方法<br/>
     *          模板方法，加上 final 修饰<br/>
     * @date 18:16 2019/6/30
     **/
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
