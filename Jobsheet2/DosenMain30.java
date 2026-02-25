package Jobsheet2;

public class DosenMain30 {
    public static void main(String[] args) { 
        
        Dosen30 dosen1 = new Dosen30();
        dosen1.idDosen        = "A4N6";
        dosen1.nama           = "Anang Hermawan";
        dosen1.statusAktif    = true;
        dosen1.tahunBergabung = 2007;
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";

        System.out.println("Data Dosen 1");
        dosen1.tampilInformasi();

        System.out.println("\nMengubah Status");
        dosen1.setting(false);

        System.out.println("\nMenghitung Masa Kerja");
        dosen1.lamakerja(2026);

        System.out.println("\nMengubah Bidang Keahlian");
        dosen1.ubahKeahlian("Basis Data");

        System.out.println("\nData Dosen 1 Setelah Diubah");
        dosen1.tampilInformasi();

        Dosen30 dosen2 = new Dosen30("H4N8", "Herman Nanang", true, 2012, "Olahraga");

        System.out.println("\nData Dosen 2");
        dosen2.tampilInformasi();

        System.out.println("\nMengubah Status");
        dosen2.setting(false);

        System.out.println("\nMenghitung Masa Kerja");
        dosen2.lamakerja(2026);

        System.out.println("\nMengubah Bidang Keahlian");
        dosen2.ubahKeahlian("Yoga/Senam");

        System.out.println("\nData Dosen 2 Setelah Diubah");
        dosen2.tampilInformasi();
    }
}