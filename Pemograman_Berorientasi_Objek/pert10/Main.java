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
public class Main {
    public static void main(String[] args) {
        segitiga sgt = new segitiga("Segitiga",10,5);
        persegiPanjang psp = new persegiPanjang("Persegi Panjang",20,9);
        
        sgt.view();
        sgt.luasSegitiga();
        
        psp.view();
        psp.luasPersegiPanjang();
    }
}
