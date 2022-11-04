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
public class BobotNilaiHuruf {
    public static void main(String[] args) {
        char kode;
        Scanner nil = new Scanner(System.in);
        System.out.println("Masukkan Huruf :");
        kode = nil.next().charAt(0);
        
        switch (kode){
            case 'a' : 
                System.out.println("4");
                break;
            case 'b' :
                System.out.println("3");
                break;
            case 'c' :
                System.out.println("2");
                break;
            case 'd' :
                System.out.println("1");
                break;
            case 'e' : 
                System.out.println("0");
                break;
            default : 
                System.out.println("error");
            
        }
    }
}
