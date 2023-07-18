package com.tutorial;

import java.util.Arrays;

public class variableString {
    public static void main(String[] args) {

        String kataStr = "hallo o";
        System.out.println(kataStr);

        char[] kataChar = {'h','a','l','l','o'};
        System.out.println(kataChar);

        System.out.println("=================================");
        // kita bisa mengakses setiap char pada sring karna sring itu juga
        // memiliki char dengan cara menuliskan nama variabel string tersebut
        // lalu .charAt(0)
        System.out.println("Komponen pertama dari charArray = " + kataChar[0]);
        System.out.println("Komponen pertama dari String = " + kataStr.charAt(0));

        System.out.println("=================================");
        // cara merubah komponen dari string itu tidak bisa pada java
        // tapi kita bisa merubah komponen stringnya secara tidak langsung
        // dengan menulis nama variabelny dan .substring seperti di bawah
        // dengan begitu kita bisa tinggal menambahkan string lain dan menggabungkannya
        // tetapi substring tidak akan mengambil komponen yang di jika di batasi oleh spasi
        // seperti contoh di bawah aku mengambil 1 sampai 6 char di string tetapi
        // yang terambil hanya sampai 5 karena char yang ke 6 di batasi oleh spasi
        System.out.println("c" + kataStr.substring(1,6));

        System.out.println("=================================");
        // mengeluarkan addres pada tring seperti di bawah
        String str_1 = "test";
        String str_2 = "test";
        int address = System.identityHashCode(str_1);
        int address2 = System.identityHashCode(str_2);
        System.out.println("str_1 = " + str_1 + "\t || " + Integer.toHexString(address));
        System.out.println("str_2 = " + str_2 + "\t || " + Integer.toHexString(address2));

        /*
        kesimpulan.
        1. String di java itu immutable(tidak bisa di ubah)
        2. membuat string seperti di atas memiliki letak memori/addres yang sama karena
           string yang di tulis sama jadi letak memorinya sama,
           java memiliki memori tersendiri untuk string.
        3. tapi kita juga bisa membuat letak memorinya berbeda walau stringnya sama seperti
           contoh di bawah
         */
        String str_3 = new String("hallo");
        int address3 = System.identityHashCode(str_3);
        System.out.println("str_3 = " + str_3 + "\t || " + Integer.toHexString(address3));

    }
}
