package com.alien.mode1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * program: gof23
 * description: 实现报警系统界面的类，实现了 {@link Context}
 *
 * @author: alien
 * @since: 2019/08/29 22:01
 */
public class SafeFrame<zs> extends Frame implements ActionListener, Context {
    /**
     * description: 显示当前时间
     * @date: 2019-08-29
     */
    private TextField textClock = new TextField(60);
    /**
     * description: 显示报警中心的记录
     * @date: 2019-08-29
     */
    private TextArea textScreen = new TextArea(10, 60);
    /**
     * description: 使用金库的按钮
     * @date: 2019-08-29
     */
    private Button buttonUse = new Button("使用金库");
    /**
     * description: 按下警龄按钮
     * @date: 2019-08-29
     */
    private Button buttonAlarm = new Button("警铃");
    /**
     * description: 正常通话按钮
     * @date: 2019-08-29
     */
    private Button buttonPhone = new Button("正常通话");
    /**
     * 结束按钮
     * @since 2019-08-29
     */
    private Button buttonExit = new Button("结束");

    /**
     * description: 当前状态
     * @since: 2019-08-29
     */
    private State state = DayState.getInstance();

    /**
     * description: 构造函数
     * @since: 2019-08-29
     */
    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        // 配置 textClock
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        // 配置 textScreen
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // 为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 配置界面
        add(panel, BorderLayout.SOUTH);
        // 显示
        pack();
        show();
        // 设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void setClock(int hour) {
        StringBuilder clockSb = new StringBuilder();
        clockSb.append("现在时间是 ");
        if (hour < 10) {
            clockSb.append("0").append(hour).append(":00");
        } else {
            clockSb.append(hour).append(":00");
        }
        System.out.println(clockSb);
        textClock.setText(clockSb.toString());
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.err.println("?");
        }
    }
}
