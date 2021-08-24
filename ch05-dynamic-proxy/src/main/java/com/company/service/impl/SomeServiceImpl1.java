/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.impl;

import com.company.service.SomeService;
import com.company.util.ServiceTools;
import java.util.Date;

/**
 *
 * @author bwu
 */

//service类的代码不修改，也能够增加，输出时间，事务
public class SomeServiceImpl1 implements SomeService{

       @Override
    public void doSome() {
        
        System.out.println("method run time:" + new Date());
        
        System.out.println("start business method - dosome");
        
        System.out.println("business method done, submit database query");
    }
    

    @Override
    public void doOther() {
        
        System.out.println("method run time:" + new Date());
        
        System.out.println("start business method - doOther");
        
        System.out.println("business method done, submit database query");
    }
    
    
    
    
    
    
}
