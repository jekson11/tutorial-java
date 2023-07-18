public class OperasiBoolean {
    public static void main(String[] args) {

        var Absen = 70;
        var Tugas = 75;
// && (tanda dan jika sala satu bernilai false maka nilainya akan false
        boolean LulusAbsen = Absen <= 70;
        boolean LulusTugas = Tugas <= 70;
        var Lulus = LulusAbsen && LulusTugas; //ini bernilai false karena nilai lulustugasnya bernilai false atau nilai lulustugasnya lebih kecil daripada nilai tugas

        System.out.println(Lulus);
        System.out.println(""); //untuk enter supaya ada jarak



        // operator logika --> OR, AND, XOR, Negasi
       boolean a, b, c;

       // OR atau (||)
        System.out.println("---OR + (||)---");
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c );
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c );
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c );
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c );
        System.out.println("");

        // AND atau (&&)
        System.out.println("---AND * (&&)---");
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c );
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c );
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c );
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c );
        System.out.println("");

        // XOR atau (^)
        System.out.println("---XOR (^)---");
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c );
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " ^ " + b + " = " + c );
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " ^ " + b + " = " + c );
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " ^ " + b + " = " + c );
        System.out.println("");

        // NOT atau nagasi (!)
        System.out.println("---NEGASI atau kebalikan(!)---");
        a = true;
        c = !a;
        System.out.println(a + "(!) " + " = " + c);

    }

}
