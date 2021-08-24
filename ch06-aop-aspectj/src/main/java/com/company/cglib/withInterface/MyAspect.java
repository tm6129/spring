/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.cglib.withInterface;

import com.company.pointcut.*;
import com.company.after.*;
import com.company.before.*;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author bwu
 */


/**
 * 
 * @Aspect : 是AspectJ框架的注解，在类上面加如这个注解表示当前类是切面类。
 *           它是用来给业务方法增加功能的类，在这个类中有切面的功能代码
 * 
 *      位置：在类的上面
 * 
 * 
 */

@Aspect
public class MyAspect {
    
      
    //@After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    @After(value = "myPointcut()")
    public void myAfter(){
        
        System.out.println("@After: always running");
        //一般是做资源清楚工作
        
    }
    
    
    //@Before(value = "execution(* *..SomeServiceImpl.doThird(..))")
    @Before(value = "myPointcut()")
    public void myBefore(){
        
        System.out.println("@Before: before target method");
        //一般是做资源清楚工作
        
    }
    
    
    /**
     * 
     * @Pointcut: 定义和管理切入点，如果你的项目中有多个切入点表达式是重复的，可以复用的，就可以使用@Pointcut
     *      属性：value 切入点表达式
     *      位置：自定义的方法上面
     * 
     *      特点：
     *      当使用@Pointcut定义在一个方法的上面，此时这个方法的名称就是切入点表达式的别名。
     *      其他的通知中，value属性就可以使用这个方法名称，代替切入点表达式。
     * 
     */
    
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    private void myPointcut(){
        //无需代码
    }
}
