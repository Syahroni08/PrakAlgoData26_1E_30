package minggu5;

import java.util.Scanner;

public class DaftarNilaiMHS {
    public static class Nilai {
        int uts[];
        int uas[];

        Nilai(int el) {
            uts = new int[el];
            uas = new int[el];
        }

        int maxUTS(int arr[], int l, int r) {
            if (l == r) {
                return arr[l];
            }
            int mid = (l + r) / 2;
            int kiri = maxUTS(arr, l, mid);
            int kanan = maxUTS(arr, mid + 1, r);

            if (kiri > kanan) {
                return kiri;
            } else {
                return kanan;
            }
        }

        int minUTS(int arr[], int l, int r) {
            if (l == r) {
                return arr[l];
            }

            int mid = (l + r) / 2;

            int kiri = minUTS(arr, l, mid);
            int kanan = minUTS(arr, mid + 1, r);

            if (kiri < kanan) {
                return kiri;
            } else {
                return kanan;
            }
        }

        double rataUAS() {
            double total = 0;

            for (int i = 0; i < uas.length; i++) {
                total = total + uas[i];
            }

            return total / uas.length;
        }
    }

    public static class MainNilai {
        public static void main(String[] args) {

            Scanner Aroyy = new Scanner(System.in);

            System.out.print("Masukkan Jumlah Mahasiswa: ");
            int elemen = Aroyy.nextInt();

            Nilai n = new Nilai(elemen);

            for (int i = 0; i < elemen; i++) {
                System.out.print("Masukkan nilai UTS mahasiswa ke-" + (i + 1) + (": "));
                n.uts[i] = Aroyy.nextInt();

                System.out.print("Masukkan nilai UAS mahasiswa ke-" + (i + 1) + (": "));
                n.uas[i] = Aroyy.nextInt();
            }

            System.out.println("Nilai UTS tertinggi : " + n.maxUTS(n.uts, 0, elemen - 1));
            System.out.println("Nilai UTS terendah : " + n.minUTS(n.uts, 0, elemen - 1));
            System.out.println("Rata-rata nilai UAS : " + n.rataUAS());
        }
    }
}
