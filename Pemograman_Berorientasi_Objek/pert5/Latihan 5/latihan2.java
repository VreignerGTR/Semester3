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
class Karyawan{
    String ID, Nama, Divisi;
    double Gaji;
}
class Mobil{
    String NamaMobil, Warna, TahunProduksi;
}

class latihan2 {
    public static void main(String args[]){
        Mobil sedan = new Mobil();
        
        sedan.NamaMobil = "Tundra";
        sedan.Warna = "Purple Space";
        sedan.TahunProduksi = "2022-Sekarang";
        
        System.out.println("Data Mobil");
        System.out.println("Nama Mobil  : " + sedan.NamaMobil);
        System.out.println("Warna       : " + sedan.Warna);
        
        System.out.println("");
        
        Karyawan Aurel = new Karyawan();
        Karyawan Joko  = new Karyawan();
        
        Aurel.ID = "NIP12";
        Aurel.Nama = "Xinque";
        Aurel.Divisi = "Desainer";
        Aurel.Gaji = 8350000;
        
        System.out.println("Data Karyawan Aurel");
        System.out.println("ID      : " + Aurel.ID);
        System.out.println("Nama    : " + Aurel.Nama);
        System.out.println("Divisi  : " + Aurel.Divisi);
        System.out.println("Gaji    : " + Aurel.Gaji);
        
        System.out.println("");
        
        Joko.ID = "NIP66";
        Joko.Nama = "Jojo Joestar";
        Joko.Divisi = "Markenting";
        Joko.Gaji = 6350000;
        
        System.out.println("Data Karyawan Joko");
        System.out.println("ID      : " + Joko.ID);
        System.out.println("Nama    : " + Joko.Nama);
        System.out.println("Divisi  : " + Joko.Divisi);
        System.out.println("Gaji    : " + Joko.Gaji);
    }
}