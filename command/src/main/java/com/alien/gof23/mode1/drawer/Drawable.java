package com.alien.gof23.mode1.drawer;

/**
 * program: gof23
 * description: 表示"绘制对象"的接口
 *
 * @author: alien
 * @since: 2019/09/08 17:27
 */
public interface Drawable {
    /**
     * method name: draw <br/>
     * description: 绘制对象
     * @param x: x轴
     * @param y: y轴
     * @return: void
     * @since: 2019-09-08
     */
    void draw(int x, int y);
}
