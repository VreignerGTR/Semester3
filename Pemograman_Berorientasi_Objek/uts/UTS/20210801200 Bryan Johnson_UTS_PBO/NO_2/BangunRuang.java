/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Bryan Johnson
 */
public class BangunRuang {
    void menuOprasi(){
        int menu = 1;
        Kubus kb = new Kubus();
        Balok bl = new Balok();
        PrismaSegitiga ps = new PrismaSegitiga();
        double rusuk,panjang,lebar,tinggi,permukaan,volume;
        Scanner sc = new Scanner(System.in);
        while(menu != 4){
            System.out.println("--Menu--");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Prisma Segitiga");
            System.out.println("4. Exit");
            System.out.print("Masukan menu : ");
            menu = sc.nextInt();
            if (menu == 4) {
                System.out.println("Terima kasih");
            }
            else if(menu <= 3 && menu > 0){
                if(menu == 1){
                    System.out.print("Masukan Lebar : ");
                    lebar = sc.nextDouble();
                    bl.setLebar(lebar);
                    System.out.print("Masukan Panjang : ");
                    panjang = sc.nextDouble();
                    bl.setPanjang(panjang);
                    System.out.print("Masukan Tinggi : ");
                    tinggi = sc.nextDouble();
                    bl.setTinggi(tinggi);
                    permukaan = bl.LuasPermukaan(bl.getPanjang(), bl.getLebar(), bl.getTinggi());
                    volume = bl.Volume(bl.getPanjang(), bl.getLebar(), bl.getTinggi());
                    System.out.println("Luas permukaan = "+permukaan);
                    System.out.println("Volume = "+volume);
                }else if(menu == 2){
                    System.out.print("Masukan Rusuk : ");
                    rusuk = sc.nextDouble();
                    kb.setRusuk(rusuk);
                    permukaan = kb.LuasPermukaan(kb.getRusuk());
                    volume = kb.Volume(kb.getRusuk());
                    System.out.println("Luas permukaan = "+permukaan);
                    System.out.println("Volume = "+volume);
                }
                else if(menu == 3){
                    System.out.print("Masukan Rusuk : ");
                    rusuk = sc.nextDouble();
                    ps.setRusuk(rusuk);
                    System.out.print("Masukan Tinggi : ");
                    tinggi = sc.nextDouble();
                    ps.setTinggi(tinggi);
                    permukaan = ps.LuasPermukaan(ps.getRusuk(),ps.getTinggi());
                    volume = ps.Volume(ps.getRusuk(),ps.getTinggi());
                    System.out.println("Luas permukaan = "+permukaan);
                    System.out.println("Volume = "+volume);
                }
            }else{
                System.out.println("Input salah");
            }
        }
    }

    public BangunRuang() {
        System.out.println("Ini Constructor Bangun Ruang");
    }
    public static void main(String[] args) {
        BangunRuang BngnR = new BangunRuang();
        BngnR.menuOprasi();
    }    
    
}
