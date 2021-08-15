/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.ba04;


/**
 *
 * @author bwu
 */




public class Student {
    
    private String name;
    private int age;
    
    private School school;
    
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   

    public void setSchool(School school) {
        System.out.println("setSchool = " + school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", school=" + school + '}';
    }

    
    
    
}
