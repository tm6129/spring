/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.ba01.Student;
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
    public void test1(){
        
        String config= "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        
        Student s = (Student) ac.getBean("myStudent");
        System.out.println(s);
        
        Date myDate = (Date) ac.getBean("myDate");
        System.out.println("myDate:" + myDate);
        
    }
    
    @Test
    public void test2(){
        System.out.println("asdfasfas");
    }
   
}
