package Praktikum5;

import java.util.Scanner;

public class MahasiswaDemo30 {
    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);
        System.out.print("Masukka jumlah mahasiswa: ");
        int jumMhs = Aroyy.nextInt();
        Aroyy.nextLine();

        MahasiswaBerprestasi30 list = new MahasiswaBerprestasi30();
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

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

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");

        System.out.print("IPK: ");
        double cari = Aroyy.nextDouble();

        System.out.println("------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------------");

        double posisi2 = list.findBinarySearch(cari, 0, jumMhs);
        double posisi = list.sequentialSearching(cari);
        int pss2 = (int) posisi2;
        
        list.bubbleSort();
        list.tampil();
        list.tampilPosisi(cari, pss2);
        list.tampilDataSeacrh(cari, pss2);
    }
}