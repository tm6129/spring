/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class MyTest5 {
    
    @Test
    public void test1(){
        
        String config= "ba05/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        
        Student s = (Student) ac.getBean("myStudent");
        System.out.println(s);
    }
    
  
   
}
