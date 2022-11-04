/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4a;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class NilaiKelulusan2 {
    public static void main(String[] args) {
        Scanner kel = new Scanner (System.in);
        System.out.print("Masukkan Nama anda = ");
        String Nama = kel.next();
        
        System.out.println("Masukkan Jenis Kelamin =");
        String jenis_Kelamin = kel.next();
        
        System.out.println("Masukkan Tinggi Badan =");
        int tinggi_Badan = kel.nextInt();
        
        if ("Laki-Laki".equals(jenis_Kelamin)){
            if (tinggi_Badan < 170) {
                System.out.println("gagal");}
            else {System.out.println("Lulus");}
            }
        else if ("Perempuan".equals (jenis_Kelamin)){
            if (tinggi_Badan < 160) {System.out.println("gagal");}
            else {System.out.println("Lulus");}
        }
    }
}
