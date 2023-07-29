/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.command;

import java.util.LinkedList;
import java.util.List;

/**
 * 服务员类，请求者角色
 * @author all
 * @since 2023/7/26 15:09
 */

public class Waitor {
    private List<Command> commands = new LinkedList<>();
    public void setCommand(Command command) {
        commands.add(command);
    }

    public void orderUp() {
        System.out.println("Ordering...");
        if (commands != null && commands.size() > 0) {
            commands.forEach(Command::execute);
        }
    }

}
