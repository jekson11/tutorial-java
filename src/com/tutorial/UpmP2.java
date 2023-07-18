package com.tutorial;

import java.util.*;

public class UpmP2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
 /*
        int a,b,sisa,hasil;

        System.out.println("No 1");
        System.out.print("Input sebuah angka : ");
        a = userInput.nextInt();
        b = 1;
        while (b <= 10){
            hasil = a / b;
            sisa = a % b;// menampilkan sisa bagi
            System.out.printf("%d : %d = %d sisa %d\n",a,b,hasil,sisa);
            b++;
        }
        System.out.println("");
*/
/*
        System.out.println("No2");
        int a,b;
        System.out.print("Input  sebuah angka : ");
        a = userInput.nextInt();
        System.out.println("Angka yang dapat membagi " + a + " tanpa sisa adalah:");
        b = 1;
        do {
            if (a % b == 0) {
                System.out.print(b+",");
            }
            b++;
        }while (b <= a);
 */
/*
        System.out.println("No3");
        int a, b;
        int c = 3;
        int d = 5;
        int e = 0;
        int f = 0;

        System.out.print("Input batasan angka: ");
        a = userInput.nextInt();
        System.out.println("Angka-angka yang merupakan kelipatan dari 3 atau 5 kurang dari " + a + " adalah:");

        for (b = 0; b < a; b++) {
            if (c < a) {
                System.out.print(c + ",");
                if (c % 2 == 0) {
                    e++;
                }else {
                    f++;
                }
                c += 3;
            }
            if (d < a) {
                System.out.print(d + ",");
                if (d % 2 == 0) {
                    e++;
                }else {
                    f++;
                }
                d += 5;
            }
        }
        System.out.println("\nJumlaha angka genap : " + e + " angka");
        System.out.println("Jumlah angka ganjil : " + f + " angka");
*/

  /*
        System.out.println("No4");
        int baris;
        int kolom;

        System.out.print("Input jumlah baris: ");
        baris = userInput.nextInt();
        System.out.print("Input jumlah kolom: ");
        kolom = userInput.nextInt();

        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++){

                if ((i + j) % 2 != 0){
                    System.out.print("O ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.print("\n");
        }
*/
        System.out.println("No5");
        int array[] = new int[5];
        int  input;
        for (int i = 0; i < array.length; i++){
            System.out.print("Input bilangan ke-" + (i+1) + " : ");
            array[i] = userInput.nextInt();
        }
        System.out.println("Bilangan yang di input adalah:");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
}
