package com.alien.gof23.mode1.drawer;

import com.alien.gof23.mode1.command.Command;

import java.awt.Color;

/**
 * program: gof23
 * description: 设置颜色的命令
 *
 * @author: alien
 * @since: 2019/09/08 19:51
 */
public class ColorCommand implements Command {
    /**
     * description: 绘制对象
     * @since: 2019-09-08
     */
    protected Drawable drawable;

    /**
     * description: 颜色
     * @since: 2019-09-08
     */
    private Color color;

    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
