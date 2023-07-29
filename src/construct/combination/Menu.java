/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.combination;

import java.util.LinkedList;
import java.util.List;

/**
 * @author all
 * @since 2023/7/21 10:39
 */

public class Menu extends MenuComponent{

    private List<MenuComponent> list = new LinkedList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    /**
     * @param menu
     */
    @Override
    public void add(MenuComponent menu) {
        list.add(menu);
    }

    /**
     * @param menu
     */
    @Override
    public void remove(MenuComponent menu) {
        list.remove(menu);
    }

    /**
     * @param index
     * @return
     */
    @Override
    public MenuComponent get(int index) {
        return list.get(index);
    }

    /**
     * @return
     */
    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menu : list) {
            menu.print();
        }
    }
}
