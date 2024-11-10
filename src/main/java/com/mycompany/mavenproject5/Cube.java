/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author ASUS
 */
public class Cube extends Square implements HasVolume {

    public Cube(double side) {
        super(side);
    }
    
    @Override
    public double getVolume() {
        return Math.pow(super.length, 3);
    }
    
    @Override
    public double getArea() {
        return 6 * Math.pow(super.length, 2);
    }
    
}
