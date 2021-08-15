/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.annotation.component;

import org.springframework.stereotype.Component;

/**
 *
 * @author bwu
 */

/**
 * 
 * @Component 创建对象的，等同于<bean>的功能
 *      属性：value就是对象的名称，也就是bean的id值
 *          value的值是唯一的，创建的对象在整个spring容器就一个
 *      位置：只能在类的上面
 * 
 * @Component(value="myStudent") 等同于
 *  <bean id="myStudent" class="om.company.annotation.component">
 * 
 * Spring 中和component功能一致，创建对象的注解还有：
 * 1. @Repository（用在持久层类的上面）: 放在DAO的实现类上面，表示创建dao对象，dao对象是能访问数据库的
 * 2. @Service (用在业务层类的上面)： 放在service的实现类上面，表示创建service对象，service对象是做业务处理的，可以有事务等功能的
 * 3. @Controller (用在控制器类的上面)： 放在controller的类上面，表示创建controller对象，controller对象是能够接受用户提交的参数，显示请求的处理结果 （servlet）
 * 
 * 以上三个注解的使用语法和@Component一样，都能创建对象，但是这三个注解还有额外的功能
 * 
 * @Repository，@Service，@Controller 给项目的对象分层
 * 
 * @author bwu
 */

//使用values户型，指定对象名称
//@Component(value="myStudent")

//可以省略value
@Component("myStudent")

//不指定对象名称，由spring提供默认名称 (class name首字母小写) = @Component("student")
//@Component 

public class Student {
    
    private String name;
    private int age;

    public Student() {
        //System.out.println("constructor no varialbes");
    }

    
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    
}
