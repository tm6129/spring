/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.util;

import java.util.Date;

/**
 *
 * @author bwu
 */
public class ServiceTools {
 
    public static void doLog(){
        
        //非业务方法
        System.out.println("non-buiness method run time:" + new Date());
       
    }
    
    
    public static void doTransation(){
        //方法的最后，提交业务
        System.out.println("business method done, submit database query");
    }
    
    
}
