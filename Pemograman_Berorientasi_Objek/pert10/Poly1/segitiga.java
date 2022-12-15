/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasBangungDatar;

/**
 *
 * @author Bryan Johnson
 */
public class segitiga extends luas{
    private double alas;
    private double tinggi;
    
    segitiga (String nama, double alas, double tinggi){
        super(nama);
        this.alas =  alas;
        this.tinggi = tinggi;
    }
    
    public void luasSegitiga(){
        System.out.println("Luas = "+0.5*alas*tinggi);
    }
}
