/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.annotation.reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author bwu
 */



//可以省略value
@Component("myStudent3")
public class Student {
    
    /**
     * @value 简单类型的属性赋值
     * 
     * 属性：value是string类型的， 表示简单类型的属性值
     * 位置：1.在属性定义的上面，无需set方法，推荐使用
     *      2. 在set方法上面
     */
    
    private String name;
    private int age;
    
    /**
     * @Autowired: spring提供的注解，实现引用类型的赋值 （使用的是自动注入原理，支持byname，bytype）
     * 默认是使用bytype自动注入
     * 
     * 位置：1） 在属性定义的上面，推荐使用 
     *      2) set方面上
     */
    @Autowired
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
