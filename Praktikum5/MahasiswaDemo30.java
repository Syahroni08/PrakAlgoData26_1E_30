package Praktikum5;

import java.util.Scanner;

public class MahasiswaDemo30 {
    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);
        MahasiswaBerprestasi30 list = new MahasiswaBerprestasi30();
        int jumMhs = 5; 

        for (int i = 0; i < jumMhs; i++) {
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

        list.tampil();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = Aroyy.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSeacrh(cari, pss);
    }
}