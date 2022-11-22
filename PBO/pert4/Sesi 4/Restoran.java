/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_package_soal_A;

/**
 *
 * @author vreigner
 */
import java.util.Scanner;
public class Restoran {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilih;
        double harga,ppn,bayar,kembalian,total;
        
        System.out.println("SELAMAT DATANG DI RESTAURANT DAPUR LARISA DISINI MENYEDIAKAN ANEKA MENU\n");
        System.out.println("========================================================================\n");

        System.out.println("Pilih Menu\n");
        System.out.println("1. AYAM BAKAR\n2. PECEL LELE\n3. SEAFOOD (KERANG KERANGAN, KEPITING,UDANG) SAUS PADANG\n4. NASI GORENG AYAM\n5. NASI GORENG SEAFOOD\n6. MIE GORENG SPESIAL\n");
        
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        switch(pilih){
            case 1 : harga = 25000;break;
            case 2 : harga = 12000;break;
            case 3 : harga = 30000;break;
            case 4 : harga = 15000;break;
            case 5 : harga = 27000;break;
            case 6 : harga = 10000;break;
            default : harga = 0; break;
        }
        System.out.println("Jumlah Harga \t : "+ harga);
        ppn = harga*0.1;
        System.out.println("PPN \t\t : "+ ppn);
        total = harga+ppn;
        System.out.println("TOtal Harga \t : "+ total);
        System.out.print("Total Bayar \t : ");
        bayar = input.nextInt();
        kembalian = bayar-total;
        System.out.println("Kembalian \t : "+ kembalian);
        
    }
}