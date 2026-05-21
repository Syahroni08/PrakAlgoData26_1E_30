package CM2;

import java.util.Scanner;

public class RoyalDelish30 {
    static Antrian30 antrian = new Antrian30();
    static PesananDLL pesananList = new PesananDLL();
    static Scanner Aroyy = new Scanner(System.in);

    public static void main(String[] args) {
        antrian.tambahAntrian("Ainra", "08224500000");
        antrian.tambahAntrian("Danra", "08224511111");
        antrian.tambahAntrian("Sanri", "08224522222");

        int pilihan;
        do{
            tampilMenu();
            System.out.println("Pilih menu : ");
            pilihan = Aroyy.nextInt();
            Aroyy.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    menuTambahAntrian();
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    menuHapusAntrian();
                    break;
                case 4:
                    pesananList.laporanPesanan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Antrian Royal Delish.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
        } while (pilihan != 0);
        }

        static void tampilMenu() {
        System.out.println("==============================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("==============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
    }

    static void menuTambahAntrian() {
        System.out.print("Nama Pembeli : ");
        String nama = Aroyy.nextLine();
        System.out.print("No HP        : ");
        String noHp = Aroyy.nextLine();
        antrian.tambahAntrian(nama, noHp);
    }

    static void menuHapusAntrian() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong, tidak ada pembeli.");
            return;
        }

        Pembeli30 pertama = antrian.head;
        System.out.println("Pembeli berikutnya: " + pertama.namaPembeli + " (No. Antrian: " + pertama.noAntiran + ")");
        System.out.println("Silakan input pesanan:");
 
        System.out.print("Kode Pesanan  : ");
        int kode = Aroyy.nextInt();
        Aroyy.nextLine();
        System.out.print("Nama Pesanan  : ");
        String namaPesanan = Aroyy.nextLine();
        System.out.print("Harga         : ");
        int harga = Aroyy.nextInt();
        Aroyy.nextLine();
 
        Pembeli30 dihapus = antrian.hapusAntrian();
        pesananList.tambahPesanan(kode, namaPesanan, harga, dihapus.namaPembeli);
 
        System.out.println(dihapus.namaPembeli + " telah memesan " + namaPesanan);
    }
}