package com.tutorial;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerdanStringTokenizer {

    public static void main(String[] args) throws IOException {

        FileReader fileInput = new FileReader("input.txtScanner");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        //ini untuk ngecek kata selanjutnya ada atau tidak
        System.out.println(scanner.hasNext());//true karna kata selanjutnya masih ada

        //membaca kata dengan pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()+"\n");//fales karna tidak aada lagi kata selanjutnya

        //menggunakan dlimeter tertentu
        FileReader fileInput2 = new FileReader("input2.txtScanner");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");//kita menggunakan ini karna delimeternya (,) bukan spasi

        //mengeluarkan input.txt menggunakan perulangan while
        //jika begini maka semua baris akan di print
        while (scanner.hasNext()){//scannar hasNext itu bernilai true dan false
            System.out.println(scanner.next());
        }

        //menggunakan String tokenizer untuk mengambil per baris dan delimeter
        //baris pertama
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println("\n"+data+"\n");

        StringTokenizer stringTokenizer = new StringTokenizer(data,",");//untuk delimeternya

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        data = bufferedReader.readLine();
        System.out.println("\n"+data+"\n");
        stringTokenizer = new StringTokenizer(data,",");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
