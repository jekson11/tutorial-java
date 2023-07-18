package com.tutorial;

import java.util.*;

public class latihanFibonacci {

    public static void main(String[] args) {

        // menggunakan for loop

        int fn,fn_1,fn_2,n;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("mengambil nilai foor loop fibonacci ke - : ");
        n = inputUser.nextInt();

        fn_1 = 1;
        fn_2 = 0;
        fn = 1;

        for (var i = 1; i <= n; i++) {
            System.out.println("nilai ke - " + i + " adalah " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }

        System.out.println("");

            // menggunakan while loop

            int Fn,Fn_1,Fn_2,N;
            int I = 1;
            Scanner inputUser2 = new Scanner(System.in);

            System.out.print("mengambil nilai while loop fibonacci ke - : ");
            N = inputUser2.nextInt();

            Fn_1 = 1;
            Fn_2 = 0;
            Fn = 1;

            while (I <= N){
                System.out.println("nilai ke - " + I + " adalah " + Fn);
                Fn = Fn_1 + Fn_2;
                Fn_2 = Fn_1;
                Fn_1 = Fn;
                I++;
            }

        System.out.println("");

            // Do while

        int FN,FN_1,FN_2,KN;
        int j = 1;
        Scanner inputUser3 = new Scanner(System.in);

        System.out.print("mengambil nilai do while fibonacci ke - : ");
        KN = inputUser2.nextInt();

        FN_1 = 1;
        FN_2 = 0;
        FN = 1;

        do {
            System.out.println("nilai ke - " + j + " adalah " + FN);
            FN = FN_1 + FN_2;
            FN_2 = FN_1;
            FN_1 = FN;
            j++;
        }while (j <= KN);
    }
}
