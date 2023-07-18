package com.tutorial;

public class OperatorUnary {
    public static void main(String[] args) {
        // Unary adalah operasi yang di lakukan pada satu variabel

        // Unary + -
        byte angka = 1;
        System.out.printf("unary '+' %d menjadi %d\n",angka, - angka); // jika kita mengmasukkan tanda -(mines) maka angkanya akan menjadi -(mines)
        System.out.printf("unary '-' %d menjadi %d\n",angka, + angka); // begitu pulak sebaliknya

        // Unary decrement dan increment
        byte angka2 = 10;
        //++angka2; // ini increment angkanya akan di tambahkan satukali
        System.out.println(++angka2); // cara penulisan bisa seperti ini dan juga seperti yang di bawah
        --angka2; // ini adalah decrement angka akan di kurangi satu kali
        System.out.println(angka2);

        // prefix dan postfix
        // prefix
        byte a = 20;
        System.out.printf("nilai dengan '++' di depan adalah prefix %d \n",++a);// nilainya akan di tambahkan satu kali karenya yanga lebih dulu di eksekusi adalah ++ nya
        // postfixt
        byte b = 20;
        System.out.printf("nilai dengan '++' di belakang adalah postfix %d \n",b++);// sedangkan ini tidak karena yang lebih dulu di eksekusi adalah b nya
        System.out.println(b);// dengan kita panggil b nya aja baru nilainya bertambah

        // tapi pada umumnya ++a dan a++ itu sama saja
    }
}
