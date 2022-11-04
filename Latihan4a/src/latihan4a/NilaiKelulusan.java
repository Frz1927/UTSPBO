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
public class NilaiKelulusan {
    public static void main(String[] args) { 
        Scanner inp = new Scanner(System.in);
       System.out.print("Masukkan nama anda = ");  
        String Nama = inp.next();
        System.out.print("Masukkan NIM = "); 
        String nim = inp.next();
        System.out.print("Masukkan Nilai =");
        int nilai = inp.nextInt();   
        
        if (nilai >= 75){
            System.out.println("ya lulus");
        }else {
            System.out.println("tidak lulus");
        }
    }
}