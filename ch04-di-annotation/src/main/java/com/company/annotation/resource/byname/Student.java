/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.annotation.resource.byname;



import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author bwu
 */

//可以省略value
@Component("myStudent6")
public class Student {
    
    
    @Value("${myname}")
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
    * 
    * @Resource只是用byname方式，需要增加一个属性name， name的值是bean的id
    * 
    * 下面这个例子是使用byname
    * 
    */
    @Resource(name = "myschool4")
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
