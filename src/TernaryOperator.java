import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
       // ternary operator juga hampir sama dengan if else cema lebih singkat

        // jika if else seperti ini
       var nilai = 75;
       String ucapan;

       if (nilai >= 75){
           ucapan = "Anda lulus";
       }else {
           ucapan = "Anda tidak lulus";
       }
        System.out.println(ucapan);


       // maka Ternary seperti ini
        // jika kondisinya bernilai true maka yang di jalankan anda lulus sedangkan jika kondisinya false maka yang di jalankan anda tidak lulus
        ucapan = nilai >= 75 ? "Anda lulus" : "Anda tidak lulus";
        System.out.println(ucapan);

        // perkalian dan pembagian ternary operator
        Scanner inputUser = new Scanner(System.in);
        int input,x;
        System.out.print("masukkan nilai : ");
        input = inputUser.nextInt();

        x = (input == 10) ? (input*input) : (input/2);
        System.out.println("hasil " + x);

    }
}
