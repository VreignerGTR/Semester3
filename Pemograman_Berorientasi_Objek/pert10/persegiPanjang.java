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
public class persegiPanjang extends luas{
    private double panjang;
    private double lebar;
    
    persegiPanjang (String nama, double panjang, double lebar){
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void luasPersegiPanjang(){
        System.out.println("Luas = "+panjang*lebar);
    }
}
