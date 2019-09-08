package com.alien.gof23.mode1;

/**
 * program: gof23
 * description: 对应 <command> 的类 <br/>
 * <command> ::= <repeat command> | <primitive command>
 * @author: alien
 * @since: 2019/09/08 23:33
 */
public class CommandNode extends Node {
    private Node node;
    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
