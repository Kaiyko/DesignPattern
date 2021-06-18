package com.kaiyko.pattern.component;

/**
 * 测试类
 */
public class TestClient {
    public static void main(String[] args) {
        //  创建菜单项
        MenuComponent menu = new Menu("菜单管理", 2);
        menu.add(new Menu("页面访问", 3));
        menu.add(new Menu("展开菜单", 3));
        menu.add(new Menu("编辑菜单", 3));
        menu.add(new Menu("删除菜单", 3));
        menu.add(new Menu("新增菜单", 3));

        MenuComponent menu2 = new Menu("菜单管理", 2);
        menu2.add(new Menu("页面访问", 3));
        menu2.add(new Menu("提交保存", 3));

        MenuComponent menu3 = new Menu("菜单管理", 2);
        menu3.add(new Menu("页面访问", 3));
        menu3.add(new Menu("新增角色", 3));
        menu3.add(new Menu("修改角色", 3));


        MenuComponent component = new Menu("系统管理", 1);
        component.add(menu);
        component.add(menu2);
        component.add(menu3);

        //  打印菜单名称（如果有子类则一起打印）
        component.print();
    }
}
