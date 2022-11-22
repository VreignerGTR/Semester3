/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Calculator {

    private double input1;
    private double input2;

    public double getInput1() {
        return input1;
    }

    public void setInput1(double input1) {
        this.input1 = input1;
    }

    public double getInput2() {
        return input2;
    }

    public void setInput2(double input2) {
        this.input2 = input2;
    }

    void menuOprasi() {
        int menu = 1;
        double a1, a2, jawaban;
        Scanner sc = new Scanner(System.in);
        while (menu != 5) {
            System.out.println("-----Menu-----");
            System.out.println("1. pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Modulus");
            System.out.println("5. Exit");
            System.out.print("Masukan menu : ");
            menu = sc.nextInt();
            if (menu == 5) {
                System.out.println("Terima kasih");
            } else if (menu <= 4 && menu > 0) {
                System.out.print("Masukan input 1 : ");
                a1 = sc.nextDouble();
                setInput1(a1);
                System.out.print("Masukan input 2 : ");
                a2 = sc.nextDouble();
                setInput2(a2);
                if (menu == 1) jawaban = pertambahan(getInput1(), getInput2());
                else if (menu == 2)jawaban = pengurangan(getInput1(), getInput2());
                else if (menu == 3)jawaban = perkalian(getInput1(), getInput2());
                else if (menu == 4)jawaban = modulus(getInput1(), getInput2());
                else jawaban = 0;
                if (jawaban % 1 == 0) {
                    System.out.println("Jawaban : " + (int) jawaban);
                } else {
                    System.out.println("Jawaban : " + jawaban);
                }
            } else {
                System.out.println("Input salah");
            }
        }
    }

    Calculator() {
        System.out.println("Ini Constructor Calculator");
    }

    double pertambahan(double input1, double input2) {
        return input1 + input2;
    }

    double pengurangan(double input1, double input2) {
        return input1 - input2;
    }

    double perkalian(double input1, double input2) {
        return input1 * input2;
    }

    double modulus(double input1, double input2) {
        return input1 % input2;
    }

    public static void main(String[] args) {
        Calculator Cl = new Calculator();
        Cl.menuOprasi();
    }
}
