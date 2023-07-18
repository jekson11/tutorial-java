public class DoWhileLoop {
    public static void main(String[] args) {
        //pada do while perulangan akan di eksekusi minimal satu kali awalaupun kondisinya bernilai false
        //sedangkan pada while loop perulangan tidak akan di eksekusi jika nilai awalnya false

        //contoh do while

        var a = 100;
        do {
            System.out.println("Perulangan Ke " + a);
            a++;
        }while (a <= 10);

    }
}
