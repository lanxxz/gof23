package com.alien.gof23.mode1;

/**
 * program: gof23
 * description: 对应 <program> 的类 <br/>
 * <program> ::= program <command list> <br/>
 * @author: alien
 * @since: 2019/09/08 23:08
 */
public class ProgramNode extends Node {
    private Node commandlistNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandlistNode = new CommandListNode();
        commandlistNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + commandlistNode + "]";
    }
}
