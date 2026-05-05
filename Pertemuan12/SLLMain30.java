package Pertemuan12;

import java.util.Scanner;

public class SLLMain30 {
    public static void main(String[] args) {
        SingleLinkedList30 sll = new SingleLinkedList30();

        Mahasiswa30 mhs1 = new Mahasiswa30("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa30 mhs2 = new Mahasiswa30("22212202", "Cintia", "3C", 3.5);
        Mahasiswa30 mhs3 = new Mahasiswa30("23212201", "Bimon",  "2B", 3.8);
        Mahasiswa30 mhs4 = new Mahasiswa30("21212203", "Dirga",  "4D", 3.6);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}