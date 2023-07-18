package com.tutorial;

import java.util.Scanner;

public class Tugas2P2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan 1 buah bilangan integer: ");

        int bil = input.nextInt();


        if ((bil % 4 == 0) && (bil % 5 == 0)) {

            System.out.println("Bilangan dapat dibagi oleh 4 dan 5");

        } else if ((bil % 4 == 0) || (bil % 5 == 0)) {

            System.out.println("Bilangan dapat dibagi oleh salah satu dari bilangan 4 atau 5");

        } else {

            System.out.println("Bilangan tidak dapat dibagi oleh 4 dan/atau 5");

        }

    }
}