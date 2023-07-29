/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.combination;

/**
 * @author all
 * @since 2023/7/21 15:48
 */

public class Client {
    public static void main(String[] args) {
        MenuComponent menu = new Menu("系统管理", 0);
        Menu 用户管理 = new Menu("用户管理", 1);
        用户管理.add(new MenuItem("增加", 2));
        用户管理.add(new MenuItem("修改", 2));
        用户管理.add(new MenuItem("删除", 2));
        menu.add(用户管理);
        Menu 权限管理 = new Menu("权限管理", 1);
        权限管理.add(new MenuItem("授权", 2));
        权限管理.add(new MenuItem("注销", 2));
        menu.add(权限管理);
        Menu 菜单管理 = new Menu("菜单管理", 1);
        菜单管理.add(new MenuItem("增加", 2));
        menu.add(菜单管理);
        menu.print();
    }
}
