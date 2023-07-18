package com.tutorial;

import java.util.*;

public class latihanWhileLoop {
    public static void main(String[] args) {

        System.out.println("While Loop dan If Else If");

        int nilaiAwal,nilaiAkhir,total;
        Scanner inptUser;
        inptUser = new Scanner(System.in);
        total = 0;

        System.out.print("masukkan nilai awal : ");
        nilaiAwal = inptUser.nextInt();

        System.out.print("masukkan nilai akhir : ");
        nilaiAkhir = inptUser.nextInt();

        if (nilaiAwal <= nilaiAkhir) {

            while (nilaiAwal <= nilaiAkhir) {
                total += nilaiAwal;
                System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
                nilaiAwal++;
            }
        }else if (nilaiAwal >= nilaiAkhir){

            while (nilaiAwal >= nilaiAkhir) {
                total += nilaiAwal;
                System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
                nilaiAwal--;
            }
        }


        System.out.println("Do While dan If Else If");


        int nilaiAwal2,nilaiAkhir2,total2;
        Scanner inptUser2;
        inptUser2 = new Scanner(System.in);
        total2 = 0;

        System.out.print("masukkan nilai awal : ");
        nilaiAwal2 = inptUser.nextInt();

        System.out.print("masukkan nilai akhir : ");
        nilaiAkhir2 = inptUser.nextInt();

        if (nilaiAwal2 <= nilaiAkhir2) {

            do {
                nilaiAwal2++;
                total2 += nilaiAwal2;
                System.out.println("ditambah " + nilaiAwal2 + " menjadi " + total2);
            }while (nilaiAwal2 <= nilaiAkhir2);

        }else if (nilaiAwal2 >= nilaiAkhir2){

           do {
               nilaiAwal2--;
               total2 += nilaiAwal2;
               System.out.println("ditambah " + nilaiAwal2 + " menjadi " + total2);
           }while (nilaiAwal2 >= nilaiAkhir2);
        }


        System.out.println("For Loop dan If Else If");

        int nilaiAwal3,nilai,total3;
        Scanner inptUser3;
        inptUser3 = new Scanner(System.in);
        total3 = 0;

        System.out.print("masukkan nilai : ");
        nilai = inptUser3.nextInt();

        for (nilaiAwal3 = 0 ; nilaiAwal3 <= nilai; nilaiAwal3++) {
                total3 += nilaiAwal3;
                System.out.println("ditambah " + nilaiAwal3 + " menjadi " + total3);
        }

        for (nilaiAwal3 = 10 ; nilaiAwal3 >= nilai; nilaiAwal3--) {
            total3 += nilaiAwal3;
            System.out.println("ditambah " + nilaiAwal3 + " menjadi " + total3);
        }
    }
}
