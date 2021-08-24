/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.afterreturning;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
     * 后置通知@AfterReturnining定义实现切面功能的方法：
     * 要求如下：
     * 1） public
     * 2） void是返回值
     * 3） 方法名称自定义
     * 4） 方法可以有参数,推荐是Object res, 参数名自定义, 若需要Joinpoint, 则Joinpoint需要放在第一个参数里
     *      
     * 
     */
    
    
    /**
     * @AfterReturnining:后置通知
     *  属性：1. value - 这个value是切入表达式，表示切面功能执行的位置
     *       2. returning - 它是自定义的变量，表示目标方法的返回值。
     *                      自定义的变量名必须和通知方法中的形参名一样
     *  位置： 方法定义的上面
     *  特点：
     * 1） 在目标方法之后先执行
     * 2） 能获取目标方法的返回值，能根据这个返回值做不同的处理
     *      Object res = doOther(); 其实这个res就是目标方法的返回值
     * 3） 可以修改这个返回值
     * 
     * 
     * 后置通知的执行：
     *  Object res = doOther();
     *  myAfterReturning（res）
     * 
     */
    
    
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))", 
                    returning = "res")
    public void myAfterReturning(JoinPoint jp, Object res){
        //这个res就是目标方法执行后的返回值，根据返回值做相对应的处理
        System.out.println("**********AfterReturning advice: execute after target method doOther(), the returning value is:" + res);
        System.out.println("@AfterReturnining: method definition:" + jp.getSignature());
        
        
        if(res.equals("abcd")){
            
        }else{
            
        }
        
        //在切面功能里面修改目标方法的返回值, 目标方法的返回值不变，依然是“abcd”
        if(res != null){
            res = "Hello";
        }
        
    }
    
    
    
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..))", 
                    returning = "res")
    public void myAfterReturning2(Object res){
        //这个res就是目标方法执行后的返回值，根据返回值做相对应的处理
        System.out.println("**********AfterReturning2 advice: execute after target method doOther(), the returning value is:" + res.toString());
        
        //如果我们修改了res的内容，是不是会影响最后的调用结果呢
        Student s = (Student) res;
        System.out.println("myAfterReturning2 s:" + s.toString());
        s.setAge(300);
        
        //成功修改年龄为300
        System.out.println("myAfterReturning2 s:" + s.toString());
    }
}
