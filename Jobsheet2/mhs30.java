package Jobsheet2;

public class mhs30 {
    public static void main(String[] args) {
        
        Mahasiswa30 mhs30 = new Mahasiswa30(
            "Syahroni Nur'an Syafi'i",
            "234107020234",
            3.75,
            "SI-2J"
        );
        mhs30.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs30.nilaiKinerja());
    }
}
