package com.tutorial;

import java.lang.StringBuilder;

public class stringBuilder {
    public static void main(String[] args) {

        /*
        panjangnya adalah banyak/total char pada string
        kapasita, kapasitas pada string builder adalah 16, ini otomatis deberi 16
        walaupun tidak ada string yang kita buat
        jadi kenapa kapasitas string hallo ada dua pulu?, karena 16 di tambah total
        string hallo yaitu 4 menjadi 20
        pada stringBuilder addressnya tetap sama jadi menghemat memori
         */

        StringBuilder builder1 = new StringBuilder("");
        printData(builder1);
        System.out.println("");

        // cara membuat StringBuilder
        StringBuilder builder = new StringBuilder("halo");
        printData(builder);
        System.out.println("");

        // append (manggabungkan)
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga medan");
        printData(builder);
        System.out.println("");

        //insert (memasukkan string di tengah-tengah)
        builder.insert(19, " kota");
        printData(builder);
        System.out.println("");

        //delet (menghapus bagian yang ingin di hapus)
        builder.delete(4,13);
        printData(builder);
        System.out.println("");

        //merubah character pada index tertentu menjadi W besar
        builder.setCharAt(5,'W');
        printData(builder);
        System.out.println("");

        //replace (mengganti string medan menjadi jakarta)
        builder.replace(16,21,"jakarta");
        printData(builder);
        System.out.println("");

        //casting menjadi string (merubah menjadi string)
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }

}
