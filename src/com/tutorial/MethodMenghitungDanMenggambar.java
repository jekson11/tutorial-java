package com.tutorial;

import java.util.*;

public class MethodMenghitungDanMenggambar {

    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

        // inpur user
        System.out.print("input panjang = " );
        int inputPanjang = userInput.nextInt();
        System.out.print("input lebar = " );
        int inputlebar = userInput.nextInt();

        // memanggil method gambar
        gambar(inputPanjang,inputlebar);

        // memanggil method luas
        System.out.println(" cara pertama dalam memanggil method");
        System.out.println("luas = " + luas(inputPanjang,inputlebar));

        // memanggil method keliling
        System.out.println("keliling = " + keliling(inputPanjang,inputlebar));

        // memanggil method tampilkankelilingdanluas
        System.out.println(" cara kedua dalam memanggil method");
        TampilkanKelilingDanLuas(inputPanjang,inputlebar);

    }

    static void TampilkanKelilingDanLuas(int panjang,int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("keliling = " + keliling(panjang,lebar));
    }


    static int keliling(int panjang, int lebar) {
        int hasil = (panjang + lebar) * 2;
        System.out.println("menghitung keliling dengan panjang " + panjang + " , lebar " + lebar);
        return hasil;
    }
    static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        System.out.println("menghitung luas dengan panjang " + panjang + " , lebar " + lebar);
        return hasil;
    }

    static void gambar (int panjang, int lebar){
        for (int i = 0; i < panjang; i++){
            for (int j = 0; j < lebar; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
