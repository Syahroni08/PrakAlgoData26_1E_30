package CM2;

public class Pesanan30 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;
    Pesanan30 prev, next;

    Pesanan30(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
        this.prev = null;
        this.next = null;
    }
}