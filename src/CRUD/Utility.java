package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {

        static void cekBukuDatabase (String[]keywords) throws IOException {
            FileReader fileInput = new FileReader("database.txt");
            BufferedReader bufferedInput = new BufferedReader(fileInput);

            String data = bufferedInput.readLine();//readLine membaca satu baris
            boolean isExist;
            int nomorData = 0;

            System.out.println("\n| No | tahun | penulis              | penerbit              | judul buku");
            System.out.println("-------------------------------------------------------------------------------------------------------");

            while (data != null) {
                //cek kywords di dalam baris
                isExist = true;

                for (String keyword : keywords) {
                    isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());//ngecek apakah keyword yang sudah di lowercase ada di dalam data yang sudah di lowercase
                }                                                                           //di cek setiap satu kata dan jika ada dua kata, kata pertama akan di cek setelah selesai
                //maka akan ter simpan si isExist setelah itu di cek kata kedua jika sudah maka adan di kali
                //menampilkan keywords yang cocok/yang di cari                              //dengan katapertama menggunakan && setelah hasil kekuar maka isExsit adalah nilai dari perkalian tersebut
                if (isExist) {

                    StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
                    nomorData++;

                    stringTokenizer.nextToken();
                    System.out.printf("| %-2d ", nomorData);
                    System.out.printf("| %-5s ", stringTokenizer.nextToken());
                    System.out.printf("| %-20s\t", stringTokenizer.nextToken());
                    System.out.printf("| %-20s\t", stringTokenizer.nextToken());
                    System.out.printf("| %-20s\t", stringTokenizer.nextToken());
                    System.out.print("\n");
                }

                data = bufferedInput.readLine();
            }

            System.out.println("-------------------------------------------------------------------------------------------------------");
        }

        static String ambilTahun () throws IOException {
            Scanner consolInput = new Scanner(System.in);
            String tahunInput;
            //ngecek tahun valid atau tidak
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");//untuk melakukan berapa jumlah digid tahun
            System.out.print("masukkan tahun terbit, format=(YYYY): ");                      //yang ingin di masukkan jika "y" nya ada 4
            tahunInput = consolInput.nextLine();                                           //jumlah tahun yang di masukkan harus ribuan
            //melalukan perulangan jika tahun yang di masukkan tidak valid            //tidak boleh lebuh atau kurang
            boolean tahunValid = false;
            while (!tahunValid) {
                try {
                    Year year = Year.parse(tahunInput, dateTimeFormatter);//pengecekan tahunnya valid atau tidak
                    tahunValid = true;
                } catch (Exception ex) {
                    System.out.println("\ntahun tidak valid, tahun yang diharapkan (YYYY)\n");
                    System.out.print("Masukkan kembali tahun terbit (YYYY): ");
                    tahunInput = consolInput.nextLine();
                }
            }
            return tahunInput;
        }

        protected static long ambilEntryPertahun (String penulis, String tahun) throws IOException {
            FileReader fileInput = new FileReader("database.txt");
            BufferedReader bufferedInput = new BufferedReader(fileInput);

            long entry = 0;
            String data = bufferedInput.readLine();
            Scanner dataScanner;
            String primarykey;
            while (data != null) {
                dataScanner = new Scanner(data);
                dataScanner.useDelimiter(",");
                primarykey = dataScanner.next();
                dataScanner = new Scanner(primarykey);
                dataScanner.useDelimiter("_");
                penulis = penulis.replaceAll("\\s+", "");

                if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                    entry = dataScanner.nextInt();
                }

                data = bufferedInput.readLine();
            }

            return entry;
        }

        public static boolean getYesOrNo (String messege){
            Scanner consolInput = new Scanner(System.in);
            System.out.print("\n" + messege + " (y/n) = ");
            String pilihUser = consolInput.next();
            //operasi jalan jika yang di input y atau n lain dari itu operasi tidak jalan
            while (!pilihUser.equalsIgnoreCase("y") && !pilihUser.equalsIgnoreCase("n")) {
                System.err.println("Anda tidak memilih y atau n \n");
                System.out.print("\n" + messege + "(y/n) = ");
                pilihUser = consolInput.next();
            }
            //equalsIgnoreCase("y"); ini bertipe booean atau true and false
            return pilihUser.equalsIgnoreCase("y");
        }

        public static void clearScreen () {
            try {
                if (System.getProperty("os.name").contains("Windows")) {//menyambukan ke cmd windows
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033\143");//menyambungkan ke cmd yang lain dari windows
                }
            } catch (final Exception ex) {
                System.err.println("Tidak bisa clear screen");
            }
        }

}
