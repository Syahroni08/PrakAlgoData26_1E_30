package minggu5;

import java.util.Scanner;

public class BruteForceDivideConquer {
    public static class Faktorial {
        int faktorialBF(int n) {
            int fakto = 1;
            for (int i = 1; i <= n; i++) {
                fakto = fakto * i;
            }
            return fakto;
        }

        int faktorialDC(int n) {
            if (n == 1) {
                return 1;
            } else {
                int fakto = n * faktorialDC(n - 1);
                return fakto;
            }
        }

        public static void main(String[] args) {
            Scanner Aroyy = new Scanner(System.in);
            System.out.print("Masukkan nilai: ");
            int nilai = Aroyy.nextInt();

            Faktorial fk = new Faktorial();
            System.out.println("Nilai faktorial " + nilai + "menggunakan BF: " + fk.faktorialBF(nilai));
            System.out.println("Nilai faktorial " + nilai + "menggunakan CD: " + fk.faktorialDC(nilai));
        }
    }

    public static class Pangkat {
        int nilai, pangkat;

        Pangkat(int n, int p) {
            nilai = n;
            pangkat = p;
        }

        int pangkatBF(int a, int n) {
            int hasil = 1;
            for (int i = 0; i < n; i++) {
                hasil = hasil * a;
            }
            return hasil;
        }

        int pangkatDC(int a, int n) {
            if (n == 1) {
                return a;
            } else {
                if (n % 2 == 1) {
                    return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
                } else {
                    return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
                }
            }
        }
    }

    public static class MainPangkat {
        public static void main(String[] args) {
            Scanner Aroyy = new Scanner(System.in);
            System.out.print("Masukkan jumlah elemen: ");
            int elemen = Aroyy.nextInt();

            Pangkat[] png = new Pangkat[elemen];
            for (int i = 0; i < elemen; i++) {
                System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
                int basis = Aroyy.nextInt();
                System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
                int pangkat = Aroyy.nextInt();
                png[i] = new Pangkat(basis, pangkat);
            }
            System.out.println("HASIL PANGKAT BRUTEFORCE: ");
            for(Pangkat p : png) {
                System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
            }
            System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
            for(Pangkat p : png) {
                System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
            }
        }
    }
    public static class Sum{
        double keuntungan[];

        Sum(int el) {
            keuntungan = new double[el];
        }
        double totalBF() {
            double total = 0;
            for (int i = 0; i < keuntungan.length; i++) {
                total = total+keuntungan[i];
            }
            return total;
        }
        double totalDC(double arr[], int l, int r) {
            if (l==r) {
                return arr[l];
            }

            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid+1, r);
            return lsum+rsum;
        }
        public static class MainSum{
            public static void main(String[] args) {
                Scanner Aroyy = new Scanner(System.in);
                System.out.print("Masukkan jumlah elemen: ");
                int elemen = Aroyy.nextInt();

                Sum sm = new Sum(elemen);

                for (int i = 0; i < elemen; i++) {
                    System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
                    sm.keuntungan[i] = Aroyy.nextDouble();
                }
                System.out.println("Total keuntungan menggunakan BruteForce: " + sm.totalBF());
                System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
            }
        }
    }
}
