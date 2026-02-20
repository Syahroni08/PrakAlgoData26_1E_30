package Jobsheet2;

public class Mahasiswa30 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String KelasBaru) {
        kelas = KelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }
    
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }else if (ipk >= 3.0) {
            return "Kinerja cukup";
        }else  {
            return "Kinerja kurang"; }
    }
}
