package com.company.service;

import com.company.handler.MyInvocationHandler;
import com.company.service.impl.SomeServiceImpl;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bwu
 */
public class MyApp {
    
    public static void main(String[] args){
        
        //调用dosome，doother
//        SomeService service = new SomeServiceImpl();
//        
//        service.doSome();
//        
//        System.out.println("=======================================");
//        
//        service.doOther();
  

        //使用jdk的proxy创建代理对象
        
        //step 1: 创建目标对象
        SomeService target = new SomeServiceImpl();
     
        //step 2: 创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);
        
        //step 3: 使用proxy创建代理
        SomeService proxy = (SomeService)Proxy.newProxyInstance(target.getClass().getClassLoader(), 
            target.getClass().getInterfaces(), handler);
        
         System.out.println("proxy type:" + proxy.getClass().getName());
        
        //step 4: 通过代理，执行方法，会调用handler中的invoke
        proxy.doSome();
        System.out.println("=======================================");
        proxy.doOther();
        
    }
    
}
