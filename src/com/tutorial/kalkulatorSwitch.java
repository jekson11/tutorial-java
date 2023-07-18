package com.tutorial;

import java.util.*;

public class kalkulatorSwitch {
    public static void main(String[] args) {

    Scanner inputUser;
    float  a,b,hasil;
    String operator;
    inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.print(a + " " + operator + " " + b + " " + "= ");

        switch (operator) {
            case "+":
                // penjumlahan
                hasil = a + b;
                System.out.println(hasil);
                break;
            case "-":
                // pengurangan
                hasil = a - b;
                System.out.println(hasil);
                break;
            case "*":
                // perkalian
                hasil = a * b;
                System.out.println(hasil);
                break;
            case "/":
                // pembagian
                hasil = a / b;
                System.out.println(hasil);
                break;
            default:
                System.out.println("operator " + operator + " tidak di temukan");
        }
    }
}
