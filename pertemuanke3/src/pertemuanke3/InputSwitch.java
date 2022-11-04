/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class InputSwitch {
    public static void main(String[] args) {
        int noHari;
        Scanner hari = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan nomor hari :");
        noHari = hari.nextInt();
        switch (noHari) {
            case 1 :
                System.out.println("Hari ke-" + noHari + "adalah minggu");
                break;
            case 2 :
                System.out.println("Hari ke-" + noHari + "adalah senin");
                break;
            case 3 :
                System.out.println("Hari ke-" + noHari + "adalah selasa");
                break;
            case 4 :
                System.out.println("Hari ke-" + noHari + "adalah rabu");
                break;
            case 5 :
                System.out.println("Hari ke-" + noHari + "adalah kamis");
                break;
            case 6 :
                System.out.println("Hari ke-" + noHari + "adalah jum\'at");
                break;
             case 7 :
                System.out.println("Hari ke-" + noHari + "adalah sabtu");
                break; 
             default:
                 System.out.println("Tidak ada hari itu" + noHari + "yang anda inputkan");
                 break;
        }
    }
}
