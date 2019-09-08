package com.alien.gof23.mode1.drawer;

import com.alien.gof23.mode1.command.MacroCommand;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 * program: gof23
 * description: 实现"绘制对象"的类
 *
 * @author: alien
 * @since: 2019/09/08 17:29
 */
public class DrawCanvas extends Canvas implements Drawable {
    /**
     * description: 颜色
     * @since: 2019-09-08
     */
    private Color color;

    /**
     * description: 要绘制圆点的半径
     * @since: 2019-09-08
     */
    private int radius;

    /**
     * description: 命令的历史记录
     * @since: 2019-09-08
     */
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
        init();
    }

    /**
     * method name: init <br/>
     * description: 初始化

     * @return: void
     * @since: 2019-09-08
     */
    public void init() {
        color = Color.red;
        radius = 6;
        history.append(new ColorCommand(this, color));
    }

    /**
     * method name: paint <br/>
     * description: 重新全部绘制
     * @param g:
     * @return: void
     * @since: 2019-09-08
     */
    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
