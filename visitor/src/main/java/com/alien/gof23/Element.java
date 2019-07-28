package com.alien.gof23;

/**
 * 表示数据结构的接口，接受访问者的访问
 *
 * @author alien
 * @since 2019-07-28 14:17
 */
public interface Element {
    public void accept(Visitor visitor);
}
