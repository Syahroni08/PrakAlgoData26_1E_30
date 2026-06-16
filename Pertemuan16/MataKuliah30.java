package Pertemuan16;

public class MataKuliah30 {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah30(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks  = sks;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getSks()     { return sks; }

    @Override
    public String toString() {
        return String.format("%-8s %-40s %d", kode, nama, sks);
    }
}
