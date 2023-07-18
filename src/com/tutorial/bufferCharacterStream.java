package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class bufferCharacterStream {

    public static void main(String[] args) throws IOException {

        //membaca file
        FileReader fileInput = new FileReader("input.txtCrS");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);
        //membaca ke dalam string
        String data = bufferedReader.readLine();
        System.out.println(data);

        //membaca ke dalam char
        bufferedReader.reset();
        char[] dataChar = new char [28];
        bufferedReader.read(dataChar,0, dataChar.length);//ini berfung si hanya pada array kalau tidak cukup menuliskan bufferedReader.read() saja
        System.out.println(Arrays.toString(dataChar));

        //membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());//berfungsi untuk langsung membaca semua char pada satu baris
        System.out.println(bufferedReader.readLine());//ini membaca baris ke dua

        //menulis file
        FileWriter fileOutput = new FileWriter("input.txtout");
        BufferedWriter  bufferedWrite = new BufferedWriter(fileOutput);

        bufferedReader.reset();
        //baris pertama
        String baris1 = bufferedReader.readLine();
        bufferedWrite.write(baris1,0,baris1.length());//berfungsi pada array karna bufferedReader.readLine() itu adalah array kalau tidak pada array
        bufferedWrite.flush();                            //cukup tulis bufferedWrite.write() saja

        //membuat newline/enter
        bufferedWrite.newLine();
        //baris ke dua
        String baris2 = bufferedReader.readLine();
        bufferedWrite.write(baris2,0,baris2.length());
        bufferedWrite.flush();

        //menutup file
        fileInput.close();
        bufferedReader.close();
        fileOutput.close();
        bufferedWrite.close();
 
    }
}
