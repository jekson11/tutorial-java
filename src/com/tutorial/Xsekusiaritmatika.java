package com.tutorial;
import java.util.Scanner;

public class Xsekusiaritmatika {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // penggunaan Scanner
        int a,b,c,d;
        System.out.print("masukkan data = ");
        a = userInput.nextInt(); // penggunaan Scanner yang lebih rapi dengan mendeklarasikan terlebih dahulu tipe datanya
        System.out.print("masukkan data = ");
        b = userInput.nextInt();
        c = a + (b * b); // menggunakan buka dan tutup kurung agar lebih muda membacanya
        System.out.println("hasil2 = " + c);
        d = (a + b) * a; // dengan begini maka yang di tutup kurung yang akan di eksekusi terlebih dahulu
        System.out.println("hasil2 = " + d);

        System.out.println("");

        // perkalian dan pembagian akan di eksekusi terlebih dahulu
        int hasil = 5 + 10 * 2 / 4;
        System.out.println("hasil = " + hasil);
        // jika di lakukan perkalian dan pembagian, maka akan di eksekusi dari kiri ke kanan
        hasil = 5 * 4 / 2;
        System.out.println("hasil = " + hasil);

        // menggunakan pengelompokan operasi dengan tanda ()
        // jika mengelompokkan operasi  menggunakan tanda () maka akan di eksekusi terlebih dahulu
        hasil = 60 / (2 + 10);
        System.out.println("hasil = " + hasil);


    }
}
