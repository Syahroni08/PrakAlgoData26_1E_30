package Jobsheet2;

public class Tugas1 {
    String idDosen, nama, bidangKeahlian, st;
    boolean statusAktif;
    int tahunBergabung, lama;

    public Tugas1() {
    }

    public Tugas1(String idDoseng, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian ) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian; 
    }

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.print("Status : ");
        if (statusAktif) {
            System.out.println("Aktif");
        } else {
            System.out.println("Nonaktif");
        }
        System.out.println("Tahun Masuk : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setting(boolean status) {
        statusAktif = status;
        if (statusAktif) {
            System.out.println("Status menjadi Aktif");
        } else {
            System.out.println("Status menjadi Nonaktif");
        }
    }

    void lamakerja(int tahunSkrng) {
        lama = tahunSkrng - tahunBergabung;
        System.out.println("Telah bekerja selama " + lama + " tahun");
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi : " + bidang);
    }
}
    