/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.cglib;

import com.company.pointcut.*;
import com.company.after.*;


/**
 *
 * @author bwu
 */


//SomeServiceImpl - 这是目标类

public class SomeServiceImpl {

    public void doThird() {
        System.out.println("====TARGET METHOD DOTHIRD()====" );
    }
    
}
