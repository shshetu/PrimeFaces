/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu;

import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class Editor {  
private String text;  
public String getText() {  
return text;  
}  
public void setText(String text) {  
this.text = text;  
}  
}  