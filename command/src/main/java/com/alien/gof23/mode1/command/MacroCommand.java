package com.alien.gof23.mode1.command;

import java.util.Stack;

/**
 * program: gof23
 * description: 表示"多条命令组合成的命令"的类
 *
 * @author: alien
 * @since: 2019/09/08 17:22
 */
public class MacroCommand implements Command {
    /**
     * description: 命令集合
     * @since: 2019-09-08
     */
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        for (Command command: commands) {
            command.execute();
        }
    }

    /**
     * method name: append <br/>
     * description: 添加命令
     * @param cmd: 命令
     * @return: void
     * @since: 2019-09-08
     */
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    /**
     * method name: undo <br/>
     * description: 删除最后一条命令

     * @return: void
     * @since: 2019-09-08
            */
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    /**
     * method name: clear <br/>
     * description: 清空命令

     * @return: void
     * @since: 2019-09-08
     */
    public void clear() {
        commands.clear();
    }
}
