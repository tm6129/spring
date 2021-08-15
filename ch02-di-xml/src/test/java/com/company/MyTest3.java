/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.ba03.Student;
import java.io.File;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class MyTest3 {
    
    @Test
    public void test1(){
        
        String config= "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        
        Student s = (Student) ac.getBean("myStudent");
        System.out.println(s);
        
        
         Student s2 = (Student) ac.getBean("myStudent2");
        System.out.println(s2);
        
        Student s3 = (Student) ac.getBean("myStudent3");
        System.out.println(s3);
        
        
        File f = (File) ac.getBean("myFile");
        System.out.println(f.getName());
    }
    
  
   
}
