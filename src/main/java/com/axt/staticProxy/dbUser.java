package com.axt.staticProxy;

/**
 * 目标累
 */
public class dbUser implements UserDao{

    @Override
    public void addUser() {
        System.out.println("添加用户...");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户...");
    }
}
