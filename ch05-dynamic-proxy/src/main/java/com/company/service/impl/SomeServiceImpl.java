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
public class SomeServiceImpl implements SomeService{

    @Override
    public void doSome() {
        
        //ServiceTools.doLog(); 用动态代理实现
        
        System.out.println("start business method - dosome");
        
        //ServiceTools.doTransation(); 用动态代理实现
    }
    

    @Override
    public void doOther() {
        
        //ServiceTools.doLog(); 用动态代理实现
        
        System.out.println("start business method - doOther");
        
        //ServiceTools.doTransation(); 用动态代理实现
    }
    
    
    
    
    
}
