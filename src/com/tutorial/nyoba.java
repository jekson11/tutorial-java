package com.tutorial;
import java.util.Scanner;
public class nyoba {
    public static void main(String[] args){
        int belanja;
        int jmluang;
        int kembalian;
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.print("total belanja anda : ");
        belanja = scan.nextInt();

        System.out.print("jumlah uanga anda : ");
        jmluang = scan.nextInt();
        kembalian = jmluang - belanja;
       if(jmluang < belanja){
           System.out.println("jumlah uang anda kurang");
           System.exit(0); //menghentikan semua program yang di bawah

       }else if (belanja >= 1_000_000) {
           System.out.println("selamat anda mendapatkan hadia");

       } else {
            System.out.println("belanjaan anda di bawah 1.000.000");
        }
        System.out.println("kembalian anda : "+ kembalian);
        System.out.println("Terimakasih telah berbelanja...");
    }
}

