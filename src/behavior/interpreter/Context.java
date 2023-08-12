package behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色类
 * @author all
 * @since 2023/8/11 18:47
 */

public class Context {
    private Map<Variable, Integer> map = new HashMap<>();

    /**
     * 添加变量
     * @param var 变量
     * @param i 值
     */
    public void assign(Variable var, Integer i) {
        map.put(var, i);
    }

    /**
     * 获取值
     * @param var var
     * @return int
     */
    public int getValue(Variable var) {
        return map.get(var);
    }


}
