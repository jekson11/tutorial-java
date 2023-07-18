package com.tutorial;

import java.util.Formatter;

public class stringFormatBuilder {
    public static void main(String[] args){

        String nama = "ucup";
        int umur = 17;

        // penulisan string biasa
        System.out.println("nama saya " + nama + " umur saya " + umur);

        // penulisan dengan format string
        System.out.printf("nama saya %s umur saya %d\n",nama,umur);

        // conversion : f=floating point, d=integer, c=character, s=string, b=boolean
        // struktur format(yang bisa di tuliskan kedlam format) adalah
        // %[argumen index$][flags][width][.percision]conversion

        // [argumen index$] menuliskan 1$ artinya mengelompokkan yang 1$ untuk nama dan yang 2$ untuk umur
        System.out.println("\narguen_index$");
        System.out.printf("umur %1$s berapa?, jawab %1$s : umur %1$s %2$d mamang wah masih %2$d\n",nama,umur);

        // [flags] dengan menambahkan + kita tau hasilnya positif atau negatif jika positif makan akan ada tanda + begitu juga sebaliknya
        System.out.println("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 + int2;
        System.out.printf("%d + %d = %+d\n",int1,int2,hasil);

        // [width]
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3);// flags "-", artinya rata kiri
        System.out.printf("%+5d\n",int3);// flags akan mengambil slot di dalam format
        System.out.printf("%+-6d\n",int3);// flags bisa di gabungkan
        System.out.printf("%10d\n",int3); // ini sama saja dengan yang di bawah
        System.out.printf("% 10d\n",int3);
        System.out.printf("%010d\n",int3);// flags "0" kita menambahkan leading "0"
        System.out.printf("%+010d\n",int3);
        int int4 = 10000000;
        System.out.printf("%,d\n",int4);// flags "," menambahkan delimeter

        System.out.println("\nFLOATING_POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n",float1);
        System.out.printf("%+9f\n",float1);// floting point akan mengambil width dengan 9 ata lebih desimal

        // [.percission](jika angka yang ada di pertengahan 6 dan 8 itu 4,3,2,1 maka akan di bulatkan ke bawah
        // tetapi jika 5,6,7,8,9 akan di bulatkan ke atas
        System.out.println("\n[percision]");
        float float2 = 15.648f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%8.2f\n",float2);
        System.out.printf("%+08.2f\n",float2);

        // contoh penggabungan semua struktur format
        float IPK = 3.789f;
        System.out.printf("\nIPK %1$s brapa?, %1$s : saya dapat %2$+5.2f\n",nama,IPK);

        // kesimpulan
        // save format ini ke dalam variabel string
        String info_biasa = "nama: " + nama + ", IPK = " + IPK;
        System.out.println("" + info_biasa);

        String info_format = String.format("nama: %s, IPK = %2$+5.2f",nama,IPK );
        System.out.println(info_format);

        // save format kedalam string builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("nama: %s, IPK = %2$+5.2f",nama,IPK);
        System.out.println(builder_info);

    }

}















