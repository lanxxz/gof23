package com.alien.mode1.colleague;

import com.alien.mode1.mediator.Mediator;

/**
 * @program: gof23
 * @description: 表示向仲裁者进行报告的组员接口
 * @author: alien
 * @since: 2019/08/18 21:33
 */
public interface Colleague {
    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);
}
