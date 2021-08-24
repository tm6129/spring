/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.before.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class BeforeTest {
    
    @Test
    public void test(){
        
        String config = "applicationContext.xml";
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        //proxy类型值：com.sun.proxy.$Proxy8 - JDK 动态代理
        System.out.println("proxy type:" + proxy.getClass().getName());
        
        
        //通过代理对象执行目标对象的方法， 实现功能增强
        proxy.doSome("zhangsan", 21);
        
    }
}
