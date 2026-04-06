package Praktikum5;

import java.util.Scanner;

public class MahasiswaDemo30 {
    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);
        MahasiswaBerprestasi30 list = new MahasiswaBerprestasi30();

        System.out.print("Masukan jumlah mahasiswa: ");
        int no = Aroyy.nextInt();
        Aroyy.nextLine();

        for (int i = 0; i < no; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            
            System.out.print("NIM   : ");
            String nim = Aroyy.nextLine();

            System.out.print("Nama  : ");
            String nama = Aroyy.nextLine();

            System.out.print("Kelas : ");
            String kelas = Aroyy.nextLine();

            System.out.print("IPK   : ");
            double ipk = Aroyy.nextDouble();
            Aroyy.nextLine();

            Mahasiswa30 m = new Mahasiswa30(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("\nData setelah sorting (DESC):");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELETION SORT (ASC)");
        list.selestionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}