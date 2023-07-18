import java.util.Arrays; // kita bisa pakai laibreri ini untuk mengubah array yang integer menjadi string
public class Array {
    public static void main(String[] args) {

        //cara penulisan array 1
        String[] stringArray;
        stringArray = new String [3];
        stringArray[0] = "hello";
        stringArray[1] = "jekson";
        stringArray[2] = "tambunan";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // cara mengubah data pada Array
        stringArray[0] = "hai";
        System.out.println(stringArray[0]);

        //cara penulisan Array 2
        String[] ArrayString = new String[3];
        ArrayString[0] = "selamat";
        ArrayString[1] = "datang";
        ArrayString[2] = "user";

        System.out.println(ArrayString[0]);
        System.out.println(ArrayString[1]);
        System.out.println(ArrayString[2]);

        //cara penulisan Array 3
        String[] ArrayString2 = new String[]{
                "welcome", "to", "java"
        };

        //cara mendeklarasikan array
        String[] ArrayString3 = new String[5];
        // membuat nilai array yang kita deklarasi
        ArrayString3[2] = "bola";
        System.out.println(ArrayString3[2]);

        //pada java tidak ada istilah menghapus data array yang ada kita bisa mengubah data tersebut menjadi kosong contoh
        //karena String tipe data yang bukan primitif kita bisa mengubahnya/mengosongkannya menjadi null
        //jika tipedatanya primitif kita bisa menuliskan 0
        ArrayString2[2] = null;


        System.out.println(ArrayString2[0]);
        System.out.println(ArrayString2[1]);
        System.out.println(ArrayString2[2]);

        //cara penulisan Array 4
        int[] ArrayInt = {
                10, 20, 30, 40, 50
        };

        System.out.println(ArrayInt[0]);
        System.out.println(ArrayInt[1]);
        System.out.println(ArrayInt[2]);
        System.out.println(ArrayInt[3]);
        System.out.println(ArrayInt[4]);
        System.out.println(ArrayInt.length);//length ini untuk mencari tau seberapa panjang arraynya
        /*
         buka komentar yang di bawah untuk mengubah arrayint menjadi string dengan memanggil method toString tidak hanya string
         kita bisa memanggil method yang lain-lainnya
         string yang di maksud bukan mengubahnya menjadi kata kata tetapi kita bisa langsung melihat isi dari array tersebut ada apa aja
         tanpa cape menulis seprti yang di atas
         kalau korang mengerti coba komentar sout yang di atas dan buka komentar yang di bawah dan lihat perbedaannya
        */
        //System.out.println(Arrays.toString(ArrayInt));

        //Array di dalam Array
        String[][] duobleArray = {
                {"selamat", "datang", "jekson", "tambunan"},//ini array yang ke 0 dari array yang pertama
                {"hello", "world",},//ini array yang ke 1 dari array yang pertama
                {"hallo", "dunia", "pagi"}//ini array yang ke 2 dari array yang pertama
                //jadi yang di dalam kurung kurawal adalah array yang ke dua
        };
        //jika kiata ingin mengambil jekson kita menulis 0 lalu 2 karena kata jekson berada di dalam array ke 0 dan array ke 2 dari array ke dua
        System.out.println(duobleArray[0][2]);
        System.out.println(duobleArray[1][0]);
        System.out.println(duobleArray[2][1]);
        String array = duobleArray[0][2];
        System.out.println(array);

    }
}
