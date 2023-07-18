public class MethodValue {
    public static void main(String[] args) {

        var result1 = sum (100, 200);
        var result2 = sum (200, 200);
        System.out.println(result1);
        System.out.println(result2);
        // agar lebih singkat bisa seperti ini
        System.out.println(sum(300, 300));

        // return bercabang
        System.out.println(hitung(500, "+", 500));
        System.out.println(hitung(1000, "-", 500));
        System.out.println(hitung(500, "kosong", 500));

    }

    static int sum (int value1, int value2){
        var total = value1 + value2;
        return total; //return untuk menghasilkan nilainya jadi agar var total menghasilkan nilai kita harus menggunakan return
    }

    // return gk hanya sekali kita juga bisa menggunakannya di percabangan contoh:
    static int hitung (int a, String operasi, int b){
        switch (operasi){
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                return 0;
        }
    }

}
