/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.service.SomeService;
import com.company.service.impl.SomeServiceImpl;
import java.util.Arrays;
import java.util.Date;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class MyTest {
    
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
    
    
    @Test
    public void test02(){
        
        /**
         * spring默认创建对象的时间：在spring创造容器(ApplicationContext)的时候，会创建配置文件中所有的对象
         * spring创建对象是默认调用无参数构造方法
         * 
         * 
         */
        
        
        //spring配置文件
        String config = "beans.xml";
        //ApplicationContext是spring容器的对象
        //ClassPathXmlApplicationContext表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        
        //配置文件读取后，在配置文件里面的对象就会被逐一创建，创建跟下面的代码无关，下面代码只是使用
        
        
        SomeService service = (SomeService) ac.getBean("someService");
        System.out.println("test02");
        service.doSome();
        
        
    }
    
    
    /**
     * 获取spring容器中java对象的信息
     */
    @Test
    public void test03(){
        
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        
        int number = ac.getBeanDefinitionCount();
        System.out.println("spring 容器数量："+number);
        
        String[] names = ac.getBeanDefinitionNames();
        System.out.println(Arrays.toString(names));
        
        
    }
    
    
     @Test
    public void test04(){

        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        
        Date  date = (Date) ac.getBean("myDate");
         System.out.println(date);
        
    }
   
}
