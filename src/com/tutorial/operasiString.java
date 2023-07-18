package com.tutorial;

import java.util.Locale;
import java.util.Scanner;

public class operasiString {
    public static void main(String[] args) {

        String kalimat = "saya suka makan pisang";
        
        //mengambil komponen dari string
        System.out.println(kalimat.charAt(5));

        //substring
        String kata = kalimat.substring(5,10);
        System.out.println(kata);

        //concatenation (concat) menggabungkan string
        String kalimat2 = kata + "bakwan";
        System.out.println(kalimat2);

        kata = kata + "cireng"; //mengganti kata bakwan menjadi cireng
        System.out.println(kata);

        //lowercase dan uppercase (hutruf kapital dan huruf kecil
        System.out.println(kalimat.toUpperCase(Locale.ROOT));
        System.out.println(kalimat.toLowerCase(Locale.ROOT));

        //replace (mengubah kalimat atau kata suatu string tapi dengan mengetik
        //kalimat mana yang ingin  kita ubah
        String kalimat3 = kalimat.replace("pisang","apple");
        System.out.println(kalimat);
        System.out.println(kalimat3);

        //compare (membandingkan mana yang lebih besar dalam alfabet
        //seperti contoh di bawah motor1.compareTo(motor2) karna var motor2
        //huruf awalnya s dan var motor1 huruf awalnya n jadi di mana yang lebih
        //besar dari n ke o ke p ke q ke r ke s selangnya 5 tapi karna yang di compair
        //var motor2 jadi nilainya -5 tapi jika yang dibawahnya nilainya adalah 5
        String motor1 = "ninja kawasaki";
        String motor2 = "supra-x";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        //equalty (persamaan)
        //ingat string yang di input oleh user letak memorinya berbeda dengan string
        //yang di tulis di program
        //yang di bawah ini sudah pasti nilainya sama karna seperti yang kita tau
        //jika Stringnya sama maka addresnya juga sama dan ingat pada if ini yang di cek
        //adalah addresnya bukan katanya pada String ini addresnya di simpan pada String pool
        //sedangkan string ynag di input oleh user tidak di simpan di string pool olehkarna itu
        //addresnya berbeda
        String kataInput = "test";
        String katatest = "test";
        if (kataInput == katatest){
            System.out.println("Stringnya sama");
        }else {
            System.out.println("Stringnya beda");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("mengambil input string dari user : ");
        kataInput = userInput.next();
        System.out.println("kata yang di input oleh user adalah = " + kataInput);
        //bisa di lihat di sini stringnya berbeda
        if (kataInput == katatest){
            System.out.println("Stringnya sama");
        }else {
            System.out.println("Stringnya beda");
        }

        //tapi kita bisa ngecek stringnya sama atau tidak dan yang di cek bukan addresnya
        //melainkan kata pada stringnya dengan menggunakan equals
        if (kataInput.equalsIgnoreCase(katatest)){
            System.out.println("Stringnya sama");
        }else {
            System.out.println("Stringnya beda");
        }

    }
}
