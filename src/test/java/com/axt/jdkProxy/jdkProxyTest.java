package com.axt.jdkProxy;

import org.junit.Test;

/**
 * Created by lenovo on 2019/9/6.
 */
public class jdkProxyTest {
    @Test
    public void test(){
        UserService userService = MyBeanFactory.createUserService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
