public class Continue {
    public static void main(String[] args) {

        for (var a = 1; a <= 100; a++) {
            if (a % 2 == 0) {
                continue; //continue akan menghentikan perulangan saat ini dan melanjutkan ke perulangan yang selanjutnya
                //itu kenapa bilangan yang habis di bagi dua tidak di eksekusi
            }
            System.out.println("Bilangan Ganjil " + a);
        }
    }
}
