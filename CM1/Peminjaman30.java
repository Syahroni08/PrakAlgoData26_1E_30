package CM1;

public class Peminjaman30 {
    Mahasiswa30 mhs;
    Buku30 buku;
    int lamaPinjam, terlambat, denda;

    int batasPinjam = 5;
    int dendaPerHari = 2000;

    Peminjaman30(Mahasiswa30 mhs, Buku30 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * dendaPerHari;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman(){
        System.out.println(mhs.nama + " | " + buku.judul +" | Lama: " + lamaPinjam +
                " | Terlambat: " + terlambat +
                " | Denda: " + denda);
    }
}