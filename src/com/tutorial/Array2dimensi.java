package com.tutorial;

import java.util.Arrays;

public class Array2dimensi {
    public static void main(String[] args) {

        // array 2 dimensi
        int[][] array2Dimensi = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(Arrays.deepToString(array2Dimensi)); // deepTostring untuk mengeluarkan array 2 dimensi
        printArray(array2Dimensi);

        // deklarasi array2dimensi
        int[][] arrayAngka = new int[5][4]; // 5 adalah jumlah baris dan 4 adalah julah kolom
        printArray(arrayAngka);

        // looping array 2 dimensi  dengan manual
        for (int i = 0; i < arrayAngka.length; i++){
            System.out.print("[");
         for (int j = 0; j < arrayAngka[i].length; j++){
             System.out.print(arrayAngka[i][j ] + ",");
         }
            System.out.print("]\n");
        }

        // Array manual untuk membuktikan
        int[][] array2D = {
                {1,2,3,4,5},
                {6,7,8,9,0},
                {9,8,7,6,5}
        };
        printArray(array2D);

        // looping array 2D menggunakan for each
        for (int[] baris : arrayAngka) {
            System.out.print("[");
            for (int angka : baris){
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
    }

    // alasan mengaapa arraynya bisa berbaris kebawah karena perulangannya mengeluarkan ouput sesuai dengan total banyak baris
    static void printArray (int[][] dataArray){
        for (int i = 0; i < dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
