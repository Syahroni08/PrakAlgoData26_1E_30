package Praktikum5;

import java.util.Scanner;

public class DosenMain30 {
    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);

        DataDosen30 list = new DataDosen30();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DESC (Tertua → Termuda)");
            System.out.println("5. Exit");
            System.out.print("Pilih: ");
            pilih = Aroyy.nextInt();
            Aroyy.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode  : ");
                    String kode = Aroyy.nextLine();
                    System.out.print("Nama  : ");
                    String nama = Aroyy.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = Aroyy.nextBoolean();
                    System.out.print("Usia  : ");
                    int usia = Aroyy.nextInt();
                    Aroyy.nextLine();

                    Dosen30 d = new Dosen30(kode, nama, jk, usia);
                    list.tambah(d);
                    break;
                
                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data diurutkan ASC!!");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data diurutkan DESC!!");
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih !=5);
    }
}
