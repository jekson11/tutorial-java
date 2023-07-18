package com.tutorial;

import java.util.Arrays;

public class tugasArray {
    public static void main(String[] args) {

        int[] array = {8,3,2,5,20};
        int[] array2 = {6,5,3,8,9};

        //penjumlahan array
        int[] total = tambahArray(array,array2);
        printArray(array,"array 1");
        printArray(array2,"array 2");
        printArray(total,"hasil");
        System.out.println("");

        // menggabungkan dua buah array
        int[] arrayHasil = new int[array.length + array2.length];
        for (int i = 0; i < array.length; i++){
            arrayHasil[i] = array[i];
        }
        for (int i = 0; i < array.length; i++){
            arrayHasil[i + array.length] = array2[i];
        }

        printArray(array,"array 1");
        printArray(array2,"array 2");
        printArray(arrayHasil,"hasil");
        System.out.println("");
       
        // sorting terbalik cara pertama
        // method revers
        printArray(array,"array");
        Arrays.sort(array);
        printArray(array,"arraySort");
        revers(array);
        printArray(array,"arrayBuffer1");
/*
//penulisan tanpa method
        int[] arrayBuffer = Arrays.copyOf(array,array.length);
        for (int i = 0; i < array.length; i++){
            array[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
        */
        System.out.println("");

        // carra ke dua sorting terbalik array lebih simpel
        // method revers2
        int[] array3 = {3,5,2,7,4};
        printArray(array3,"array");
        Arrays.sort(array3);
        printArray(array3,"arraySort");
        revers2(array3);
        printArray(array3,"arrayBuffer2");
/*
        penulisan tanpa method
        System.out.print("arrayBuffer2 = ");
        for (int i = array3.length - 1; i >= 0; i--){
            System.out.printf("%d ",array3[i]);
        }
 */
        System.out.println("");

        // cara ketiga sorting terbalik
        // method revers3
        int[]array4 = {6,3,2,8,7};
        printArray(array4,"array");
        Arrays.sort(array4);
        printArray(array4,"arraySort");
        revers3(array4);
        printArray(array4,"buffer3");

        // method
    }

    static void revers3 (int[] dataArray){
        int buffer;
       // caranya kita memutar balik nilai array
        for (int i = 0; i < dataArray.length/2; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i]; 
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    static void revers2 (int[] dataArray){
        int[] hasilBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = hasilBuffer.length - 1; i >= 0; i--){
            dataArray[i] = hasilBuffer[(hasilBuffer.length - 1) - i];
        }
    }

    static void revers (int[] dataArray) {
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
    static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] total = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++){
            total[i] = arrayInt1[i] + arrayInt2[i];
        }
        return total;
    }

    static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}
