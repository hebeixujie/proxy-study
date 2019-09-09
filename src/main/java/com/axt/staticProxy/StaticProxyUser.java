package com.axt.staticProxy;

/**
 * 代理类
 */
public class StaticProxyUser implements UserDao{
    private dbUser target;

    public StaticProxyUser(dbUser target) {
        this.target = target;
    }
    @Override
    public void addUser() {
        System.out.println("开始添加用户...");
        target.addUser();
        System.out.println("添加用户结束...");
    }
    @Override
    public void deleteUser() {
        System.out.println("开始删除用户...");
        target.deleteUser();
        System.out.println("删除用户结束...");
    }
}
