/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.around;

import com.company.afterreturning.*;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
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
     * 后置通知@Around定义实现切面功能的方法：
     * 要求如下：
     * 1） public
     * 2） 必须有一个返回值，推荐使用object
     * 3） 方法名称自定义
     * 4） 方法可以有固定参数(ProceedingJoinPoint), 若需要Joinpoint, 则Joinpoint需要放在第一个参数里
     *      
     * 
     */
    
    
    /**
     * @Around: 环绕通知
     *  属性：value - 这个value是切入表达式，表示切面功能执行的位置
     *  位置： 方法定义的上面
     *  特点：   
     *      1. 它是功能最强的通知
     *      2. 它可以在目标方法的前和后都能增强
     *      3. 控制目标方法是否被调用执行
     *      4. 修改原来的目标方法的执行结果。影响最后的调用结果
     * 
     * @Around: 环绕通知 等同于jdk动态代理的invok方法
     * 
     * 参数ProceedingJoinPoint 就等同于 ch05-dynamic-proxy com.company.handler.MyInvocationHandler.public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { } 中的method
     * 
     * 返回值：就是目标方法的执行结果，可以被修改
     * 
     * 
     * @Around: 经常做事务，在目标方法之前开启事务，执行目标方法，在目标方法之后提交事务
     * 
     * @param pjp
     * @return 
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable{
        
        String firstParaName = "";
        //获取目标方法的第一个参数值
        Object[] args = pjp.getArgs();
        if(args != null && args.length > 1){
            Object arg = args[0];
            firstParaName = (String) arg;
        }
        
        //实现@Around
        Object result = null;
        
        //切面功能在目标方法执行之前
        System.out.println("@Around: before target method: date:" + new Date());
        
        //控制目标方法是否被调用执行 - 根据具体条件，看是否执行目标方法
        if(firstParaName.equals("zhangsan")){
            //1. 目标方法调用
            result = pjp.proceed(); // method.invoke(); 也相当于 Object result = doFirst();
        }else{
            
        }
        
         //切面功能在目标方法执行之后
        System.out.println("@Around: after target method, submit transation");
        
        //修改目标方法的返回值，影响方法最后的调用结果
        if(result != null){
            result = "Hello @Around";
        }
        
        return result;
        
    }
    
    
}
