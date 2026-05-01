package P1Jobsheet10;

public class Mahasiswa30 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa30(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampikanlData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
