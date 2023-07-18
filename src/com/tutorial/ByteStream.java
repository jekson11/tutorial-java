package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {

        // mendeklarasian file input dan output
        FileInputStream fileInput = null;
        FileOutputStream fileOuput = null;

        //membuka file
        fileInput = new FileInputStream("input.txt1");

        //membaca file
        int dataInput = fileInput.read();
        //mengeluarkan file input dengan while loop
        while (dataInput != -1){//-1 karna jika filenya sudah habis di print dia akan ngeprin -1
            System.out.println((char) dataInput);
            dataInput = fileInput.read();
        }

        //menutup file setelah kita selesai mengeluarkan filenya kita harus menutupnya dengan
        //cara di bawah ini agar hemat ruang atau ramnya
        fileInput.close();

        //salah satu contoh sekenario program pembukaan file dengan output
        try {
            //membuka file
            fileInput = new FileInputStream("input.txt2");
            fileOuput = new FileOutputStream("output.txt");//dengan kita menulis seeperti ini di saat kita run maka file ouputnya otomatis di buat

            //dengan begini maka ini file input di tulis ke dalam file output
            //apapun yang ada di dalam file input akan sama dengan file output
            int buffer = fileInput.read();
            while (buffer != -1){
                fileOuput.write(buffer);
                buffer = fileInput.read();
            }
        }finally {//kita bisa langsung menggunakan finally karna kita sudah membuat throws IOException
            if (fileInput != null){
                fileOuput.close();
            }
            if (fileOuput != null){
                fileOuput.close();
            }
            System.out.println("iii");
        }

        //contoh terakhir try with resource
        // kita menambah kan () di try
        //yang terakhir berfungsi agar tidak usah lagi menuliskan close karna otomatis ter close
        //kita juga bisa menambahkan file ouput
        try(FileInputStream in = new FileInputStream("input.txt3")) {
            int dataInput2 = in.read();

            while (dataInput2 != -1){
                System.out.print((char) dataInput2);
                dataInput2 = in.read();
            }
        }

    }
}
