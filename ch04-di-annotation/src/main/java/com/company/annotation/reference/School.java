/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.annotation.reference;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author bwu
 */


/**
 * 
 * Component和在applicationContext.xml里面一下的配置功能一样
 * 
 *     
    <bean id="mySchool" class="com.company.annotation.reference.School">
        <property name="name" value="qinghua" />
        <property name="address" value="hading 2" />
        
    </bean>
 * 
 */
@Component("myschool")
public class School {
    
    @Value("beijing")
    private String name;
    @Value("haiding")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" + "name=" + name + ", address=" + address + '}';
    }
    
    
}
