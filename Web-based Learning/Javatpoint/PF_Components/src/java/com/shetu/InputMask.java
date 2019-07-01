/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu;

/**
 *
 * @author shshe
 */
import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class InputMask {  
private String date;  
private String phone;  
public String getDate() {  
return date;  
}  
public void setDate(String date) {  
this.date = date;  
}  
public String getPhone() {  
return phone;  
}  
public void setPhone(String phone) {  
this.phone = phone;  
}  
}  