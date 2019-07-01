/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu;

import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class ManyCheckBox {  
private String[] selectedCourse;  
public String[] getSelectedCourse() {  
return selectedCourse;  
}  
public void setSelectedCourse(String[] selectedCourse) {  
this.selectedCourse = selectedCourse;  
}  
} 