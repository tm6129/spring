/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.impl;

import com.company.service.SomeService;

/**
 *
 * @author bwu
 */
public class SomeServiceImpl implements SomeService{

    public SomeServiceImpl(){
        System.out.println("creator");
    }
    
    @Override
    public void doSome() {
        System.out.println("executed SomeServiceImpl doSome()");
    }
    
    
    
}
