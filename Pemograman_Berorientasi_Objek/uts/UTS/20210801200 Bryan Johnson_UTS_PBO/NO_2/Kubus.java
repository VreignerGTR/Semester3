/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Bryan Johnson
 */
public class Kubus {
    private double rusuk;

    double LuasPermukaan(double r){
        return (r*r)*6;
    }
    double Volume(double r){
        return r*r*r;
    }
    public double getRusuk() {
        return rusuk;
    }

    public void setRusuk(double rusuk) {
        this.rusuk = rusuk;
    }

    public Kubus() {
        System.out.println("Ini Constructor Kubus");
    }
    
    
}
