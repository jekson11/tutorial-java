public class Method {
    public static void main(String[] args) {
        // method adalah block kode program yang akan berjalan jika di panggil
        // cara penulisan method biasanya di awali dengan huruf kecil dan huruf besar setelahnya contoh: sayHelloWorld
        // jadi kegunaannya kita bisa misahin kode program menggunakan method dan ketika kita ingin memanggil methotnya cukup di panggil saja

        sayHelloWorld(); // di panggil menggunakan methodnya
        sayHelloWorld(); // jika kita memanggil methodnya dua kali makan outputnya akan keluar duakali
        sayHelloWorld(); // jika di panggil tiga kali makan outputnya keluar tiga kali
    }
    static void sayHelloWorld(){
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        System.out.println("Hello World 4");
    }
}