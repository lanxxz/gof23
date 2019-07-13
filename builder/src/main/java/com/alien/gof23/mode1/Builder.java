package com.alien.gof23.mode1;

/**
 * 文档操作父类
 *
 * @author Alien
 * @since 2019/7/13 18:15
 */
public abstract class Builder {
    /**
     * @author Alien
     * @description 设置标题
     * @date 18:18 2019/7/13
     * @param title 标题
     * @return void
     **/
    public abstract void makeTitle(String title);

    /**
     * @author Alien
     * @description 输入字符串
     * @date 18:19 2019/7/13
     * @param str
     * @return void
     **/
    public abstract void makeString(String str);

    /**
     * @author Alien
     * @description 含有条目
     * @date 18:19 2019/7/13
     * @param items
     * @return void
     **/
    public abstract void makeItem(String[] items);

    /**
     * @author Alien
     * @description 关闭文件
     * @date 18:19 2019/7/13
     **/
    public abstract void close();

}
