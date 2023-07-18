public class SwitchStatement {
    public static void main(String[] args) {
        // switch ini hampir sama dengan if bersarang

        // cara pertama penulisan Switch hanya bisa di java 14 ke atas
        var nilai = 80 ;

        switch (nilai){
            case 90, 96 -> System.out.println("Anda lulus dengan nilai A");
            case 80 -> System.out.println("Anda lulus dengan nilai B");
            case 70 -> System.out.println("Anda lulus dengan nilai C");
            case 60 -> System.out.println("Anda lulus dengan nilai D");
            default -> System.out.println("Anda tidak lulus, nilai Anda E");
        }

        // cara kedua penulisan Switch
        switch (nilai){
            case 90:
                System.out.println("Anda lulus dengan nilai A");
                break;
            case 80:
                System.out.println("Anda lulus dengan nilai B");
                break;
            case 74:
            case 70:
                System.out.println("Anda lulus dengan nilai C");
                break;
            default:
                System.out.println("Anda tidak lulus, nilai Anda E");
        }

        // kata kunci yield switch jika di tulis secara manual kita harus menambah kan variabel untuk menyimpan data stringnya
        // hanya bisa di java 14 ke atas
    String ucapan;
        switch (nilai){
            case 90, 96 -> ucapan = ("Anda lulus dengan nilai A");
            case 80 -> ucapan = ("Anda lulus dengan nilai B");
            case 70 -> ucapan = ("Anda lulus dengan nilai C");
            case 60 -> ucapan = ("Anda lulus dengan nilai D");
            default -> ucapan = ("Anda tidak lulus, nilai Anda E");
        }
        System.out.println(ucapan);

        // dan ini menggunakan yield
        // hanya bisa di java 14 ke atas
        ucapan = switch (nilai) {
            case 90:
                yield "Anda lulus dengan nilai A";
            case 80:
                yield "Anda lulus dengan nilai B";
            case 70:
                yield "Anda lulus dengan nilai C";
            case 60:
                yield "Anda lulus dengan nilai d";
            default:
                yield "Anda tidak lulus, nilai Anda E";
        };
        System.out.println(ucapan);

    }
}
