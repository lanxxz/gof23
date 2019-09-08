package com.alien.gof23.mode1.drawer;

import com.alien.gof23.mode1.command.Command;

import java.awt.Point;

/**
 * program: gof23
 * description: 表示"绘制一个点的命令"的类
 *
 * @author: alien
 * @since: 2019/09/08 17:24
 */
public class DrawCommand implements Command {
    /**
     * description: 绘制对象
     * @since: 2019-09-08
     */
    protected Drawable drawable;

    /**
     * description: 绘制位置
     * @since: 2019-09-08
     */
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
