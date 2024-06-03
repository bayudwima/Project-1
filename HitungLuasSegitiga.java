/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan panjang alas dan tinggi segitiga
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        
        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;
        
        // Menampilkan hasil
        System.out.println("Luas segitiga adalah: " + luas);
        
        // Menutup objek Scanner
        scanner.close();
    }
}
