/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.ba03;

/**
 *
 * @author bwu
 */




public class Student {
    
    private String name;
    private int age;
    
    private School school;

    public Student() {
        System.out.println("wu can constructor");
        
    }

    
    
    public Student(String name, int age, School school) {
        
        System.out.println("you can constructor");
        
        
        this.name = name;
        this.age = age;
        this.school = school;
    }
    
    
    
    
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

 

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", school=" + school + '}';
    }



    public void setSchool(School school) {
        this.school = school;
    }

    
    
    
}
