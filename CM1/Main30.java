package CM1;

import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);

        Mahasiswa30[] mhs = {
                new Mahasiswa30("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa30("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa30("22003", "Citra", "Sistem Informasi Bisnis") };

        Buku30[] buku = {
                new Buku30("B001", "Algoritma", 2020),
                new Buku30("B002", "Basis Data", 2019),
                new Buku30("B003", "Pemrograman", 2021),
                new Buku30("B004", "Fisika", 2024) };

        Peminjaman30[] pinjam = {
                new Peminjaman30(mhs[0], buku[0], 7),
                new Peminjaman30(mhs[1], buku[1], 3),
                new Peminjaman30(mhs[2], buku[2], 10),
                new Peminjaman30(mhs[2], buku[3], 6),
                new Peminjaman30(mhs[0], buku[1], 4) };

        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = Aroyy.nextInt();

            switch (pilih) {
                case 1:
                    for (Mahasiswa30 m : mhs)
                        m.tampilMahasiswa();
                    break;

                case 2:
                    for (Buku30 b : buku)
                        b.tampilBuku();
                    break;

                case 3:
                    for (Peminjaman30 p : pinjam)
                        p.tampilPeminjaman();
                    break;

                case 4:
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman30 temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Setelah diurutkan: ");
                    for (Peminjaman30 p : pinjam)
                        p.tampilPeminjaman();
                    break;

                case 5:
                    System.out.println("Masukkan NIM: ");
                    Aroyy.nextLine();
                    String cari = Aroyy.nextLine();

                    boolean ketemu = false;

                    for (int i = 0; i < pinjam.length; i++) {
                        if (pinjam[i].mhs.nim.equals(cari)) {
                            pinjam[i].tampilPeminjaman();
                            ketemu = true;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
            }
        } while (pilih != 0);
    }
}