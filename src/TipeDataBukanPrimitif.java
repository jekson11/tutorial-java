public class TipeDataBukanPrimitif {

    public static void main(String[] args) {
        //tipe data bukan primitif semua hufuf depannya huruf besar contoh terkecuali String karna String memang bukan tipe data primitif
        //byte = Byte
        //int = Integer dan seterusnya
        //tipe data yang bukan primitif nilai defaultnya = null
        //sedangkan tipe data yang primitif nilai defaultnya = 0

        Integer iniInteger = 130;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //mengkonversi dari yang primitif menjadi bukan primitif dengan tipe yang sama
        int iniInt = 200;
        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);


        //cara mengubah dari yang bukan primitf menjadi primitif tapi dengan tipe yang berbeda tinggal kita panggil methodnya
        //dengan menulis .nama variable tersebut seperti yang di bawah
        int iniInt3 = 47;

        Integer iniObject = iniInt3;

        short iniShort = iniObject.shortValue();
        //long iniLong2 = iniObject.longValue();
        //float iniFloat = iniObject.floatValue();

        System.out.println(iniShort);




    }
}
