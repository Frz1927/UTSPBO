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
public class ScannerOperator {
    public static void main(String[] args) {
        Scanner ope = new Scanner(System.in);
        System.out.println("masukkan angka :");
        int n1 = ope.nextInt();
       
        System.out.println("masukkan angka");
        int n2 = ope.nextInt();
        
        int h1 = (n1 + n2) * (n2 + n1);
        int h2 = n1 % 4 * n2 ;
        boolean b1 = h1 >= h2;
        boolean b2 = h2 >= h1;
        boolean b3 = (h1 % 4) == (++h2 % 5);
        boolean b4 = (b1^b3) && (b2||b3);
        boolean b5 = b2 || (b3 && (b2^b1));
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
