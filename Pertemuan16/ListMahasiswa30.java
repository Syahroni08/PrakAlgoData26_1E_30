package Pertemuan16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListMahasiswa30 {
    List<Mahasiswa30> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa30... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa30 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) return i;
        }
        return -1;
    }

    public int binarySearch(String nim) {
        List<String> nimList = new ArrayList<>();
        for (Mahasiswa30 m : mahasiswas) nimList.add(m.nim);
        Collections.sort(nimList);
        int idx = Collections.binarySearch(nimList, nim);
        if (idx < 0) return -1;
        return linearSearch(nim);
    }

     public void sortAscending() {
        mahasiswas.sort(Comparator.comparing(m -> m.nama));
    }

    public void sortDescending() {
        mahasiswas.sort((a, b) -> b.nama.compareTo(a.nama));
    }

    public static void main(String[] args) {
        ListMahasiswa30 lm = new ListMahasiswa30();
        Mahasiswa30 m  = new Mahasiswa30("201234", "Noureen",  "021xx1");
        Mahasiswa30 m1 = new Mahasiswa30("201235", "Akhleema", "021xx2");
        Mahasiswa30 m2 = new Mahasiswa30("201236", "Shannum",  "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();

        lm.update(lm.linearSearch("201235"),
                  new Mahasiswa30("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

    }
}
