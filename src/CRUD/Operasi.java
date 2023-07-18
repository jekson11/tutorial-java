package CRUD;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operasi {

    public static void listSeluruhBuku() throws IOException {
        FileReader fileInput;
        BufferedReader bufferedInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferedInput = new BufferedReader(fileInput);
        }catch (Exception ex){
            System.err.println("Data base tidak di temukan, Silahkan tambahkan data terlebih dahulu");
            tambahData();
            return;
        }

        System.out.println("\n| No | tahun | penulis              | penerbit              | judul buku");
        System.out.println("-------------------------------------------------------------------------------------------------------");

        String data = bufferedInput.readLine();
        int nomorData = 0;
        while (data != null){//kalau data belum null makan operasi di mulai
            nomorData++;
            StringTokenizer stringTokenizer = new StringTokenizer(data,",");

            stringTokenizer.nextToken();
            System.out.printf("| %-2d ",nomorData);
            System.out.printf("| %-5s ",stringTokenizer.nextToken());
            System.out.printf("| %-20s\t",stringTokenizer.nextToken());
            System.out.printf("| %-20s\t",stringTokenizer.nextToken());
            System.out.printf("| %-20s\t",stringTokenizer.nextToken());
            System.out.print("\n");

            data = bufferedInput.readLine();//mengambil baris baru
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");

    }

    public static void cariData() throws IOException{

        //membaca database ada atau tidak
        try {
            File file = new File("database.txt");
        }catch (Exception ex){
            System.err.println("Data base tidak di temukan, Silahkan tambahkan data terlebih dahulu");
            tambahData();
            return;
        }

        //mengambil kywords dari user
        Scanner consolInput = new Scanner(System.in);
        System.out.print("masukkan nama buku yang ingin di cari: ");
        String cariBuku = consolInput.nextLine();//nextLine membaca per kata
        //cariBuku.split("\\s+"); mengubah data cariBuku menjadi array
        String[] keywords = cariBuku.split("\\s+");//memasukkan keywords dari user ke string array

        //cek kywords di database
        Utility.cekBukuDatabase(keywords);//memasukkan String[] keywords ke cekBukuDatabase yg di bawah

    }

    public static boolean tambahData() throws IOException {

        FileWriter fileOutput = new FileWriter("database.txt", true);//menggunakan true agar data basenya tidak terhapus
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);
        boolean isExist = false;

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        Scanner consolInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("masukkan nama penulis: ");
        penulis = consolInput.nextLine();
        System.out.print("masukkan judul buku: ");
        judul = consolInput.nextLine();
        System.out.print("masukkan penerbit buku: ");
        penerbit = consolInput.nextLine();
        //memanggail method ambil tahun
        tahun = Utility.ambilTahun();

        //pngecekan buku
        String[] keywords = {tahun + "," + penulis + "," + penerbit + "," + judul};

        System.out.println("\n" + Arrays.toString(keywords));

        String data = bufferedInput.readLine();//readLine membaca satu baris
        while (data != null) {
            //cek kywords di dalam baris
            isExist = true; //ini true karna jika false maka perkalian isExist akan fal terus

            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());//ngecek apakah keyword yang sudah di lowercase ada di dalam data yang sudah di lowercase
            }
            //menampilkan keywords yang cocok/yang di cari
            if (isExist) { //jika isExist true makan program jalan jika false maka tidak jalan

                StringTokenizer stringTokenizer = new StringTokenizer(data, ",");

                stringTokenizer.nextToken();
                stringTokenizer.nextToken();
                stringTokenizer.nextToken();
                stringTokenizer.nextToken();
                stringTokenizer.nextToken();
//                System.out.println(isExist);
                break;//langsung di break jika isExist sudah true karna kalau tidak program akan berjalan terus
            }         //jika program jalan terus mengikuti perulangan while maka isExist menjadi false

            data = bufferedInput.readLine();
        }

        long noEntry = Utility.ambilEntryPertahun(penulis, tahun) + 1;
        if (!isExist) {
            String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
            String primarykey = penulisTanpaSpasi + "_" + tahun + "_" + noEntry;
            System.out.println("\nData yang akan di tambahkan adalah");
            System.out.println("------------------------------------");
            System.out.println("Primarykey : " + primarykey);
            System.out.println("Tahun      : " + tahun);
            System.out.println("Penulis    : " + penulis);
            System.out.println("Judul      : " + judul);
            System.out.println("Penerbit   : " + penerbit);
            System.out.println("-------------------------------------");

            boolean isTambah = Utility.getYesOrNo("Apakah anda ingin menambah data tersebut?");
            if (isTambah) {
                bufferedOutput.write(primarykey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferedOutput.newLine();
                bufferedOutput.flush();
                //memanggil method listSeluruhBuku setelah buku di tambahkan
                System.out.println("\nData berhasil di tambahkan");
                listSeluruhBuku();
            }
        } else {
            System.out.println("Data yang ingin anda tambahkan sudah ada di dalam database dengan data berikut:");
            Utility.cekBukuDatabase(keywords);
        }

        bufferedInput.close();
        bufferedOutput.close();
        return isExist;
    }

    public static void updateData() throws IOException{
        //ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        //membuat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        //tampilkan data
        System.out.println("\nList seluruh buku");
        listSeluruhBuku();

        //ambil user input
        Scanner konsolInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang mau di update: ");
        int updateNum = konsolInput.nextInt();

        //tampilkan data yang ingin di update
        String data = bufferedInput.readLine();
        int entryCounts = 0;
        long noEntry = 0;
        boolean listUpdate = false;

        while (data != null){
            entryCounts++;

            StringTokenizer st = new StringTokenizer(data,",");

            if (updateNum == entryCounts) {

                //menampilkan data yang ingin di update
                System.out.println("\nData yang ingin anda update adalah:");
                System.out.println("------------------------------------");
                System.out.println("Referensi : " + st.nextToken());
                System.out.println("Tahun     : " + st.nextToken());
                System.out.println("Penulis   : " + st.nextToken());
                System.out.println("Penerbit  : " + st.nextToken());
                System.out.println("Judul     : " + st.nextToken());
                System.out.println("------------------------------------");

                //update data
                //mengambil input user
                String[] fieldData = {"tahun", "penulis", "penerbit", "judul"};
                String[] tempData = new String[4];

                //refres data
                st = new StringTokenizer(data, ",");
                String originalData = st.nextToken();

                for (int i = 0; i < fieldData.length; i++) {
                    boolean isUPdate = Utility.getYesOrNo("Apakah anda ingin mengubah " + fieldData[i]);

                    originalData = st.nextToken();
                    if (isUPdate) {
                        //use input
                        //mengisi tempData dengan user input
                        if (fieldData[i].equalsIgnoreCase("tahun") ){
                            tempData[i] = Utility.ambilTahun();
                            listUpdate = true;
                        }else {
                            konsolInput = new Scanner(System.in);
                            System.out.print("\nMasukkan " + fieldData[i] + "baru: ");
                            tempData[i] = konsolInput.nextLine();
                            listUpdate = true;
                        }

                    } else {
                        //jika false maka tempData akan di isi data original
                        tempData[i] = originalData;
                    }
                }

                //mengambil input NoEntry dari user
                if (listUpdate){
                    try {
                        System.out.print("\nMasukkan NoEntry semula: ");
                        noEntry = konsolInput.nextLong();
                    }catch (Exception ex){
                        System.err.println("Yang anda masukkan bukan NoEntry.");
                        konsolInput = new Scanner(System.in);
                        System.out.print("\nMasukkan kembali NoEntry semula: ");
                        noEntry = konsolInput.nextLong();
                    }
                }

                //jika yang mau di update tidak di update sama sekali maka
                //program yang di bawah di jalankan
                if (!listUpdate){
                    System.err.println("\nTidak ada Update yang terjadi");
                    while (data != null){
                        bufferedOutput.write(data);
                        bufferedOutput.newLine();
                        data = bufferedInput.readLine();
                    }
                    break;
                }

                //menampilkan data yang telah di update
                st = new StringTokenizer(data, ",");
                System.out.println("\nData setelah di update:");
                System.out.println("-------------------------------------------------------------");
                st.nextToken();
                System.out.println("Tahun     : " + st.nextToken() + " ---> " + tempData[0]);
                System.out.println("Penulis   : " + st.nextToken() + " ---> " + tempData[1]);
                System.out.println("Penerbit  : " + st.nextToken() + " ---> " + tempData[2]);
                System.out.println("Judul     : " + st.nextToken() + " ---> " + tempData[3]);
                System.out.println("-------------------------------------------------------------");

                boolean isUpdate = Utility.getYesOrNo("Apakah anda yakin ingin mengubah data? ");

                if (isUpdate) {
                    //formata data baru kedalam data base
                    String tahun = tempData[0];
                    String penulis = tempData[1];
                    String penerbit = tempData[2];
                    String judul = tempData[3];

                    //membuat primari key
                    String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
                    String primarykey = penulisTanpaSpasi + "_" + tahun + "_" + noEntry;

                    //menulis data ke dalam data base
                    bufferedOutput.write(primarykey+","+tahun+","+penulis+","+penerbit+","+judul);
                    listUpdate = true;

                } else {
                    bufferedOutput.write(data);
                }
            }else{
                bufferedOutput.write(data);
            }

            bufferedOutput.newLine();
            data = bufferedInput.readLine();
        }
        //menulis data
        bufferedOutput.flush();

        //menutup file
        //untuk menutup file harus di lagukan sesuai urutan agar delete dan rename bisa berjalan
        //ini pengurutan yang benar
        bufferedOutput.close();
        bufferedInput.close();
        fileInput.close();
        fileOutput.close();

        System.gc();//fungsi ini harus di gunakan dalam mendelete dan merename file di windows jika os tidak perlu

        //delete original file
        database.delete();
        //rename file sementara menjadi database
        tempDB.renameTo(database);

        if (listUpdate){
            //menampilkan list seluruh buku yang sudah di update
            System.out.println("\nBuku berhasil di Update");
            listSeluruhBuku();
        }
    }

    public static void deleteData() throws IOException{
        //ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        //membuat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        //tampilkan data
        System.out.println("\nList seluruh buku");
        listSeluruhBuku();

        //mengambil userInput untuk mendelete data
        Scanner consolInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang ingin di hapus: ");
        int deleteNum = consolInput.nextInt();

        //looping untuk membaca tiap data baris dan skip untuk data yang akan di delete
        String data = bufferedInput.readLine();
        boolean isFound = true;
        int entryCounts = 0;
        while (data != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer stringTokenizer = new StringTokenizer(data,",");

            //menampilkan data yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("------------------------------------");
                System.out.println("Referensi : " + stringTokenizer.nextToken());
                System.out.println("Tahun     : " + stringTokenizer.nextToken());
                System.out.println("Penulis   : " + stringTokenizer.nextToken());
                System.out.println("Penerbit  : " + stringTokenizer.nextToken());
                System.out.println("Judul     : " + stringTokenizer.nextToken());
                System.out.println("------------------------------------");
                isFound = false;//mengecek jika angka yang di masukkan tidak ada di dalam buku
                isDelete = Utility.getYesOrNo("Apakah anda yakin akan menghapus data tersebut");
            }

            if (isDelete){
                //skip pindah data dari original ke sementara
                System.out.println("\nData berhasil di hapus");
            }else {
//              pindah data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }

            data = bufferedInput.readLine();
        }
        //mengecek jika no buku yang di masukkan tidak ada makan if(isFound) akan di oprasi
        if (isFound){
            System.err.println("Buku tidak di temukan");
        }
        //menulis data original ke data sementara
        bufferedOutput.flush();

        //menutup file
        //untuk menutup file harus di lagukan sesuai urutan agar delete dan rename bisa berjalan
        //ini pengurutan yang benar
        bufferedOutput.close();
        bufferedInput.close();
        fileInput.close();
        fileOutput.close();

        System.gc();//fungsi ini harus di gunakan dalam mendelete dan merename file di windows jika os tidak perlu

        //delete original file
        database.delete();
        //rename file sementara menjadi database
        tempDB.renameTo(database);

        //menampilkan list seluruh buku setelah di hapus.
        listSeluruhBuku();
    }

}
