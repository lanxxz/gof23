package com.alien.gof23.mode1;

/**
 * program: gof23
 * description: 对应 <primitive command> 的类
 *
 * @author: alien
 * @since: 2019/09/08 23:39
 */
public class PrimitiveCommandNode extends Node {
    private String name;
    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!"go".equals(name) && !"right".equals(name) && !"left".equals(name)) {
            throw new ParseException(name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
