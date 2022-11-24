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
public class program4 {
    public static void main(String[]args){

 Scanner input = new Scanner(System.in);

 System.out.print("Masukkan angka=");
 int angka = input.nextInt();

 //percabangan
  if(angka < 0)
  {
   System.out.println("" + angka + " bilangan negatif");
  }
  else if (angka >= 0)
  {
   System.out.println("" + angka + " bilangan positif");
  }
  else if (angka == 0)
  {
   System.out.println("" + angka + " bilangan nol");
  }
}
}