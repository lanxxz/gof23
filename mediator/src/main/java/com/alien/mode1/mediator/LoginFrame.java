package com.alien.mode1.mediator;


import com.alien.mode1.colleague.ColleagueButton;
import com.alien.mode1.colleague.ColleagueCheckbox;
import com.alien.mode1.colleague.ColleagueTextFeild;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: gof23
 * @description: 表示登录回话框的类
 * @author: alien
 * @since: 2019/08/18 21:45
 */
public class LoginFrame extends Frame implements Mediator, ActionListener {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextFeild textUser;
    private ColleagueTextFeild textPassword;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        // 使用 4X2 布局
        setLayout(new GridLayout(4, 2));
        createColleagues();
        // 配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("User Name:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPassword);
        add(buttonOk);
        add(buttonCancel);
        colleagueChanged();
        // 显示
        pack();
        show();
    }


    @Override
    public void createColleagues() {
        CheckboxGroup group = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, true);
        textUser = new ColleagueTextFeild("", 10);
        textPassword = new ColleagueTextFeild("", 10);
        textPassword.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        // 设置 Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPassword.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        // 设置 Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPassword.addTextListener(textPassword);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnabled(false);
            textPassword.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    public void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPassword.setColleagueEnabled(true);
            if (textPassword.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPassword.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

}
