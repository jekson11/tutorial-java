public class OperasiMatematika {
    public static void main(String[] args) {

        var a = 100;
        var b = 100;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        //kita bsa menggunakan printf
        int hasil;
        hasil = a + b;
        System.out.printf("%d + %d = %d \n", a,b,hasil);

        int c = 200;
        // assignment
        System.out.println(c += 10);
        System.out.println(c -= 10);
        System.out.println(c *= 10);
        System.out.println(c %= 10);

        int d  = 300;

        d++;
        System.out.println(d);
        d--;
        System.out.println(d);

        //Kelas Math adalah kelas yang terdapat pada java.lang yang berguna untuk menlakukan berbagai operasi matematika

        //konstanta
        System.out.println("\nE = " + Math.E);// e itu baris logaritma alami
        System.out.println("PI  = " + Math.PI);// pi juga sama
        System.out.println("abs = " + Math.abs(4.3));//menghasilkan nilai absolut dengan tipe double
        System.out.println("max = " + Math.max(3,4));//menghasilkan nilai bertipe double dengan nilai yang paling besar
        System.out.println("min = " + Math.min(9,8));//sebaliknya menghasilkan nilai terkecil
        System.out.println("pow = " + Math.pow(2,3));//menghasikan nilai bertipe double dari hasil perpangkatan yang di beri 2 pangkat 3
        System.out.println("sqrt = " + Math.sqrt(9));//menghasikan nilai bertipe double dari akar yang di input akar 9
        System.out.println("cos = " + Math.cos(7));//menghasilkan nilai cosin dengan tipe double
        System.out.println("exp = " + Math.exp(4));//menghasilkan nilai bertipe double yang merupakan hasil exponensial
        System.out.println("log = " + Math.log(4));//menghasikan nilai double yang merupakan logaritma asli bilangan 4 dan yg di input
        System.out.println("random  = " + Math.random());//menghasilkan nilai double antara 0 dan 1 yang merupakan hasil bilangan acak
        System.out.println("tan = " + Math.tan(5));//menghasilkan nilai tanget dengan tipe double para meter dari suatu radian

    }
}
