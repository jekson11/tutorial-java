public class IfElseStatement {
    public static void main(String[] args) {

        var nilai = 94;
        var absen = 80;

        if (nilai >= 75 && absen >= 80 ){
            System.out.println("selamat anda lulus");
        }else {
            System.out.println("anda tidak lulus");
        }
        // if bersarang
        if (nilai >= 90 && absen >= 90){
            System.out.println("nilai anda A");
        }else if (nilai >= 80 && absen >= 80){
            System.out.println("nilai anda B");
        }else if (nilai >= 70 && absen >= 70){
            System.out.println("nilai anda C");
        }else if (nilai >= 60 && absen >= 60){
            System.out.println("nilai anda D");
        }else {
            System.out.println("nilai anda E");
        }


    }
}
