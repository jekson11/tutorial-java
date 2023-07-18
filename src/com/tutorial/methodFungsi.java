package com.tutorial;

public class methodFungsi {

    public static void main(String[] args) {

        int x,y;
        x = 5;
        y = hitung (x);
        System.out.println("x" + "=" + x + " y=" + y);

        x = 20;
        y = hitung (x);
        System.out.println("x" + "=" + x + " y=" + y);

        x = 30;
        y = hitung (x);
        System.out.println("x" + "=" + x + " y=" + y);


    }

    static int hitung (int input){
    int hasil;

    //hasil = (input + 2) * input;
        hasil = input * input;
    return hasil;
    }

}
