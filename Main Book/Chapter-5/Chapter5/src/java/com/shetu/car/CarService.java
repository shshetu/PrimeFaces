/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.car;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author J2EE 37
 */
@ManagedBean(name = "carService")
@ApplicationScoped
public class CarService {

    private static String[] colors;
    private static String[] brands;
    static{
    colors = new String[10];
    colors[0] = "Black";
    colors[1] = "White";
    colors[2] = "Green";
    colors[3] = "Red";
    colors[4] = "Blue";
    colors[5] = "Orange";
    colors[6] = "Silver";
    colors[7] = "Yellow";
    colors[8] = "Brown";
    colors[9] = "Maroon";
    
    brands = new String[10];
    brands[0] = "BMW";
    brands[1] = "Marcedes";
    brands[2] = "Volvo";
    brands[3] = "Audi";
    brands[4] = "Renault";
    brands[5] = "Fiat";
    brands[6] = "Volkwagen";
    brands[7] = "Honda";
    brands[8] = "Jaguar";
    brands[9] = "Ford";
    }
    
    public List<Car> createCars(int size){
     List<Car> list = new ArrayList<Car>();
        for (int i = 0; i < size; i++) {
            list.add(new Car)
        }
    }

}
