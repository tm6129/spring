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
public interface SomeService {
    
    void doSome(String name, Integer age);
    
    String doOther(String name, Integer age);
    
    Student doOther2(String name, Integer age);
    
}
