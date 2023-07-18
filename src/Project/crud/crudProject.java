package Project.crud;

//import java library
import java.io.*;
import java.util.*;

//import CRUD library
import CRUD.Operasi;
import CRUD.Utility;

public class crudProject {

    public static void main(String[] args) throws IOException {

        System.out.print("\n");
        Scanner consolInput = new Scanner(System.in);
        String pilihUser;
        boolean isLnajunkan = true;

        while (isLnajunkan) {
            Utility.clearScreen();
            System.out.println("Data base perpustakanan");
            System.out.println("=======================");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");
            System.out.println("=======================");

            System.out.print("\nSilahkan pilih antara [1-5] = ");
            pilihUser = consolInput.next();

            switch (pilihUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    Operasi.listSeluruhBuku();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    Operasi.cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    Operasi.tambahData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    Operasi.updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    Operasi.deleteData();
                    break;
                default:
                    System.out.println("Input anda tidak di temukan silahkan pilih [1-5]");
            }

            isLnajunkan = CRUD.Utility.getYesOrNo("\n\nApakah anda ingin lanjutkan");
        }
    }
}
