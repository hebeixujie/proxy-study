package com.axt.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * Cglib动态代理
 */
public class cglibProxyTest {
    @Test
    public void test() {
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(HelloService.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());

        // 创建代理对象
        HelloService service = (HelloService) enhancer.create();
        // // 通过代理对象调用目标方法
        service.sayHello();
        service.sayOthers("该方法不能被子类覆盖,Cglib是无法代理final修饰的方法的");
    }
}
