package com.tutorial;

import java.util.*;

public class Operatorlogika {

    public static void main(String[] args) {

        // menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // program sederhana menebak sebuah angka
        int angkaBenar = 6;
        int tebakAngka;
        boolean statusTebakan;

        // operasi logika
        System.out.print("masukkan angka yang benar: ");
        tebakAngka = inputUser.nextInt();
        statusTebakan = (tebakAngka == angkaBenar);
        System.out.println("nilai tebakan anda: " + statusTebakan);

        System.out.println("");

        // operasi aljabar boolean AND &&
        System.out.print("masukkan angka antara 5 sampai 10: ");
        tebakAngka = inputUser.nextInt();
        statusTebakan = (tebakAngka >= 5) && (tebakAngka <= 10);
        System.out.println("nilai yang anda masukkan: " + statusTebakan);

        System.out.println("");

        // operasi aljabar boolean OP ||
        System.out.print("masukkan angka antara 5 sampai 10: ");
        tebakAngka = inputUser.nextInt();
        statusTebakan = (tebakAngka >= 5) || (tebakAngka <= 10);
        System.out.println("nilai yang anda masukkan: " + statusTebakan);

        /*
        tabel kebenaran AND &&          tabel kebenaran OR ||
        a  | b | c                      a | b | c
        T    T   T                      T   T   T
        F    T   F                      F   T   T
        T    F   F                      T   F   T
        F    F   F                      F   F   F
         */

    }
}
