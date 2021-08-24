/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.before;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
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
     * 定义实现切面功能的方法：
     * 要求如下：
     * 1） public
     * 2） void是返回值
     * 3） 方法名称自定义
     * 4） 方法可以有参数，也可以没参数
     *      如果有参数，参数不是自定义的，有几个参数类型可以使用。
     * 
     */
    
    
    /**
     * @Before:前置通知
     *  属性：value - 这个value是切入表达式，表示切面功能执行的位置
     *  位置： 方法的上面
     *  特点：
     * 1） 在目标方法之前先执行
     * 2） 不会改目标方法的执行结果
     * 3） 不会影响目标方法的执行
     */
    
    //原始方法
//    @Before(value = "execution(public void com.company.before.SomeServiceImpl.doSome(String, Integer))")
//    public void myBefore(){
//        //切面要执行的代码
//        
//        System.out.println("function: before execute the target method, print the date" + new Date());
//    }
    
    
/*  
    //第1次改进切入表达式
    @Before(value = "execution(void com.company.before.SomeServiceImpl.doSome(String, Integer))")
    public void myBefore(){
        //切面要执行的代码
        
        System.out.println("1 function: before execute the target method, print the date" + new Date());
    }
*/    
    

/*    
    //第2次改进切入表达式
    @Before(value = "execution(void *..SomeServiceImpl.doSome(String, Integer))")
    //
    public void myBefore(){
        //切面要执行的代码
        
        System.out.println("2 function: before execute the target method, print the date" + new Date());
    }
*/
  
    
/*  
    //第3次改进切入表达式
    @Before(value = "execution(void *..SomeServiceImpl.doSome(..))")
    public void myBefore(){
        //切面要执行的代码
        
        System.out.println("3 function: before execute the target method, print the date" + new Date());
    }
*/ 
    
/*    
    //第4次改进切入表达式
    @Before(value = "execution(void *..SomeServiceImpl.do*(..))")
    public void myBefore(){
        //切面要执行的代码
        
        System.out.println("4 function: before execute the target method, print the date" + new Date());
    }
*/
    
/*    
    //第5次改进切入表达式
    @Before(value = "execution(void do*(..))")
    public void myBefore(){
        //切面要执行的代码
        
        System.out.println("5 function: before execute the target method, print the date" + new Date());
    }
    
    //同时多个前置通知
    @Before(value = "execution(void *..SomeServiceImpl.do*(..))")
    public void myBefore2(){
        //切面要执行的代码
        
        System.out.println("5.2 function: before execute the target method, print the date" + new Date());
    }
*/    
    

/*    
    //错误示范，没代理，没对象
    @Before(value = "execution(void *..SomeServiceImpl.doSome(Integer))")
    public void myBeforeError(){
        //切面要执行的代码
        
        System.out.println("Error function: before execute the target method, print the date" + new Date());
    }
*/
    
    


    /**
     * 指定通知方法（如@Before...）中的参数：JoinPoint
     * JoinPoint代表的是业务方法，就是要加入切面功能的业务方法，下面的例子就是doSome
     *   作用是：可以在通知方法（@Before）中获取业务方法（doSome）执行时的信息，例如方法名称，方法的实参
     *   如果你的切面功能中需要用到方法的信息，就加入JoinPoint
     *   JoinPoint参数的值是由框架赋予的，必须是第一个位置的参数
     * 
     * 
     * 
     */
    @Before(value = "execution(public void com.company.before.SomeServiceImpl.doSome(String, Integer))")
    public void myBefore(JoinPoint jp){
        
        //获取业务方法的完整定义
        System.out.println("method definition:" + jp.getSignature());
        System.out.println("method name:" + jp.getSignature().getName());
        //获取方法的实参
        Object args[] = jp.getArgs();
        for(Object arg : args){
            System.out.println("Parameter:" + arg);
        }
        
        //切面要执行的代码
        System.out.println("function: before execute the target method, print the date" + new Date());
    }
}
