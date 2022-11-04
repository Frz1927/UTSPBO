/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class InputNilaiTerbesar {
    public static void main(String[] args) {
        int nilai1, nilai2, nilai3;
        Scanner n1 = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Masukkan nilai1 =");
        nilai1 = n1.nextInt();
        
        Scanner n2 = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Masukkan nilai2 =");
        nilai2 = n2.nextInt();
        
        Scanner n3 = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Masukkan nilai3 =");
        nilai3 = n3.nextInt();
        
        System.out.println("Kesimpulan : ");
        
        if ((nilai1 > nilai2)&&(nilai1 > nilai3)){
            System.out.println("Nilai 1 terbesar");
        }
        
        if ((nilai2 > nilai1)&&(nilai2 > nilai3)){
            System.out.println("Nilai 2 terbesar");
        }
        
        if ((nilai3 > nilai1)&&(nilai3 > nilai2)){
            System.out.println("Nilai 3 terbesar");
        }
        else 
            System.out.println("semua nilai sama");
    }
}
