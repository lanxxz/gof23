package com.alien.mode1.colleague;

import com.alien.mode1.mediator.Mediator;

import java.awt.Button;


/**
 * @program: gof23
 * @description: 表示按钮的类
 * @author: alien
 * @since: 2019/08/18 21:35
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
