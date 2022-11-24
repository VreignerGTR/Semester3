package praktikum5;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author vreigner
 */
public class oop {
    public int pil;
    public double harga = 0, PPN, totalharga, totalbayar, kembalian;
    public String NamaProduk;

    public void setPil(int pil) {
        this.pil = pil;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setPPN(double PPN) {
        this.PPN = PPN;
    }

    public void setTotalharga(double totalharga) {
        this.totalharga = totalharga;
    }

    public void setTotalbayar(double totalbayar) {
        this.totalbayar = totalbayar;
    }

    public void setKembalian(double kembalian) {
        this.kembalian = kembalian;
    }

    public void setNamaProduk(String NamaProduk) {
        this.NamaProduk = NamaProduk;
    }

    public int getPil() {
        return pil;
    }

    public double getHarga() {
        return harga;
    }

    public double getPPN() {
        return PPN;
    }

    public double getTotalharga() {
        return totalharga;
    }

    public double getTotalbayar() {
        return totalbayar;
    }

    public double getKembalian() {
        return kembalian;
    }

    public String getNamaProduk() {
        return NamaProduk;
    }
    public static void oop(){
        System.out.print("\n SELAMAT DATANG DI RESTAURANT DAPUR LARISA");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
       oop food = new oop();
        System.out.println("\n DISINI MENYEDIAKAN ANEKA MENU ");
        System.out.print("\n 1. AYAM BAKAR ");
        System.out.print("\n 2. PECEL LELE ");
        System.out.print("\n 3. SEAFOOD (KERANG-KERANGAN, KEPITING,UDANG) SAUS PADANG ");
        System.out.print("\n 4. NASI GORENG AYAM ");
        System.out.print("\n 5. NASI GORENG SEAFOOD ");
        System.out.print("\n 6. MIE GORENG SPESIAL ");
        System.out.print("\n Pilih menu : ");
        food.setPil(scan.nextInt());
        switch (food.getPil()) {
            case 1:
                food.setNamaProduk("AYAM BAKAR ");
                food.setHarga(25000);
                break;
                
            case 2:
                food.setNamaProduk("PECEL LELE ");
                food.setHarga(18000);
                break;

            case 3:
                food.setNamaProduk("SEAFOOD (KERANG-KERANGAN, KEPITING, UDANG)SAUS PADANG ");
                food.setHarga(80000);
                break;

            case 4:
                food.setNamaProduk("NASI GORENG AYAM ");
                food.setHarga(20000);
                break;

            case 5:
                food.setNamaProduk("NASI GORENG SEAFOOD ");
                food.setHarga(28000);
                break;

            case 6:
                food.setNamaProduk("MIE GORENG SPESIAL ");
                food.setHarga(30000);
                break;
                
            default:
                System.out.println("Maaf, pilihan tidak tersedia");
        }
        food.setPPN(food.getHarga() * 0.10);
        food.setTotalharga(food.getHarga()+food.getPPN());
        System.out.println("\nJumlah Harga : Rp " + food.getHarga());
        System.out.println("\nPPN : Rp " + food.getPPN());
        System.out.println("\nTotal Harga : Rp " + food.getTotalharga());
        System.out.print("\nTotal Bayar : Rp ");
        food.setTotalbayar(scan.nextInt());
        food.setKembalian(food.getTotalbayar() - food.getTotalharga());
        System.out.println("\nKembalian : Rp " + food.getKembalian());
    }
}
