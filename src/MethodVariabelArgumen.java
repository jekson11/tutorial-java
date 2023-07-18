public class MethodVariabelArgumen {
    public static void main(String[] args) {

        int[] values = {80, 80, 80, 90, 90};
        sayCongrats("Jekson", values);

        //memanggal array argumen
        sayCongrats2("jekson", 80,60,80,80,90);
    }
// ini jika menggunakan array
    static void sayCongrats(String name, int[] values){
      var total = 0;
    for( var value : values){
        total += value;
    }
    var finalValue = total / values.length;

    if(finalValue >= 75){
        System.out.println("Selamat " + total + " anda lulus");
    }else {
        System.out.println(name + " anda tidak lululs");
    }

    }
    // ini menggunakan variabel argumen bedanya kita cukup menggunakan titik tigakali dan kita juga bisa langsung menggabungkan datanya di dalam parameter
    // ini sama saja dengan array cuma ini lebih muda penulisannya
    static void sayCongrats2(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus");
        } else {
            System.out.println(name + " anda tidak lululs");
        }
    }
}
