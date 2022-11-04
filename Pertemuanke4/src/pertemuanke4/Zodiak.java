/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke4;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Zodiak {
    public static void main(String[] args) {
        Scanner zod =new Scanner(System.in);
        int zodiak;
        System.out.println("Masukkan nomor Bulan : ");
        zodiak = zod.nextInt();
        
        switch (zodiak){
            case 1 : System.out.println("aquarius");
            break;
            case 2 : System.out.println("pisces");
            break;
            case 3 : System.out.println("aries");
            break;
            case 4 : System.out.println("taurus");
            break;
            case 5 : System.out.println("gemini");
            break;
            case 6 : System.out.println("cancer");
            break;
            case 7 : System.out.println("leo");
            break;
            case 8 : System.out.println("virgo");
            break;
            case 9 : System.out.println("libra");
            break;
            case 10: System.out.println("scorpio");
            break;
            case 11 : System.out.println("sagitarius");
            break;
            case 12 : System.out.println("capricorn");
            break;
        }
    }
}
