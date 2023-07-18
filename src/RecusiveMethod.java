public class RecusiveMethod {
    public static void main(String[] args) {

        System.out.println(factorLooping(5)); // jika methodnya menggunakan tipe data maka untuk memanggilnya kita menggunakan
                                                    // System.out.println baru nama methodnya
        System.out.println(factorRecursif(5));

        //recursive jika makin banyak valuenya makan akan eror
       loop(100);
    }
    static int factorLooping(int value){
      var result = 1;

      for(var counter = 1; counter <= value; counter++){
          result *= counter;
      }
      return result;
    }

    // recursive method
    static int factorRecursif(int value){
        if(value==1){
            return 1;
        }else {
            return value * factorRecursif(value -1);
        }
    }

    // hati hati saat menggunakan recursive method karna jika terlalu dalam recursivenya akan terjadi stack overflow recursive
   // seperti dibawah ini
    static void loop(int value){
        if(value == 0){
            System.out.println("selesai");
        }else {
            System.out.println("loop " + value);
            loop( value -1);
        }
    }

}
