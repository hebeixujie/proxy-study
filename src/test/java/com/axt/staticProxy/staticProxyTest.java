package com.axt.staticProxy;

import org.junit.Test;

/**
 * Created by lenovo on 2019/9/6.
 */
public class staticProxyTest {
    @Test
    public void test(){
        StaticProxyUser staticProxyUser = new StaticProxyUser(new dbUser());
        staticProxyUser.addUser();
        staticProxyUser.deleteUser();
        System.out.println("静态代理总结:");
        System.out.println("1.可以做到在不修改目标对象的功能前提下,对目标功能扩展");
        System.out.println("2.缺点: ");
        System.out.println("因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.");
    }
}
