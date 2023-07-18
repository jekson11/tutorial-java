import javax.print.DocFlavor;

public class Variable {
    public static void main(String[] args) {
        //penulisan tipe data yang pertama
        String firsname;
        firsname = "jekson";
        String lastname;
        lastname = "tambunan";

        System.out.print(firsname);
        System.out.println(lastname);

        //yang kedua
        int ege = 18;
        String thn = "tahun";
        String address = "indonesia";

        System.out.print(ege);
        System.out.println(thn + " " + address);//kita bisa menggabungkan string dengan menggunakan tanda tambah dan peti kosong sebagai spasi

        //yang ketiga dengan menuliskan var kita tidak perlu menyebutkan tipe datanya
        var name = "jekson tambunan";//string
        var ege2 = 18; //int

        System.out.println(name);
        System.out.println(ege2);

        //jika menuliskan var kita tidak bisa menuliskan nya seperti yang di bawah ini, ini akan eror
        //var name2;
        //name2 = "jekson";
        //System.out.println(name2);


        //kita juga bisa mengganti tipe data yang diatas
        firsname = "tambunan";
        System.out.println(firsname);


        //secara default. variable di java bisa diubah-ubah nilainya tapi jika kita ingin membuat variable yang datanya
        //tidak bisa di ubah kita bisa menuliskan final contoh
        //ini biasa disebut konstan
        final String iniString = "belajar java";//dengan seperti ini kita tidak bisa mengubahnya
       // iniString = "belajar php";//lihat ini eror jadi saya tutup dengan komentar
        System.out.println(iniString);


    }
}
