/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.afterreturning.SomeService;
import com.company.afterreturning.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class AfterReturningTest {
    
    @Test
    public void test(){
        
        String config = "applicationContext2.xml";
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        
        //通过代理对象执行目标对象的方法， 实现功能增强
        String result = proxy.doOther("zhangsan2", 28);
        
        System.out.println("AfterReturningTest.test() result:" + result);
        
    }
    
    
    @Test
    public void test2(){
        
        String config = "applicationContext2.xml";
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        
        //通过代理对象执行目标对象的方法， 尝试修改student的值，不成功！
        Student s  = proxy.doOther2("lallala", 288);
        
        
        //年龄在切面功能成功被修改为300
        System.out.println("AfterReturningTest.test2() result:" + s.toString());
        
    }
}
