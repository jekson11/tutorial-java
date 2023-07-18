package com.tutorial;

import java.io.*;//menggunakan tanda bintang yanga artinya semua jenis io akan di ambil

public class characterStream {
    public static void main(String[] args) throws IOException{
        //character stream di gunakan untuk bahasa internasional khususnya bahasa yang
        //hurufnya berbeda seperti jepang korea atau yang lainnya
        //tetapi komputer atau laptop kita harus memiliki set lokasi internasional
        //jika tidak maka tidak akan bisa menuliskan tulisan internasional

        //membuka file

        //byte stream -> FileInputStream
        //Character stream -> FileReader
        FileInputStream byteFileInput = new FileInputStream("input.txtBC");
        //deklarasi charfile
        FileReader      charFileInput = new FileReader("input.txtBC");

        FileOutputStream byteFileOutput = new FileOutputStream("output.txtBy");
        //deklarasi output charfile
        FileWriter       charFileOutput = new FileWriter("output.txtCr");


        //membaca file

//        System.out.println(byteFileInput.read());
//        System.out.println(charFileInput.read());

        System.out.println("");

        //membaca file outputByte
        int buffer = byteFileInput.read();
        while (buffer != -1){
            System.out.print((char) buffer);
            byteFileOutput.write(buffer);//cara menuliskan tulisan yang ada di inputfile ke outputfile
            buffer = byteFileInput.read();
        }

        System.out.println("");

        //membaca file outputCharacter
        buffer = charFileInput.read();
        while (buffer != -1){
            System.out.print((char) buffer);
            charFileOutput.write(buffer);//cara menuliskan tulisan yang ada di inputfile ke outputfile
            buffer = charFileInput.read();
        }

        //menutup file
        //kita harus selalu nenutup file dengan cara seperti di bawah
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

        System.out.println("");

    }
}
