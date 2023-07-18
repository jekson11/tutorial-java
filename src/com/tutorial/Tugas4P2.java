package com.tutorial;

import java.util.*;

public class Tugas4P2 {

    public static void main(String[] args) {

        Scanner Userinput = new Scanner(System.in);
        int status;
        int pendapatan;
        int pajak;

        System.out.println("Status Kategori");
        System.out.println("1. Tidak Kawin");
        System.out.println("2. Kawin");

        System.out.print("Input status kategori: ");
        status = Userinput.nextInt();
        System.out.print("Masukkan pendapatan anda dalam 1 tahun: ");
        pendapatan = Userinput.nextInt();

        if (status == 1){
            if (pendapatan <= 70000000){
                pajak = pendapatan/100*5;
                System.out.println("pajak anda sebesar : Rp" + pajak);
            }else if (pendapatan >= 270000000){
                pajak = pendapatan/100*25;
                System.out.println("pajak anda sebesar : Rp" + pajak);
            }else if (pendapatan >= 70000000){
                pajak = pendapatan/100*15;
                System.out.println("pajak anda sebesar : Rp" + pajak);
            }
        } else if (status == 2){
            if (pendapatan <= 50000000){
                pajak = pendapatan/100*5;
                System.out.println("pajak anda sebesar : Rp" + pajak);
            }else if (pendapatan >= 250000000){
                pajak = pendapatan/100*25;
                System.out.println("pajak anda sebesar : Rp" + pajak);
            }else if (pendapatan >= 50000000){
                pajak = pendapatan/100*15;
                System.out.println("pajak anda sebesar : Rp" + pajak);
            }
        } else {
            System.out.println("input yang anda pilih tidak ada");
        }

    }
}
