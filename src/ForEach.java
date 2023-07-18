public class ForEach {
    public static void main(String[] args) {
        // contoh perulangan for biasa jika kita ingin mengambil seluruh data yanga ada di array
        String[] names = {
                "udin", "asep", "jamal",
                "juan", "dika", "agus"
        };

        for (var a = 0; a < names.length; a++){
            System.out.println(names[a]);
        }

        System.out.println("ForEach");
        //array dengan for each
        //ini menggunakan for each kita menyimpat seruh data pada array di var name
        for (var name : names){
            System.out.println(name);
        }
    }
}
