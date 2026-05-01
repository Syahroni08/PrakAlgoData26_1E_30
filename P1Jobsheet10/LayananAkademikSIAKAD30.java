package P1Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD30 {
    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);
        AntriLayanan30 antrian = new AntriLayanan30(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Aroyy.nextInt();
            Aroyy.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = Aroyy.nextLine();
                    System.out.print("Nama : ");
                    String nama = Aroyy.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = Aroyy.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = Aroyy.nextLine();
                    Mahasiswa30 mhs = new Mahasiswa30(nim, nama, prodi, kelas);
                    antrian.tambahAntrian30(mhs);
                    break;

                case 2:
                    Mahasiswa30 dilayani = antrian.layaniMahasiswa30();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampikanlData();
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 0:
                    System.out.println("Terima Kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. ");
            }
        } while (pilihan != 0);
        Aroyy.close();
    }
}