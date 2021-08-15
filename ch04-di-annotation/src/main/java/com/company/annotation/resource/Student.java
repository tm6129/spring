/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.annotation.resource;


import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 *
 * @author bwu
 */

//可以省略value
@Component("myStudent5")
public class Student {
    
    
    private String name;
    private int age;
    
  
   /**
    * 引用类型
    * @Resource 来自jdk的注解，spring提供了对这个这届的功能注解支持，可以使用它个引用类型赋值，使用的也是自动注入原则，支持byname，bytype, 默认是byname
    * 
    * 
    * 使用位置：1.在属性定义上面，无需set方法，推荐使用
    *       2. 在set方法上面
    * 
    * 先使用byname自动注入，如果失败，再使用bytype
    * 下面这个例子是使用bytype
    * 
    */
    @Resource
    private School school;

    public Student() {
        System.out.println("constructor no varialbes");
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", school=" + school + '}';
    }

    
    
    
    
}
