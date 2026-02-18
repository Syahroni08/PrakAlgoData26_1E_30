package Jobsheet1;
import java.util.Scanner;

public class Praktikum_Perulangan_30 {
    public static void main(String[] args) {
        Scanner Aroyy = new Scanner(System.in);
        String NIM30;

        System.out.print("Masukkan NIM: ");
        long nim = Aroyy.nextLong();

        long n = nim % 100;

        if (n < 10) {
            n += 10;
        }

        for (long i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print(" # ");
            }
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            else {
                System.out.print(" * ");
            }
        }
        Aroyy.close();
    }
}