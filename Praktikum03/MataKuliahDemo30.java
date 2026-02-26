package Praktikum03;

import java.util.Scanner;

public class MataKuliahDemo30 {
    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);

        MataKuliah30[] arrayOfMatakuliah = new MataKuliah30[3];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode : ");
            kode = Aroyy.nextLine();
            System.out.print("Nama : ");
            nama = Aroyy.nextLine();
            System.out.print("Sks : ");
            dummy = Aroyy.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = Aroyy.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");
            arrayOfMatakuliah[i] = new MataKuliah30(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n=== DATA MATA KULIAH ===");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("--------------------------------------");
        }
    }
}