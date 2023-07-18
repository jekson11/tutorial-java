public class KonversiNumber {
    public static void main(String[] args) {

        //konversi tipe data secara otomatis dengan syarat harus berurutan atau mulai dari tipe data yang paling kecil
        byte iniByte = 30;
        short iniShort = iniByte; //dengan begini tipe data Byte di konversi menjadi Short
        int iniInt = iniShort; //dengan begini tipe data shor di konversi menjadi int
        System.out.println(iniInt);

        //konversi tipe data secara manual di lakukan seperti ini karena tipe data short lebih besar dari pada byte
        // hati" saat mengkonversi dari yang paling besar ke yang paling kecil nanti terkena number overflow
        short iniShort2 = 1000;
        byte iniByte2 = (byte) iniShort2;
        System.out.println(iniByte);

        // konversi di penjumlahan
        int x = 10;
        int y = 4;
        float z = (float) x / y; // dengan menulus nama variabelnya di dalam tutup kurung maka x y nya akan menjadi float
        // %f ini untuk var float, %d ini desimal atau integer
        System.out.printf("%d / %d = %f \n", x, y, z);



    }

}
