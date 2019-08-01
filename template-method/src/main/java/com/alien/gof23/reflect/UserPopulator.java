package com.alien.gof23.reflect;

/**
 * 模拟用户数据初始化<br/>
 * 该类中的方法必须符合父类中模板方法的鉴别条件才会被调用
 *
 * @author alien
 * @since 2019-08-01 22:45
 */
public class UserPopulator extends AbsPopulator {

    public void initUser() {
        System.out.println("初始化用户表，如创建、加载数据等");
    }

    public void initPasswoed() {
        System.out.println("初始化密码");
    }

    public void initJobs() {
        System.out.println("初始化工作任务");
    }

}
