package com.tutorial; // ini adalah folder

public class JenisPrintln {
    public static void main(String[] args) {
        System.out.println("Hello World"); // dengan println otomatis menambahkan baris baru pada kata berikutnya
        System.out.print("Hai World \n"); // dengan print lalu kita menambahkan \n di belakangnya maka akan menambahkan enter juga cuma beda cara penulisan
        System.out.printf("Halo Dunia %d \n", 121);// dengan printf kita bisa memasukkan data di luar stringnya dengan menulis %d(desimal) dan di ikuti tanda koma
                                                    // tapi printf tidak menambahkan baris baru jadi kita hars menambahkan \n(baris baru)
        System.out.println("Hello Hai 121"); // begini juga bisa tanpa menggunakan printf
        System.out.print("Hai and Hello\n"); //dengan print biasa ini tidak akan menambahkan enter
        System.out.printf("Halo Dunia %s \n", "tipu-tipu"); // ini untuk string
    }
}
