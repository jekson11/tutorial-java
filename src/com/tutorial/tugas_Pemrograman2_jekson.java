package com.tutorial;

import java.util.*;

public class tugas_Pemrograman2_jekson {
    public static void main(String[] args) {

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == 1 && j == 1) {
                    System.out.print("  ");
                }
                if (i == 1 && j == 3) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("");

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
            for (int i = 1; i <= 6; i++) {
                for (int j = 6; j > i; j--) {
                    System.out.print("* ");
                }
                for (int k = 1; k < i; k++) {
                    System.out.print("  ");
                }
                System.out.print("\n");
            }
        System.out.println("");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }


        int j = 1;
        for (int k = 1; k < 6; k++){
            for (int d = 1; d <= k; d++){
                System.out.print(j+" ");
                j+=1;
            }
            System.out.print("\n");
        }
        System.out.println("");


        Scanner inputUser = new Scanner(System.in);
        int a;
        System.out.print("Masukkan banyaknya perulangan yang di inginkan = ");
        a = inputUser.nextInt();

        System.out.println("Angka yang habis di bagi 3 dan habis di bagi 5 serta tidak habis di bagi 2 adalah");

        for (int i = 1; i <= a ; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");


        // no 3
       // Scanner inputUser = new Scanner(System.in);
        String[] arrayNama = new String[100];
        int[] arrayHarga = new int[100];
        String nama ;
        int harga ;
        int total = 0;

        System.out.println("Aplikasi Toko");
        System.out.println(">>>>>>>>>>>>>>o<<<<<<<<<<<<<<");
        System.out.print("Masukksn jumlah barang yang di belik : ");
        int jmlBarang = inputUser.nextInt();
        System.out.println("-----------------------------------------------");
        for (int i = 1; i <= jmlBarang; i++){
            System.out.print("Barang pertama : " + i + "\n");
            System.out.print("Nama : ");
            arrayNama[i] = inputUser.next();
            System.out.print("Harga : ");
            arrayHarga[i] = inputUser.nextInt();
            total += arrayHarga[i];
        }

        System.out.println("Daftar Belanja");
        System.out.println("-----------------------------------------------");
        System.out.print("No  ");
        System.out.print("Nama        ");
        System.out.println("Harga");

        for (int k = 1; k <= jmlBarang; k++) {
            System.out.println(k + "   " + arrayNama[k] + "       Rp" + arrayHarga[k]);
        }
        System.out.println("jadi total harga yang harus di bayar : Rp" + total );

    }
}
