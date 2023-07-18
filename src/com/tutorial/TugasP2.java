package com.tutorial;

import java.util.Scanner;

public class TugasP2 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        int tahun, hari, menit;

        System.out.print("Masukkan menit: ");
        menit = inputUser.nextInt();

        if(menit >= 525600) {
            tahun = menit/525600;
        } else {
            tahun = 0;
        }

        if(menit >= 1440) {
           hari = menit/1440;
        } else {
            hari = 0;
        }
        System.out.println(menit + " menit = " + tahun +" Tahun "+ hari +" Hari");

    }

}