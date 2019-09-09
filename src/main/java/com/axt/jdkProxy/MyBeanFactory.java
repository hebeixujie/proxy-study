package com.axt.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class MyBeanFactory {
    public static UserService createUserService() {
        //目标类
        final UserService uerService = new UserServiceImpl();
        //生成代理类
        UserService proxyService = (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), uerService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("执行" + method.getName() + "前...");
                Object obj = method.invoke(uerService, args);
                System.out.println("执行" + method.getName() + "后...");
                return obj;
            }
        });
        return proxyService;
    }
}
