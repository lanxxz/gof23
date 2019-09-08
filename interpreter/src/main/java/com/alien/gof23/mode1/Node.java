package com.alien.gof23.mode1;

/**
 * program: gof23
 * description: 比欧式语法树节点的类
 *
 * @author: alien
 * @since: 2019/09/08 22:43
 */
public abstract class Node {
    /**
     * method name: parse <br/>
     * description: 解析语法
     * @param context:
     * @return: void
     * @since: 2019-09-08
     */
    public abstract void parse(Context context) throws ParseException;
}
