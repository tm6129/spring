/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import com.company.ba06.Student;
import java.net.URL;
import java.net.URLClassLoader;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bwu
 */
public class MyTest6 {
    
    @Test
    public void test1(){
        
        ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
        
        String config= "ba06/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        
        Student s = (Student) ac.getBean("myStudent");
        System.out.println(s);
    }
    
  
   
}
