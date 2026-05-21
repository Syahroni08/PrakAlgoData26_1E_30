package CM2;

public class Antrian30 {
    Pembeli30 head, tail;
    int jumlah;
    int counterAntrian;

    Antrian30() {
        head = null;
        tail = null;
        jumlah = 0;
        counterAntrian = 0;
    }

    void tambahAntrian(String namaPembeli, String noHp) {
        counterAntrian++;
        Pembeli30 baru = new Pembeli30(counterAntrian, namaPembeli, noHp);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
        jumlah++;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
    }

    void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.println("No Antrian\tNama\t\tNo HP");

        Pembeli30 p = head;
        while (p != null) {
            System.out.println(p.noAntiran + "\t\t" + p.namaPembeli + "\t\t" + p.noHp);
            p = p.next;
        }
    }

    Pembeli30 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong");
            return null;
        }

        Pembeli30 dihapus = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        jumlah--;
        return dihapus;
    }

    boolean isEmpty() {
        return head == null;
    }
}
