package com.tutorial;

public class bitwise {
    public static void main(String[] args) {
        System.out.println("");// ini hanya untuk enter agar memiliki jarak
        // Operator Bitwise adalah operator untuk melakukaan operasi pada nilaai bit

        // variable
        byte a = 5;
        byte b,c;
        String a_bits, b_bits, c_bits;

        /*
        String.format yang artinya kita akan membuat String dengan format tertentu dengan memanggil class helpernya String.
        %8s yang artinya kita membuat delapan buah karakter dan s nya adalah String.
        jadi maksud dari a_bits = String.format adalah kita menyimpan nya di dalam String a_bits.
        Integer.toBinaryString(a) yang artinya kita memindahkan Byte menjadi String dengan menggunakan helpernya karna a adalah byte
        replace(' ','0') yang artinya kita akan menampilkan nilai yang tidak ada di belakang menjadi nol(0)
         */

        // Tanpa menggunakan replace nilai yang di belakang tidak akan di tampilkan
        System.out.println("Tanpa menggunakan REPLACE");
        a_bits = String.format("%8s",Integer.toBinaryString(a));
        System.out.printf("%s = %d \n",a_bits, a);

        System.out.println("");

        // Operator Shift Left
        System.out.println("======== SHIFT LEFT");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte) (a << 1); // << ini yang artinya di geser ke kiri jadi (a) di geser ke kiri 1 kali
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);

        System.out.println("");

        // Operator Shift Right
        System.out.println("======== SHIFT RIGHT");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte) (a >> 2); // << ini yang artinya di geser ke kanan jadi (a) di geser ke kanan 2 kali
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);

        System.out.println("");

        // Operator Bitwise Or
        System.out.println("======== BITWISE OR (|)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("------------------- OR");
        c = (byte) (a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);

        System.out.println("");

        // Operator Bitwise And
        System.out.println("======== BITWISE AND (&)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("------------------- AND");
        c = (byte) (a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);

        System.out.println("");

        // Operator Bitwise Xor
        System.out.println("======== BITWISE XOR (^)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("------------------- XOR");
        c = (byte) (a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);

        System.out.println("");

        // Operator Bitwise Not
        System.out.println("======== BITWISE NOT (~)");
        a = 24;
        b = (byte) ~a;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        System.out.println("------------------ NOT");
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24); // ini substring(24) yang artinya hanya mengambil 24 bit
        System.out.printf("%s = %d \n",b_bits, b);


    }
}
