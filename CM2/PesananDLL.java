package CM2;

public class PesananDLL {
    Pesanan30 head, tail;
    int jumlah;

    PesananDLL() {
        head = null;
        tail = null;
        jumlah = 0;
    }

    void tambahPesanan(int kodePesanan, String namaPesanan, int harga, String namaPembeli){
        Pesanan30 baru = new Pesanan30(kodePesanan, namaPesanan, harga, namaPembeli);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
        jumlah++;
    }

    void sortByNamaPesanan() {
        if (head == null || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            Pesanan30 p = head;
            while (p.next != null) {
                if (p.namaPesanan.compareToIgnoreCase(p.next.namaPesanan) > 0) {
                    int tmpKode = p.kodePesanan;
                    String tmpNama = p.namaPesanan;
                    int tmpharga = p.harga;
                    String tmpPembeli = p.namaPembeli;

                    p.kodePesanan = p.next.kodePesanan;
                    p.namaPesanan = p.next.namaPesanan;
                    p.harga = p.next.harga;
                    p.namaPembeli = p.next.namaPembeli;

                    p.next.kodePesanan = tmpKode;
                    p.next.namaPesanan = tmpNama;
                    p.next.harga = tmpharga;
                    p.next.namaPembeli =  tmpPembeli;

                    swapped = true;
                }
                p = p.next;
            }
        } while (swapped);
    }

    void laporanPesanan() {
        if (head == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }
        sortByNamaPesanan();
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.println("Kode Pesanan\tNama Pesanan\t\tHarga");
        int total = 0;
        Pesanan30 p = head;
        while(p != null) {
            System.out.println(p.kodePesanan + "\t\t" + p.namaPesanan + "\t\t" + p.harga);
            total += p.harga;
            p = p.next;
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Pendapatan: " + total);
        System.out.println("======================================");
    }

    boolean isEmpty() {
        return head == null;
    }
}
