public class MethodOverLoading {
    public static void main(String[] args) {

        sayaHello();
        sayHello("jekson");
        sayHello("udin", "petod");

    }
 // kita bisa memanggil method dengan nama yang sama sebanyak banyaknya asalkan para meternya berbeda
    static void sayaHello(){
        System.out.println("Hello");
    }

    static void sayHello(String firsName){
        System.out.println("Hello " + firsName);
    }

    static void sayHello(String firsName, String lastName ){
        System.out.println("Hello " + firsName + " " + lastName);
    }


}
