package com.tutorial;
import java.util.*;

public class kalkulatorIfElse {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        float a,b,hasil;
        char operator;

        System.out.println("operator +,-,*,/ ");

        System.out.print("nilai a= " );
        a = userInput.nextInt();
        System.out.print("nilai operator= " );
        operator = userInput.next().charAt(0);
        System.out.print("nilai b= " );
        b = userInput.nextFloat();

        System.out.println("input user " + a + " " + operator + " " + b);

        if (operator == '+') {
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*') {
            // perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/') {
            // pembagian
            if (b==0){
                System.out.println("nol menghasilkan pembagian tak hingga");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else if (operator == '-') {
            // pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else {
            System.out.println("ooperator tidak tersedia");
        }

        // jika q bernilai berapapun kecuali nol dibagi dengan z yang bernilai nol maka akan menghasilkan infinity atau takhingga
        // itu kalau menggunakan tipedata float atau yang berkoma, tapi jika menggunakan int maka akan eror
        // tetapi tidak berlaku kebalikannya atau q nya yang nol
        float q,z,w;
        q = 10f;
        z = 0f;
        w = q / z;
        System.out.println("hasil = " + w);

    }
}
