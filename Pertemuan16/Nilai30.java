package Pertemuan16;

public class Nilai30 {
    private Mahasiswa30 mahasiswa;
    private MataKuliah30 mataKuliah;
    private double nilai;

    public Nilai30(Mahasiswa30 mahasiswa, MataKuliah30 mataKuliah, double nilai) {
        this.mahasiswa  = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai      = nilai;
    }

    public Mahasiswa30 getMahasiswa() { return mahasiswa; }
    public MataKuliah30 getMataKuliah() { return mataKuliah; }
    public double getNilai() { return nilai; }

    @Override
    public String toString() {
        return String.format("%-8s %-15s %-40s %-5d %.2f",
                mahasiswa.getNim(), mahasiswa.getNama(),
                mataKuliah.getNama(), mataKuliah.getSks(), nilai);
    }
}
