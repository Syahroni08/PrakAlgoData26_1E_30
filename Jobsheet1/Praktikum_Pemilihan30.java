package Jobsheet1;

import java.util.Scanner;

public class Praktikum_Pemilihan30 {

    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);

        double ntugas30, nkuis30, nUTS30, nUAS30, nakhir30; 
        String nhuruf30, keterangan30;

        System.out.println("Program Menghitung Nilai AKhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        ntugas30 = Aroyy.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nkuis30 = Aroyy.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nUTS30 = Aroyy.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nUAS30 = Aroyy.nextInt();
        System.out.println("======================");
        System.out.println("======================");

        if(ntugas30 < 0 || ntugas30 > 100 || nkuis30 < 0 || nkuis30 > 100 || nUTS30 < 0 || nUTS30 >100 || nUAS30 < 0 || nUAS30 >100 ) {   
             System.out.println("nilai tidak valid!!!");
        } else {
            System.out.println("Program Menghitung Nilai Akhir");
            System.out.println("======================");

            nakhir30 = (ntugas30 * 0.2) + ( nkuis30 * 0.3) + (nUTS30 * 0.3 ) + (nUAS30 * 0.4);

            if ( nakhir30 > 80){
                nhuruf30 = "A";
            }
                else if (nakhir30 > 73) {
                    nhuruf30 = "B+";
                } 
                else if ( nakhir30 > 65 ) {
                    nhuruf30 = "B";
                } 
                else if ( nakhir30 > 60) {
                    nhuruf30 = "C+";
                }
                else if ( nakhir30 > 50) {
                    nhuruf30 = "C";
                }
                else if (nakhir30 > 39) {
                    nhuruf30 = "D";
                }
                else { nhuruf30 = "E";

                }

                if(nakhir30 > 61 ) {
                    keterangan30 = "SELAMAT ANDALULUS";
                }
                else {
                    keterangan30 = "MOHON MAAF ANDA TIDAK LULUS";
                }

            System.out.println("Nilai Akhir: " + nakhir30);
            System.out.println("Nilai AKhir: " + nhuruf30);

            System.out.println("======================");
            System.out.println("======================");

            System.out.println(keterangan30);

        }
       
    }

}
