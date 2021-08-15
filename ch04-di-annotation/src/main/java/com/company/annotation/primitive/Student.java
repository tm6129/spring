/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.annotation.primitive;

import com.company.annotation.component.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author bwu
 */



//可以省略value
@Component("myStudent2")
public class Student {
    
    /**
     * @value 简单类型的属性赋值
     * 
     * 属性：value是string类型的， 表示简单类型的属性值
     * 位置：1.在属性定义的上面，无需set方法，推荐使用
     *      2. 在set方法上面
     */
    
    @Value("zhangsan") //== @Value(value="zhangsan")
    private String name;
    //@Value("29") //@Value(value="29")
    private int age;

    public Student() {
        System.out.println("constructor no varialbes");
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Value("39")
    public void setAge(int age) {
        System.out.println("setAge:" + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    
}
