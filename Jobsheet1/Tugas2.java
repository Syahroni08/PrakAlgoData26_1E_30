package Jobsheet1;
import java.util.Scanner;

public class Tugas2 {

    public static void vito12jadwal12(String[][] jadwal30, int n, Scanner Aroyy) {

        for (int i = 0; i < n; i++) {
            System.out.println("\njadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal30[i][0] = Aroyy.nextLine();

            System.out.print("Ruang            : ");
            jadwal30[i][1] = Aroyy.nextLine();

            System.out.print("Hari             : ");
            jadwal30[i][2] = Aroyy.nextLine();

            System.out.print("Jam              : ");
            jadwal30[i][3] = Aroyy.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal30, int n) {

        System.out.println("\n=== Semua jadwal Kuliah ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n","Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("=============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal30[i][0],
                    jadwal30[i][1],
                    jadwal30[i][2],
                    jadwal30[i][3]);
        }
    }

    public static void tampilByHari(String[][] jadwal30, int n, String hariCari30) {

        System.out.println("\njadwal pada hari " + hariCari30 + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal30[i][2].equalsIgnoreCase(hariCari30)) {
                System.out.println(jadwal30[i][0] + " | " +
                                   jadwal30[i][1] + " | " +
                                   jadwal30[i][3]);
            }
        }
    }

    public static void tampilByMK(String[][] jadwal30, int n, String mkCari30) {

        System.out.println("\njadwal untuk Mata Kuliah " + mkCari30 + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal30[i][0].equalsIgnoreCase(mkCari30)) {
                System.out.println("Ruang : " + jadwal30[i][1]);
                System.out.println("Hari  : " + jadwal30[i][2]);
                System.out.println("Jam   : " + jadwal30[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner Aroyy = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        
        int n = Integer.parseInt(Aroyy.nextLine());
        String[][] jadwal30 = new String[n][4];

        vito12jadwal12(jadwal30, n, Aroyy);
        tampilSemua(jadwal30, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = Aroyy.nextLine();
        tampilByHari(jadwal30, n, hari);

        System.out.print("\nCari jadwal berdasarkan nama MK: ");
        String mk = Aroyy.nextLine();
        tampilByMK(jadwal30, n, mk);

        Aroyy.close();
    }
}