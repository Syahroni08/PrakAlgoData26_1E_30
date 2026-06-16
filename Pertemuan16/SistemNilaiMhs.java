package Pertemuan16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class MahasiswaTugas {
    String nim, nama, telf;
    public MahasiswaTugas(String nim, String nama, String telf) {
        this.nim = nim; this.nama = nama; this.telf = telf;
    }
}

class MataKuliah {
    String kode, namaMK;
    int sks;
    public MataKuliah(String kode, String namaMK, int sks) {
        this.kode = kode; this.namaMK = namaMK; this.sks = sks;
    }
}

class Nilai {
    MahasiswaTugas mhs;
    MataKuliah mk;
    double nilaiAngka;
    public Nilai(MahasiswaTugas mhs, MataKuliah mk, double nilaiAngka) {
        this.mhs = mhs; this.mk = mk; this.nilaiAngka = nilaiAngka;
    }
}

public class SistemNilaiMhs {
    private static List<MahasiswaTugas> listMhs = new ArrayList<>();
    private static List<MataKuliah> listMK = new ArrayList<>();
    private static List<Nilai> listNilai = new ArrayList<>();
    private static Queue<MahasiswaTugas> antreanHapus = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        listMhs.add(new MahasiswaTugas("20001", "Thalhah", "021xxx"));
        listMhs.add(new MahasiswaTugas("20002", "Zubair", "021xxx"));
        listMhs.add(new MahasiswaTugas("20003", "Abdur-Rahman", "021xxx"));
        
        listMK.add(new MataKuliah("00001", "Internet of Things", 3));
        listMK.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        listMK.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));

        int menu;
         
        do {
            System.out.println("=================================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("=================================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai (Descending)");
            System.out.println("5. Daftarkan Mahasiswa ke Antrean Hapus");
            System.out.println("6. Eksekusi Hapus Mahasiswa Terdepan (Queue)");
            System.out.println("7. Keluar");
            System.out.print("Pilih : ");
            menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode/Urutan: ");
                    String urut = sc.nextLine();
                    System.out.print("Nilai               : ");
                    double nAngka = sc.nextDouble(); sc.nextLine();

                    System.out.println("\nDAFTAR MAHASISWA");
                    for (MahasiswaTugas m : listMhs) {
                        System.out.println(m.nim + "\t" + m.nama);
                    }
                    System.out.print("Pilih mahasiswa by nim: ");
                    String pilihNim = sc.nextLine();

                    System.out.println("\nDAFTAR MATA KULIAH");
                    for (MataKuliah mk : listMK) {
                        System.out.println(mk.kode + "\t" + mk.namaMK);
                    }
                    System.out.print("Pilih MK by kode: ");
                    String pilihKode = sc.nextLine();

                    MahasiswaTugas mSelected = null;
                    for (MahasiswaTugas m : listMhs) {
                        if(m.nim.equals(pilihNim)) mSelected = m;
                    }
                    MataKuliah mkSelected = null;
                    for (MataKuliah mk : listMK) {
                        if(mk.kode.equals(pilihKode)) mkSelected = mk;
                    }

                    if (mSelected != null && mkSelected != null) {
                        listNilai.add(new Nilai(mSelected, mkSelected, nAngka));
                        System.out.println("Input nilai sukses.");
                    } else {
                        System.out.println("Gagal! Data NIM/Kode MK salah.");
                    }
                    break;

                case 2:
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.printf("%-10s %-15s %-30s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (Nilai n : listNilai) {
                        System.out.printf("%-10s %-15s %-30s %-5d %-6.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMK, n.mk.sks, n.nilaiAngka);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan data mahasiswa [nim]: ");
                    String sNim = sc.nextLine();
                    System.out.printf("%-10s %-15s %-30s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    int totalSks = 0;
                    for (Nilai n : listNilai) {
                        if (n.mhs.nim.equals(sNim)) {
                            System.out.printf("%-10s %-15s %-30s %-5d %-6.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMK, n.mk.sks, n.nilaiAngka);
                            totalSks += n.mk.sks;
                        }
                    }
                    System.out.println("Total SKS " + totalSks + " telah diambil.");
                    break;

                case 4:
                    listNilai.sort((n1, n2) -> Double.compare(n2.nilaiAngka, n1.nilaiAngka));
                    System.out.println("\nDAFTAR NILAI TERURUT (DESCENDING)");
                    System.out.printf("%-10s %-15s %-30s %-6s %-5s\n", "Nim", "Nama", "Mata Kuliah", "Nilai", "SKS");
                    for (Nilai n : listNilai) {
                        System.out.printf("%-10s %-15s %-30s %-6.2f %-5d\n", n.mhs.nim, n.mhs.nama, n.mk.namaMK, n.nilaiAngka, n.mk.sks);
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dimasukkan antrean hapus: ");
                    String delNim = sc.nextLine();
                    MahasiswaTugas mDel = null;
                    for (MahasiswaTugas m : listMhs) {
                        if (m.nim.equals(delNim)) mDel = m;
                    }
                    if (mDel != null) {
                        antreanHapus.add(mDel);
                        System.out.println("Mahasiswa " + mDel.nama + " masuk antrean hapus.");
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 6:
                    if (!antreanHapus.isEmpty()) {
                        MahasiswaTugas target = antreanHapus.poll(); // Menghapus secara FIFO
                        listMhs.remove(target);
                        listNilai.removeIf(n -> n.mhs.nim.equals(target.nim));
                        System.out.println("Mahasiswa " + target.nama + " sukses dihapus.");
                    } else {
                        System.out.println("Antrean kosong.");
                    }
                    break;
            }
        } while (menu != 7);
    }
}