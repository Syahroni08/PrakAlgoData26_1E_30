package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain30 {

    static Mahasiswa30 inputMahasiswa(Scanner Aroyy) {
        System.out.print("Masukkan NIM    : ");
        String nim = Aroyy.nextLine();
        System.out.print("Masukkan Nama   : ");
        String nama = Aroyy.nextLine();
        System.out.print("Masukkan Kelas  : ");
        String kelas = Aroyy.nextLine();
        System.out.print("Masukkan IPK    : ");
        double ipk = Aroyy.nextDouble();
        Aroyy.nextLine();
        return new Mahasiswa30(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);
        DoubleLinkedList30 list = new DoubleLinkedList30();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.println("Pilih Menu");
            pilihan = Aroyy.nextInt();
            Aroyy.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa30 mhsAwal = inputMahasiswa(Aroyy);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa30 mhsAkhir = inputMahasiswa(Aroyy);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNIM = Aroyy.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa30 dataBaru = inputMahasiswa(Aroyy);
                    list.insertAfter(keyNIM, dataBaru);
                    break;

                case 4:
                    list.removeFIrst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);
        Aroyy.close();
    }
}