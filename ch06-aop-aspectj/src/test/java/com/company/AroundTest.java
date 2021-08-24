/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.around.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class AroundTest {
    
    @Test
    public void test(){
        
        String config = "applicationContext3.xml";
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
      
        //通过代理对象执行目标对象的方法， 实现功能增强
        String result = proxy.doFirst("zhangsan", 27);//实际是执行了myaround的方法
        System.out.println("result:" + result);
        
        
        //String result2 = proxy.doFirst("zhangsan1", 27);//实际是执行了myaround的方法, 但没有实际执行目标方法
        
        
    }
}
