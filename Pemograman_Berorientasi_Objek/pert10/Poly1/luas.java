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
public class luas {
    protected String nama;
    
    luas (String nama){
        this.nama = nama;
    }
    
    public void view(){
        System.out.println("Luas "+nama);
    }
}
