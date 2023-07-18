package com.tutorial;

import java.util.Arrays;

public class operasi_mtrixA2d {
    public static void main(String[] args) {
/*
        int[][] matrix_a = {
                {1, 2, 3}, // ini komponennya
                {4, 5, 6},
                {7, 8, 9},
                {9, 8, 7},
        };
        int[][] matrix_b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1},
                {1, 2, 3},
        };


        System.out.println("matrix_a");
        printArray(matrix_a);

        System.out.println("matrix_b");
        printArray(matrix_b);

        System.out.println("hasil penjumlahan matrix_a dan matrix_b");
        int[][] hasil = tambah(matrix_a,matrix_b);
        printArray(hasil);
*/
        System.out.println("");

        int[][] matrix_c = {
                {1, 2, 5},
                {3, 4, 6},
        };
        int[][] matrix_d = {
                {11, 12,},
                {13, 14,},
                {3,   4,},
        };

        System.out.println("matrix_c");
        printArray(matrix_c);
        System.out.println("matrix_d");
        printArray(matrix_d);

        int[][] hasil2 = kali(matrix_c,matrix_d);
        System.out.println("hasil perkalian matrix_c dan matrix_d");
        printArray(hasil2);

        //method
    }
/*
     dalam perkalian matrix yang di kalikan adalah baris dari array_c di kali
     kolom dari array_d baris pertama dari array_c adalah 1 jadi 1 dikali 11
     setelah itu baris kedua dari array_c adalah 2 jadi 2 di kali kolom kedua
     dari array_d yaitu 13 setelah keduanya di kali lalu hasil kalinya di jumlah
     {1 * 11 = 11} + {2 * 13 = 26} = 37 jadi tiga tujuh ini menjadi baris pertama
     {1 * 12 = 12} + {2 * 14 = 28} = 40 jadi empat puluh ini menjadi kolom kedua
     {3 * 11 = 33} + {4 * 13 = 52} = 85 jadi lapan lima mendai baris ke dua
     {3 * 12 = 36} + {4 * 14 = 56} = 92 jadi sembilan dua menjadi baris kedua dan kolom ke dua
     begitu seterusnya
 */
    static int[][] kali(int[][] matrix_1,int[][]matrix_2){
        int baris_c = matrix_1.length;
        int kolom_c = matrix_1[0].length;
        int baris_d = matrix_2.length;
        int kolom_d = matrix_2[0].length;

        int[][] hasilKali = new int[baris_c][kolom_d];

        int buffer;
        for (int i = 0; i < baris_c; i++){
            for (int j = 0; j < kolom_d; j++){
                buffer = 0;
                for (int k = 0; k < kolom_c; k++){
                    buffer += matrix_1[i][k] * matrix_2[k][j];
                    //buka komentar jika bingung
                    /*
                    System.out.print(" matrix_1 : "+matrix_1[i][k]);
                    System.out.println("");
                    System.out.print(" matrix_2: "+matrix_2[k][j]);
                     */
                }
                hasilKali[i][j] = buffer;
            }
        }
        return hasilKali;
    }

    //penjumlahan antara dua buah array 2 dimensi
    static int[][] tambah (int[][] matrix_1, int[][] matrix_2) {

        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;
        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length;

        int[][] hasilPenjumlahan = new int[baris_a][kolom_a];
/*
membuat if untuk mengecek ke dua array apakan jumlah kolom dan baris sama jika
sama maka yang di jalankan yang true jika tidak maka yang di jalankan yang fals
maka dari itu jika jumbah kolom dan baris antara kedua array tidak sama maka nilainya
menjadi nol(0) coba aja komen jumlah baris dari salah satu arraynya
 */
        if (baris_a == baris_b && kolom_a == kolom_b){
            for (int i = 0; i < baris_a; i++) {
                for (int j = 0; j < kolom_a; j++) {
                    hasilPenjumlahan[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        } else {
            System.out.println("jumlah baris tidak sama jadi penjumlahan tidak berjalan");
        }
        return hasilPenjumlahan;
    }

    // printArray agar menjadi rapih
    static void printArray(int[][] dataArray){
        int baris = dataArray.length; // cara penulisan agar kita bisa mengambil nilai baris pada array
        int kolom = dataArray[0].length; // cara penulisan agar kita bisa mengambil nilai kolom pada array
       // buka komennya jika bingung
         System.out.println(kolom); //nilai kolom adalah 3 karna komponennya ada 3
         System.out.println(baris); // nilai baris adalah 4 karna jumlah baris pada array ada 4

        for (int i = 0; i < dataArray.length; i++){
            System.out.print("[");
            for (int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j]);

                // buka komentar agar tau mengapa bisa terjadi if statementnya
                //System.out.print(j); //j nya benilai 0 1 2 karena kolomnya ada tiga
               // System.out.print(kolom); nilai kolom adalah tiga
                if (j < (kolom - 1) ){
                    System.out.print(",");
                }else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
    }
}
