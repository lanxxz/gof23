package com.alien.mode1.colleague;

import com.alien.mode1.mediator.Mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @program: gof23
 * @description: 表示勾选框(此处为单选框)的类
 * @author: alien
 * @since: 2019/08/18 21:42
 */
public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        mediator.colleagueChanged();
    }

}
