/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.student;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author shshe
 */
@ManagedBean
public class Student {
    private String name; //text box
    private String email; //text box
    private String gender; //radio
    private String[] courses; //checkbox

    public Student() {
    }

    public Student(String name, String email, String gender, String[] courses) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    
}
