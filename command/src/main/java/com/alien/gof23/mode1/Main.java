package com.alien.gof23.mode1;

import com.alien.gof23.mode1.command.Command;
import com.alien.gof23.mode1.command.MacroCommand;
import com.alien.gof23.mode1.drawer.ColorCommand;
import com.alien.gof23.mode1.drawer.DrawCanvas;
import com.alien.gof23.mode1.drawer.DrawCommand;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * program: gof23
 * description: 主入口
 *
 * @author: alien
 * @since: 2019/09/08 17:15
 */
public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    /**
     * description: 绘制的历史记录
     * @since: 2019-09-08
     */
    private MacroCommand history = new MacroCommand();

    /**
     * description: 绘制区域
     * @since: 2019-09-08
     */
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    /**
     * description: 删除按钮
     * @since: 2019-09-08
     */
    private JButton clearButton = new JButton("clear");

    /**
     * description: 红色按钮
     * @since: 2019-09-08
     */
    private JButton redButton = new JButton("red");

    /**
     * description: 绿色按钮
     * @since: 2019-09-08
     */
    private JButton greenButton = new JButton("green");

    /**
     * description: 蓝色按钮
     * @since: 2019-09-08
     */
    private JButton buleButton = new JButton("bule");

    /**
     * description: 撤销按钮
     * @since: 2019-09-08
     */
    private JButton undoButton = new JButton("undo");


    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        buleButton.addActionListener(this);
        undoButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(buleButton);
        buttonBox.add(undoButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        } else if (e.getSource() == redButton) {
            Command command = new ColorCommand(canvas, Color.red);
            history.append(command);
            command.execute();
        } else if (e.getSource() == greenButton) {
            Command command = new ColorCommand(canvas, Color.green);
            history.append(command);
            command.execute();
        } else if (e.getSource() == buleButton) {
            Command command = new ColorCommand(canvas, Color.blue);
            history.append(command);
            command.execute();
        } else if (e.getSource() == undoButton) {
            history.undo();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command command = new DrawCommand(canvas, e.getPoint());
        history.append(command);
        command.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

}
