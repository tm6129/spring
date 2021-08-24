/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.afterreturning;

import com.company.before.*;

/**
 *
 * @author bwu
 */


//SomeServiceImpl - 这是目标类

public class SomeServiceImpl implements SomeService{
    
    @Override
    public void doSome(String name, Integer age){
        
        //目标方法doSome
        //给doSome方法增加一个功能，在doSome执行之前，输出方法的执行时间
        System.out.println("====target method doSome()====");
        
    }

    @Override
    public String doOther(String name, Integer age) {
        
        System.out.println("====target method doOther()====");
        return "abcd";
        
        //给目标方法doOther之后增加一个事务
    }

    @Override
    public Student doOther2(String name, Integer age) {
        
        Student s = new Student();
        s.setName("lisi");
        s.setAge(18);
        return s;
        
        
    }
    
}
