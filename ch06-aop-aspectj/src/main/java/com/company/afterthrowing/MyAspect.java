/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.afterthrowing;

import com.company.before.*;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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
    
    /**
     * 
     * 异常通知@AfterThrowing定义实现切面功能的方法：
     * 要求如下：
     * 1） public
     * 2） 没有返回值
     * 3） 方法名称自定义
     * 4） 方法有一个参数Exception, 若需要Joinpoint, 则Joinpoint需要放在第一个参数里
     *      
     * 
     */
    
    
    /**
     * @AfterThrowing:异常通知
     *  属性：1. value - 这个value是切入表达式，表示切面功能执行的位置
     *       2. throwing 自定义变量, 表示目标方法抛出的异常对象，变量名必须和方法的参数名一样
     *  位置： 方法的上面
     *  特点：
     * 1） 在目标方法抛出异常时执行
     * 2） 可以做异常的监控程序，监控目标方法执行时是不是有异常
     *     如果有异常，可以发送邮件，短信进行通知
     * 
     * 
     * 执行就是：
     * try{
     *      SomeServiceImpl.doSecond(..)
     * }catch(Exception ex){
     *      myAfterThrowing(ex);
     * }
     * 
     */
    
    @AfterThrowing(value = "(execution(* *..SomeServiceImpl.doSecond(..)))", throwing = "ex")
    public void myAfterThrowing(Exception ex){
        System.out.println("@AfterThrowing: exception in target method:" + ex.getMessage());
        
        //可以发送邮件，短信进行通知
    }
}
