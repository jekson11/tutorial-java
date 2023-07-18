package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResource {

    /*
     * di java 7 terdapat fitur baru bernama try with resouce
     * try  with resource adalah sebuah mekanisme agar kita lebih mudah menguunakan resource yang wajib di close dalam block try
     * jika kita ingin menggunakan fitur ini kita wajib menggunakan interface autocloseable
     */
        public static void main(String[] args) {

            BufferedReader buffer = null;

            try {
                buffer = new BufferedReader(
                        new FileReader("DATABASEEE.md")
                );

                while (true) {
                    String line = buffer.readLine();
                    if (line == null) {
                        break;
                    }
                    System.out.println(line);
                }
                System.out.println("Sukses membca file");
            } catch (Throwable throwable) {
                System.out.println("Error membaca file " + throwable.getMessage());
            } finally {
                if (buffer != null) {
                    try {
                        buffer.close();
                        System.out.println("Sukses menutp file");
                    } catch (IOException ex) {
                        System.out.println("Error menutup resource " + ex.getMessage());
                    }
                }
            }
        }
}


