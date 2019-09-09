package com.axt.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib实现动态代理,对被代理对象方法进行拦截
 */
public class MyMethodInterceptor implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("插入前置通知...");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("插入后置通知...");
        return obj;
    }
}
