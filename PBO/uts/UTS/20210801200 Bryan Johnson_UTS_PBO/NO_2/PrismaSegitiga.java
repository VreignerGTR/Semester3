/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class PrismaSegitiga {
    private double Rusuk;
    private double Tinggi;

    
    double LuasPermukaan(double r, double t){
        return (r*r)+(r*t*3);
    }
    double Volume(double r, double t){
        return r*r*t*(1/2);
    }
    public PrismaSegitiga() {
        System.out.println("Ini Construktor Prisma Segitiga");
    }
    public double getRusuk() {
        return Rusuk;
    }

    public void setRusuk(double Rusuk) {
        this.Rusuk = Rusuk;
    }

    public double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }
}
