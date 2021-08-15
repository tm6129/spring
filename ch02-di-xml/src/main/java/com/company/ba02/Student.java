/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.ba02;

/**
 *
 * @author bwu
 */




public class Student {
    
    private String name;
    private int age;
    private String email;
    
    private School school;
    
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        System.out.println("setName used");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge used");
        this.age = age;
    }

    public void setEmail(String email) {
        System.out.println("setEmail = " + email);
    }
    
    public void setAddress(String address){
        System.out.println("setAddress:" + address);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", email=" + email + ", school=" + school + '}';
    }



    public void setSchool(School school) {
        this.school = school;
    }

    
    
    
}
