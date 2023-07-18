public class tugasString {
    public static void main(String[] args) {

        String kata = "pemrograman java";
            for (int i = 0; i < kata.length(); i++){
                System.out.println(kata.substring(i));
            }

        System.out.print("\n");

            for (int i = 0; i < kata.length(); i++){
                System.out.println(kata.charAt(i)); //mengambil per charakter dalam sebuah string
            }

        System.out.print("\n");

            for (int i = 15; i >= 0; i--){
                System.out.println(kata.substring(i));
            }
    }

}
