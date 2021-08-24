/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.cglib.withInterface.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class CGLIBInterfaceTest {
    
    @Test
    public void test(){
        
        String config = "applicationContext8.xml";
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");

        //目标类没有接口，使用的cglib的动态dialing，spring框架会自动应用cglib
        //com.company.cglib.SomeServiceImpl$$EnhancerBySpringCGLIB$$a83dca28
        System.out.println("proxy:" + proxy.getClass().getName());
        
        //通过代理对象执行目标对象的方法， 实现功能增强
        proxy.doThird();
        
    }
}
