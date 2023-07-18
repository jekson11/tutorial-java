package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {

        //exception/eror di gunakan saat kita membuka file
        int[] array = {0,1,2,3,4};
        Scanner userInput = new Scanner(System.in);

        System.out.print("input index = ");
        int index = userInput.nextInt();

        //exception adalah error
        //contoh exception jika kita menginput nilai yang tidak ada pada array
        //exception fungsinya dia akan tetap menjalankan program yang ada di bawah
        //exception heandling memiliki kywords(try,catch,finaly)

        System.out.println("ini adalah headling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d\n",index,array[index]);
        }catch (Exception e){ // ini mengambil exceptionnya untuk mengecek sedankan e itu adalah nama exceptionnya
            System.out.println(e); // kita memanggil exceptionnya
        }

        //runtime error saat mengambil sebuah file
        System.out.println("ini adalah headlingg Io not found");
        FileInputStream fileInput = null;//mendeklarasikan untuk memanggil file
        try {
            fileInput = new FileInputStream("input.tex");//ini untuk mencari atau memanggil file ini erro karna file yang kita cari tidak ada
        }catch (IOException e){//menggunakan IOException karna biasanya untuk mengecek file orang menggunakan IOException
            System.out.println(e);
        }

        //menggabungkan duabuah exception
        //menggabungkan exacepption dia akan memilih salah satu saja untuk di eksekusi
        System.out.println("menggabungkan duabuah exception");
        try {
            System.out.printf("index ke-%d, adalah %d\n",index,array[index]);
            fileInput = new FileInputStream("input.tex");
        }catch (ArrayIndexOutOfBoundsException e){ // sama saja dengana yang di atas atau Exception
            System.err.println("indeks yang anda masukkan tidak sesuai dengan array"); //err agara tulisannya menjadi merah
        }catch (IOException e){
            System.err.println("file tidak di temukan");
        }

        //finaly
        try {
            System.out.printf("index ke-%d, adalah %d\n",index,array[index]);
        }catch (ArrayIndexOutOfBoundsException e){ // ini mengambil exceptionnya untuk mengecek sedankan e itu adalah nama exceptionnya
            System.out.println(e); // kita memanggil exceptionnya
        }finally {
            System.out.println("finaly"); // finaly ini berfungsi untuk mengclos atau menutup exception ini akan di print
        }


        System.out.println("input teks");





    }
}
