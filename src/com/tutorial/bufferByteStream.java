package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class bufferByteStream {

    public static void main(String[] args) throws IOException{
        System.out.println("");
        long waktuStrat,waktuFinish;

        /*
        dari sini kita tau bahwa lebih cepat BufferedInputStream ketimbang FileInputStream
        karena BufferedInputStream menggunakan memory, memory lebih cepat di banding hardisk
         */

        //membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txtBuffer");
        System.out.print("total char pada file byteInput = " + byteInput.available());//ini untuk ngecek ada berapa character di dalam file

        System.out.println("");

        //menghitung waktu pembacaan file
        waktuStrat = System.nanoTime();//System.nanoTime untung menghitung waktu, nanoTime lebih cepat di banding detik atau yang di bawahnya
        System.out.println("\nadress seluruh data file = "+byteInput.readAllBytes());//.reatAllBytes untung membaca semua data
        waktuFinish = System.nanoTime();
        System.out.println("waktu file = " + (waktuFinish - waktuStrat));
        byteInput.close();// kita harus menutupnya

        System.out.println("");

        //membaca dari memory
        FileInputStream byteInput2 = new FileInputStream("input.txtBuffer");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        //mendhitung waktu pembacaan memory
        waktuStrat = System.nanoTime();
        System.out.println("adress seluruh data file = " + bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu memory = " + (waktuFinish - waktuStrat));
        //tetapi di sini kita tidak perlu menutupnya

        System.out.println("");

        //membaca memori
        FileInputStream byteInput3 = new FileInputStream("input.txtBuffer");
        BufferedInputStream bufferedInput2 = new BufferedInputStream(byteInput3);

//      mereset dengan cara
        bufferedInput2.mark(200  );//mark dilakukan untuk kita bisa membaca ulang kembali data tersebut arti duaratus adalah batas
        waktuStrat = System.nanoTime();
        System.out.println(bufferedInput2.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu memory = " + (waktuFinish - waktuStrat));

        //membaca ulag yang telah di reset
        bufferedInput2.reset();//jika kita ingin membaca ulang yang telah di reset kita harus menggunakan .reset();
        byte[] dataBuffer = bufferedInput2.readAllBytes();
        String dataString = new String(dataBuffer);//mengubah agar menjadi string
        System.out.println("total seluruh input/file yang menjadi byte:");
        System.out.println(Arrays.toString(dataBuffer));//menampilkan semua data yang ada di bufferInput2 dalam bentuk byte
        System.out.println("mengubah menjadi string = " + dataString); //kita bisa mengubahnya menjadi string

        byteInput.close();
        byteInput2.close();
        byteInput3.close();
        bufferedInput.close();
        bufferedInput2.close();

        //menulis dengan bufferOutput
        FileOutputStream byteOutput = new FileOutputStream("output.txtBuffer");
        BufferedOutputStream bufferedOutput =  new BufferedOutputStream(byteOutput);

        //Write data
        bufferedOutput.write(dataBuffer,0, dataBuffer.length);//write data yang ada pada variable array dataBuffer
        bufferedOutput.flush();//menggunakan flush karana pada bufferedOutput semua data di kumpulkan terlebih dahulu di sebuah memori
        //kemudian di flush ke bufferedOutput

        //menutup
        byteOutput.close();
        bufferedOutput.close();


    }
}
