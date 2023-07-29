/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.combination;

/**
 * @author all
 * @since 2023/7/21 10:30
 */

public abstract class MenuComponent {
    protected String name;
    protected int level;
    public void add(MenuComponent menu) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menu) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent get(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
