package com.alien.gof23;


/**
 * 表示访问者的抽象类
 *
 * @author alien
 * @since 2019-07-28 14:12
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
