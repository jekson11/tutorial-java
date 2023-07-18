package com.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class operasiArrays {
    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};
        // merubah array menjadi string
        System.out.println("\nmerubah array menjadi string\n========================");
        printArray(arrayAngka1);

        int[] arrayAngka2 = new int[5];
        // mengkopi array
        System.out.println("\narray satu dan dua\n========================");
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nmenkopi array menggunakan loop");
        for (int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1); // ini membuktikan bahwa array yangkita kopi itu berbeda
        printArray(arrayAngka2);         // walau nilainya sama tapi addresnya berbeda
        System.out.println(arrayAngka2);

        /*
         copyof mengambil nilai nya jika empat maka yang di ambil 1,2,3,4
         dan jika 3 maka yang di ambil 1,2,3 ubah angkanya jika ingin tau lebih dalam
        */
        System.out.println("\nmengkopi array dengan copyof");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,4);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        /*
         copyOfrange bedanya dia mengambil indeks dari array tersebut
         walaupun kita membuat angka kedua nya tidak ada di indeks dia akan tetap
         mengeprint indeks yang terakhir ubah angkanya kalau ingin tau lebih dalam
        */
        System.out.println("\nmengkopi dengan copyOfrange");
        int[]arrayAngka4 = Arrays.copyOfRange(arrayAngka1,3,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array mengubah nilai pada array menjadi sama semua
        System.out.println("\nfill array===============");
        int[]arrayAngka5 = {1,2,3,4,5};
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,1);
        printArray(arrayAngka5);

        // equals bernilai boolean false atau true
        System.out.println("\nkomparasi array===============");
        int []arrayAngka6 = {1,2,3,6,5};
        int []arrayAngka7 = {1,2,3,4,5};
        printArray(arrayAngka6);
        printArray(arrayAngka7);
        System.out.println("membandingkan antara dua buah array dengan equals");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));
        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("array ini sama");
        }else {
            System.out.println("array ini beda");
        }

        /*
        Arrays.compare berfungsi untuk mengecek array mana yang lebih besar
        antara arrayAngka6 dan arrayAngka7 dan array yang lain jika hasilnya 0
        maka array tersebut sama besarnya, dan jika hasilnya 1 maka array yang
        terletak di sebelah kirilah yang lebih besar, tetapi jika hasilnya -1
        maka array yang terletak di sebelah kananlah yang lebih besar ubah
        nilai arraynya agar lebih paham
         */
        System.out.println("\nmengecek array mana yang lebih besar menggunakan compare");
        System.out.println((Arrays.compare(arrayAngka6,arrayAngka7)));

        // Arrays.mismatch mengecek indeks array yang berbeda jika nilainya -1
        //berarti tidak ada yang berbeda
        System.out.println("\nngecek mana indeks yang berbeda dengan mismatch pada array");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //sorting/menyusun nilai array dari yang terkecil sampai yang terbesar array
        System.out.println("\nsorting array dengan Arrays.sort\n===============");
        int[] arrayAngka8 = {2,5,7,3,9,1};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //sorting manual menggunakan for loop
        System.out.println("\nsorting array dengan for loop\n===============");
        int[] sortingManual = {1,10,9,5,7,};
        printArray(sortingManual);
        for (int i = 0; i < sortingManual.length; i++){
            for (int j = 0; j < sortingManual.length-1; j++){
                if (sortingManual[j] > sortingManual[j+1]){
                    int temp = sortingManual[j];
                    sortingManual[j] = sortingManual[j+1];
                    sortingManual[j+1] = temp;
                }
            }
        }
        System.out.println("sortingManual.leght-1 = " + (sortingManual.length-1));
        System.out.println("sortingManual.leght = " + sortingManual.length);
        printArray(sortingManual);

        //Array.binarysearch mencari nilai array yang kita input berada di indek ke berapa
        //jiks kits ingin mencara atau search array kita terlebih dahulu haru mengsortingnya
        System.out.println("\nsearch array dengan Arrays.binarysearch\n===============");
        int angka = 9;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " brada di indeks ke : " + posisi);

        //algoritma search array
        System.out.println("##  Program Java Pencarian Array  ##");
        System.out.println("========================================");

        int[] arr = new int[100];
        int arr_count, i, num;
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah element Array: ");
        arr_count = input.nextInt();

        System.out.print("Input "+arr_count+" angka array (dipisah dengan enter): ");
        System.out.println();

        // simpan setiap angka yang diinput ke dalam array
        for(i = 0; i < arr_count; i++){
            System.out.print("input array ke " + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.print("Input angka yang akan dicari: ");
        num = input.nextInt();

        // proses pencarian array
        for(i = 0; i < arr_count; i++){
            if(arr[i] == num){
                System.out.print("Angka " + num + " ditemukan pada index ke-"+i);
                break;
            }
        }

        if(i == arr_count){
            System.out.print("Angka " + num + " tidak ditemukan");
        }

        System.out.println();
    }

    static void printArray(int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}
