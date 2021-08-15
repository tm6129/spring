/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.annotation.reference.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class MyTest3 {
    
    @Test
    public void test01(){
        
        String config = "applicationContext.xml";
        
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        
        Student myStu = (Student) ac.getBean("myStudent3");
        
        System.out.println(myStu);
        
    }
    
}
