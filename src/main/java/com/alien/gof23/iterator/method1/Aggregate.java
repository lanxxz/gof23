package com.alien.gof23.iterator.method1;

import java.util.Iterator;

/**
 * 所有遍历的集合的接口<br/>
 * 实现该接口的类将成为一个可以保存多个元素的集合<br/>
 *
 * @author Alien
 * @since 2019/6/23 21:27
 */
public interface Aggregate {
    /**
     * @author Alien
     * @description 迭代器，该方法用于遍历集合的迭代器
     * @date 21:37 2019/6/23
     **/
    Iterator iterator();
}
