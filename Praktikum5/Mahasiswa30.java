package Praktikum5;

public class Mahasiswa30 {
    String nim;
    String nama;
    String kelas;
    String ipk;

    Mahasiswa30(String nm, String name, String kls, String ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println(" IPK: " + ipk);
    }
}
