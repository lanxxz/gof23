package com.alien.mode1.colleague;

import com.alien.mode1.mediator.Mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @program: gof23
 * @description: 表示文本输入框的类
 * @author: alien
 * @since: 2019/08/18 21:38
 */
public class ColleagueTextFeild extends TextField implements Colleague, TextListener {
    private Mediator mediator;
    public ColleagueTextFeild(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled? Color.WHITE: Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
