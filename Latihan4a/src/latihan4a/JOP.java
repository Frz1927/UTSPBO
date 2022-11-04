/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4a;

/**
 *
 * @author ACER
 */
import javax.swing.JOptionPane;
public class JOP {
    public static void main(String[] args) {
// Input Nama
String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda!"));
// Print
System.out.println("Hai " + nama + ", apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
}
}
