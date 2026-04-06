package Praktikum5;

public class Dosen30 {

    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen30(String kd, String name, boolean jK, int us){
        kode = kd;
        nama = name;
        jenisKelamin = jK;
        usia = us;
    }

    void tampil(){
          System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia  : " + usia);
        System.out.println("----------------------");
    }
}
