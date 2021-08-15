/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.annotation.reference.byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author bwu
 */

//可以省略value
@Component("myStudent4")
public class Student {
    
    
    private String name;
    private int age;
    
    /**
     * @Autowired: spring提供的注解，实现引用类型的赋值 （使用的是自动注入原理，支持byname，bytype）
     * 默认是使用bytype自动注入
     * 
     * 属性：required: 是一个boolean类型的，默认是true
     *      当required=true， 若引用类型赋值失败，程序报错，并终止执行 - 若把@Qualifier("myschool2")改成@Qualifier("myschool2-2"),就会报错
     *      当required=false， 若引用类型赋值失败，程序正常执行，引用类型是null - 若把@Qualifier("myschool2")改成@Qualifier("myschool2-2"),不会报错，但school是null
     * 
     * 
     * 位置：1） 在属性定义的上面，推荐使用 
     *      2) set方面上
     * 
     * 
     * 如果@Autowired要使用byname方式赋值，需要做：
     * 1. 在属性上面加入@autowired
     * 2. 在属性上面加入@qualifier（value="bean的id"）：表示使用指定名称的bean完成赋值
     * 
     */
    @Autowired
    @Qualifier("myschool2")
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
