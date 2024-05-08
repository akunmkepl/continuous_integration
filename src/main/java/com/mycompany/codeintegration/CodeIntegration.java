/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codeintegration;
//import org.joda.time.LocalTime;


/**
 *
 * @author Acer
 */
public class CodeIntegration {

       public static void main(String[] args) {
        String str = "Hello, world!";
        
        // Mengonversi string menjadi huruf besar
        String upperCaseStr = str.toUpperCases();
        System.out.println("Huruf besar: " + upperCaseStr);
        
        // Mengonversi string menjadi huruf kecil
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Huruf kecil: " + lowerCaseStr);
        
        // Menghapus spasi di awal dan akhir string
        String trimmedStr = str.trim();
        System.out.println("String setelah di-trim: \"" + trimmedStr + "\"");
        
        // Mencari panjang string
        int length = str.length();
        System.out.println("Panjang string: " + length);
        
        // Mengambil substring dari indeks ke-7 sampai akhir
        String subStr = str.substring(7);
        System.out.println("Substring dari indeks ke-7: " + subStr);
        
        // Memeriksa apakah string berawalan dengan "Hello"
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Mulai dengan Hello? " + startsWithHello);
        
        // Memeriksa apakah string berakhiran dengan "world!"
        boolean endsWithWorld = str.endsWith("world!");
        System.out.println("Berakhir dengan world!? " + endsWithWorld);
        
        // Menggantikan "world" dengan "everyone"
        String replacedStr = str.replace("world", "everyone");
        System.out.println("Setelah penggantian: " + replacedStr);
        
        // Memeriksa apakah string mengandung kata "world"
        boolean containsWorld = str.contains("world");
        System.out.println("Mengandung kata world? " + containsWorld);
        
        // Memisahkan string berdasarkan koma
        String[] parts = str.split(",");
        System.out.println("Bagian pertama setelah split: " + parts[0]);
        System.out.println("Bagian kedua setelah split: " + parts[1]);
    }
}
