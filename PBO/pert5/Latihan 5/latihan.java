/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_latihan;

/**
 *
 * @author vreigner
 */
class kotak {
        double panjang;
        double lebar;
        double tinggi;
}
    class demoKotak1 {
        public static void main(String [] args) {
            
        double volume;
        kotak k = new kotak();
        
        // mengisikan nilai ke dalam data-data kelas kotak
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi= 2;
        
        // menghitung isi/volume kotak
        volume = k.panjang * k.tinggi * k.lebar;
        
        // menampilkan nilai volume ke layar monitor
        System.out.println("Volume kotak = " + volume);
    }
}
