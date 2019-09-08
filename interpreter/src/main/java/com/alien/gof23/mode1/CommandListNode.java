package com.alien.gof23.mode1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * program: gof23
 * description: 对应 <commandlist> 的类 <br/>
 * <commandlist> ::= <command> * end
 * @author: alien
 * @since: 2019/09/08 23:17
 */
public class CommandListNode extends Node {
    private List<Node> list = Lists.newLinkedList();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if ("end".equals(context.currentToken())) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
