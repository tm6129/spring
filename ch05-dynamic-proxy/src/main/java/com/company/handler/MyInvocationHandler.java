/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.handler;

import com.company.util.ServiceTools;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author bwu
 */
public class MyInvocationHandler implements InvocationHandler{

    private Object target;//最终会是SomeServiceImpl类

    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
     
        System.out.println("run MyInvocationHandler invoke()");
        System.out.println("method name:" + method.getName());
        String methodName = method.getName();
        
        //通过代理对象proxy执行方法时，会调用invoke（）, 代码来看就是Myapp中的proxy.doSome();
        Object res = null;
        
        
        
        if("doSome".equals(methodName)){
            ServiceTools.doLog();//在目标方法之前，输出时间
            //执行目标类的方法，通过Method类实现
            res = method.invoke(target, args);//相当于SomeServiceImpl.doSome(), doOther()

            ServiceTools.doTransation();//在目标执行之后，提交事务
        
        }else{
            res = method.invoke(target, args);//相当于SomeServiceImpl.doSome(), doOther()
        }
        
        //返回目标方法执行结果
        return res;
    }
    
    
    
}
