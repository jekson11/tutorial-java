public class MethodParameter {
    public static void main(String[] args) {
        // method parameter bisa mengirim informasi ke method yang ingin kita panggil
        // untuk melakukan hal tersebut kita perlu menambahkan parameter atau argumen di methodnya

        sayMayNames("jekson", "tambunan");
        sayMayNames("budi", "anugrah");

    }

    static void sayMayNames (String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
