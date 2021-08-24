/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.after;

import com.company.before.*;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
     * 最终通知@After定义实现切面功能的方法：
     * 要求如下：
     * 1） public
     * 2） 没有返回值
     * 3） 方法名称自定义
     * 4） 方法没有参数，但可以有Joinpoint, 则Joinpoint需要放在第一个参数里
     *      
     * 
     */
    
    
    /**
     * 最终通知@After 
     *  属性：value - 这个value是切入表达式，表示切面功能执行的位置
     *  位置： 方法的上面
     *  特点：
     * 1） 总是会执行
     * 2） 在目标方法之后执行的
     * 
     * 
     * 相当于
     * try{
     *      SomeServiceImpl.doThird(..)
     * }catch(Exception e){
     * 
     * }finally{
     *      myAfter()
     * }
     */
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myAfter(){
        
        System.out.println("@After: always running");
        //一般是做资源清楚工作
        
    }
}
