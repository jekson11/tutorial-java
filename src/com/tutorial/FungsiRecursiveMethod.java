package com.tutorial;

import java.util.*;

public class FungsiRecursiveMethod {

    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai : " );
        int nilai = userInput.nextInt();

        printNilai(nilai);

        // method penjumlahan
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah nilai = " + jumlah);

        // method perkalian
        int faktorial = hitungFaktorial(nilai);
        System.out.println("jumlah nilai = " + faktorial);

    }

    static int hitungFaktorial(int parameter){
        System.out.println("parameter = " + parameter);
        if (parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }

    static int jumlahNilai(int parameter){
        System.out.println("parameter = " + parameter);
        if (parameter == 0){
            return parameter;
        }
        /*alasan mengapa bisa menjumlahkan totalnya karena parameter di tamba jumlahNilai -1
        misal parameter 5 jadi 5 + 4 mengapa empat karena parameternya langsung
        di kurang satu jadikan hasilnya sembilan 9 + 3 tiga ini dari parameter di kurang satu yang tadi
        parameternya 4 di kurang satu menjadi 3 begitu seterusnya
         */
        return parameter + jumlahNilai(parameter - 1); // return untuk menjumlahkan
    }

    static void printNilai(int parameter){
        System.out.println("nilai = " + parameter);
        if (parameter == 0){
            return; // return di sini berfungsi untuk menghentikan program bukan mengembalikan program
        }           // alasan mengapa return ini tidak menggunakan parameter karena dia menggunakan static void
                    // sedangkan di atas tidak perlu menggunakan return parameter karana tidak menggunakan void
        parameter--;
        printNilai(parameter); // memanggil kembali fungsinya agar tampil berurut dari 10 sampai 0
    }                           // jadi seperti looping
}
