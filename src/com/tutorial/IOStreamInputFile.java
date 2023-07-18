package com.tutorial;

import javax.security.auth.callback.CallbackHandler;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamInputFile {
    public static void main(String[] args) throws IOException {

//        try {
//            FileInputStream fileInput = new FileInputStream("input.text");
//        }catch (Exception e){
//            System.err.println(e);
//        }


        FileInputStream fileInput = new FileInputStream("input.txt");
        System.out.print((char) fileInput.read());// memanggil file
        System.out.print((char) fileInput.read());
        System.out.print((char) fileInput.read());
        System.out.println((char) fileInput.read());


    }
}
