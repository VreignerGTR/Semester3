/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka1, angka2;
        int penjumlahan, pengurangan, perkalian, modulo;
        double pembagian;
        boolean statment1, statment2, statment3, statment4, statment5;

        Scanner sc = new Scanner(System.in);
        System.out.print("Angka 1 : ");
        angka1 = sc.nextInt();
        System.out.print("Angka 2 : ");
        angka2 = sc.nextInt();
        System.out.println("");

        penjumlahan = angka1 + angka2;
        pengurangan = angka1 - angka2;
        perkalian = angka1 * angka2;
        pembagian = angka1 / angka2;
        modulo = angka1 % angka2;

        System.out.println(angka1 + " + " + angka2 + " = " + penjumlahan);
        System.out.println(angka1 + " - " + angka2 + " = " + pengurangan);
        System.out.println(angka1 + " x " + angka2 + " = " + perkalian);
        System.out.println(angka1 + " / " + angka2 + " = " + pembagian);
        System.out.println(angka1 + " % " + angka2 + " = " + modulo);
        System.out.println("");

        statment1 = penjumlahan % 2 >= pembagian % 2 && modulo % 2 <= perkalian % 2;
        statment2 = perkalian % 2 == pengurangan || perkalian % 4 == pengurangan;
        statment3 = penjumlahan <= pengurangan + pembagian && perkalian >= modulo + pengurangan;
        statment4 = !(perkalian > penjumlahan) && pengurangan < pembagian;
        statment5 = penjumlahan + perkalian >= pengurangan++ + modulo--;

        System.out.println("Statment 1 = Penjumlahan % 2 >= Pembagian % 2 AND Modulo % 2 <= Perkalian % 2 -> " + statment1);
        System.out.println("Statment 2 = Perkalian % 2 == Pengurangan OR % 4 == kurang -> " + statment2);
        System.out.println("Statment 3 = penjumlahan <= Pengurangan + pembagian AND Perkalian >= Modulo + Pengurangan -> " + statment3);
        System.out.println("Statment 4 = !(Perkalian > Penjumlahan) AND Pengurangan < Pembagian -> " + statment4);
        System.out.println("Statment 5 = Penjumlahan + Perkalian >= Pengurangan++ + modulo-- -> " + statment5);

    }
    
}
