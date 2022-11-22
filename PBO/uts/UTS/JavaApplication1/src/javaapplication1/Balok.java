/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class Balok {
    private double Panjang;
    private double Lebar;
    private double Tinggi;

    public Balok() {
        System.out.println("Ini Constructor Balok");
    }
    double LuasPermukaan(double p, double l, double t){
        return (2*(p*l))+ (2*(p*t))+(2*(l*t));
    }
    double Volume(double p, double l, double t){
        return p*l*t;
    }
    public double getPanjang() {
        return Panjang;
    }

    public void setPanjang(double Panjang) {
        this.Panjang = Panjang;
    }

    public double getLebar() {
        return Lebar;
    }

    public void setLebar(double Lebar) {
        this.Lebar = Lebar;
    }

    public double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }

}
