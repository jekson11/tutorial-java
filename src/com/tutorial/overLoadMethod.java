package com.tutorial;

public class overLoadMethod {
    public static void main(String[] args) {

        int hasilInteger;
        hasilInteger = tambah(4,7);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah(5.5f,4);
        printAngka(hasilFloat);

        printAngka(10);
        printAngka(5.5f);
        printAngka(7.4d);
    }

    // overload kita menggunakan method yang sama tapi argumennya bisa berbeda beda
    // method
    static int tambah(int angkaInteger1, int angkaInteger2){
        return angkaInteger1 + angkaInteger2;
    }

    static float tambah(float angkafloat, int angkaInteger2){
        return angkafloat + angkaInteger2;
    }

    static void printAngka(int angkaInteger){
        System.out.println("angka ini adalah integer dengan nilai = " + angkaInteger);
    }

    static void printAngka(float angkaFloat){
        System.out.println("angka ini adalah float dengan nilai = " + angkaFloat);
    }
    // printAngka di sebut method atau fungsi sedangkan angkaDouble di sebut argumen
    static void printAngka(double angkaDoule){
        System.out.println("angka ini adalah double dengan nilai = " + angkaDoule);
    }
}
