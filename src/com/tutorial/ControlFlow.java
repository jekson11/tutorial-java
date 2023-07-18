package com.tutorial;

public class ControlFlow {

    public static void main(String[] args) {

        int a = 0;

        while (true) {
            a++;
            if (a == 10){
                break; // memaksa program berhenti
            }else if (a == 5){
                continue; // melanjutkan program ke atas
        }else if (a == 7){
         return; // akan memaksa program berhenti hingga program yang di bawah tidak akan di eksekusi
        }
        System.out.println("looping ke - " + a);
         }
        System.out.println("akhir looping");

    }
}
