package com.alien.gof23.mode1;

/**
 * program: gof23
 * description: 对应 <repeat command> 的类 <br/>
 * <repeat> ::= repeat <number><command list>
 * @author: alien
 * @since: 2019/09/08 23:39
 */
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[Repeat " + number + " " + commandListNode + ']';
    }
}
