package Pertemuan16;

public class MahasiswaTugas30 {
     private String nim;
    private String nama;
    private String telepon;

    public MahasiswaTugas30(String nim, String nama, String telepon) {
        this.nim     = nim;
        this.nama    = nama;
        this.telepon = telepon;
    }

    public String getNim()     { return nim; }
    public String getNama()    { return nama; }
    public String getTelepon() { return telepon; }
 
    @Override
    public String toString() {
        return String.format("%-8s %-15s %-10s", nim, nama, telepon);
    }
}
