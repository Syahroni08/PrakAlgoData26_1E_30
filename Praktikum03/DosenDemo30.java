package Praktikum03;

import java.util.Scanner;

public class DosenDemo30 {
     public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(Aroyy.nextLine());

        Dosen30[] arrayOfDosen = new Dosen30[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode : ");
            String kode = Aroyy.nextLine();

            System.out.print("Nama : ");
            String nama = Aroyy.nextLine();

            System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan) : ");
            Boolean jenisKelamin = Boolean.parseBoolean(Aroyy.nextLine());

            System.out.print("Usia : ");
            int usia = Integer.parseInt(Aroyy.nextLine());

            arrayOfDosen[i] = new Dosen30(kode, nama, jenisKelamin, usia);
        }
        System.out.println("=========================");

        for (Dosen30 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }
}
