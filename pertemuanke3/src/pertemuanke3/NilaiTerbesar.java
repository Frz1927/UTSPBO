/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke3;

/**
 *
 * @author ACER
 */
public class NilaiTerbesar {
    public static void main(String[] args) {
        int nilai1 = 9, nilai2 = 10, nilai3 = 8;
        
        System.out.println("Nilai 1 =" + nilai1);
        System.out.println("Nilai 2 =" + nilai2);
        System.out.println("Nilai 3 =" + nilai3);
        
        if (nilai1 > nilai2 && nilai1 > nilai3){
            System.out.println("nilai 1 yang terbesar");}
        if (nilai2 > nilai1 && nilai2 > nilai3) {
            System.out.println("nilai 2 yang terbesar");}
        if (nilai3 > nilai1 && nilai3 > nilai2) {
            System.out.println("nilai 3 yang terbesar");}
    
    }
}
