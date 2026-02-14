package P1;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner caesar06 = new Scanner(System.in);

        String[] daftarMK06 = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka06 = new double[daftarMK06.length];
        String[] nilaiHuruf06 = new String[daftarMK06.length];
        double[] nilaiSetara06 = new double[daftarMK06.length];
        int[] bobotSKS06 = { 2, 2, 2, 3, 2, 2, 3, 2 };

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // 1. Proses Input Nilai
        for (int i06 = 0; i06 < daftarMK06.length; i06++) {
            System.out.print("masukkan nilai Angka untuk MK " + daftarMK06[i06] + ": ");
            nilaiAngka06[i06] = caesar06.nextDouble();

            if (nilaiAngka06[i06] > 80 && nilaiAngka06[i06] <= 100) {
                nilaiHuruf06[i06] = "A";
                nilaiSetara06[i06] = 4.0;
            } else if (nilaiAngka06[i06] > 73) {
                nilaiHuruf06[i06] = "B+";
                nilaiSetara06[i06] = 3.5;
            } else if (nilaiAngka06[i06] > 65) {
                nilaiHuruf06[i06] = "B";
                nilaiSetara06[i06] = 3.0;
            } else if (nilaiAngka06[i06] > 60) {
                nilaiHuruf06[i06] = "C+";
                nilaiSetara06[i06] = 2.5;
            } else if (nilaiAngka06[i06] > 50) {
                nilaiHuruf06[i06] = "C";
                nilaiSetara06[i06] = 2.0;
            } else if (nilaiAngka06[i06] > 39) {
                nilaiHuruf06[i06] = "D";
                nilaiSetara06[i06] = 1.0;
            } else {
                nilaiHuruf06[i06] = "E";
                nilaiSetara06[i06] = 0.0;
            }
        }

        System.out.println("==============================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalNilaiKaliSKS06 = 0;
        double totalSKS06 = 0;

        for (int i06 = 0; i06 < daftarMK06.length; i06++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n",
                    daftarMK06[i06], nilaiAngka06[i06], nilaiHuruf06[i06], nilaiSetara06[i06]);

            totalNilaiKaliSKS06 += (nilaiSetara06[i06] * bobotSKS06[i06]);
            totalSKS06 += bobotSKS06[i06];
        }

        double ipSemester06 = totalNilaiKaliSKS06 / totalSKS06;

        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ipSemester06);
    }
}
