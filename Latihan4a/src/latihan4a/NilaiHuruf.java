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
public class NilaiHuruf {
    public static void main(String[] args) {
        Scanner nil = new Scanner (System.in);
        System.out.print("Masukkan nilai = "); 
        int nilai = nil.nextInt();
        
        if (nilai <= 55) {
        System.out.println("E");
    }
        else if (nilai <= 65) {
            System.out.println("D");
    }
        else if (nilai <= 75) {
            System.out.println("C");
    }
        else if (nilai <= 85) {
            System.out.println("B");
    }
            
            else if (nilai <= 100)
           {System.out.println("A");}
            else {System.out.println("error");}
    
    }
}
