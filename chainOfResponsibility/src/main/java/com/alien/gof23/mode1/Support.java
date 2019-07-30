package com.alien.gof23.mode1;

/**
 * 用来解决问题的抽象类
 *
 * @author alien
 * @since 2019-07-30 22:01
 */
public abstract class Support {
    private String name;
    private Support next;
    public Support(String name) {
        this.name = name;
    }
    // 设置要推卸责任的对象
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
    // 解决问题的方法
    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " can not be resolved.");
    }
    // 解决问题的步骤
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "{" +  name + '}';
    }
}
