/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author ASUS
 */
public class Tube extends Circle implements HasVolume {
    private double height;

    public Tube(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getVolume() {
        return 3.14 * Math.pow(super.radius, 2) * height;
    }
    
    @Override
    public double getArea() {
        double baseArea = 3.14 * Math.pow(super.radius, 2);
        double sideArea = 2 * 3.14  * super.radius * height;
        return 2 * baseArea + sideArea;
    }
    
}
