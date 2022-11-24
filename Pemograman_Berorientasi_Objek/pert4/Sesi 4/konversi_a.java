/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_package_soal_A;
import javax.swing.JOptionPane;

/**
 *
 * @author vreigner
 */
public class konversi_a {
   public static void main(String[] args){
 String nilai = JOptionPane.showInputDialog(null,"Masukkan Nilai Anda","Angka 0-100",JOptionPane.QUESTION_MESSAGE);
     int angka = Integer.parseInt(nilai);

            String pesan;
            if (angka > 100){
            pesan = "Nilai tidak boleh lebih dari 100";
            }else if (angka >=85){
            pesan = "Nilai Anda A";
            }else if (angka >=70 && angka <=84 ){
            pesan = "Nilai Anda B";
            }else if (angka >=60 && angka <=70 ){
            pesan = "Nilai Anda C";
             }else if (angka >=50 && angka <=60 ){
            pesan = "Nilai Anda D";
            }else if (angka >=50) {
            pesan = "Nilai Anda E";
            }else{
            pesan = "Anda tidak lulus, Silahkan mengulang semester depan..!";
            }
JOptionPane.showMessageDialog(null,pesan,"Hasil Konversi Nilai",JOptionPane.INFORMATION_MESSAGE);
 }
}