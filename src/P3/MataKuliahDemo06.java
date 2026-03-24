package P3;

import java.util.Scanner;

public class MataKuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahElemen = sc.nextInt();
        System.out.println("----------------------------------------");

        MataKuliah06[] arrayOfMataKuliah = new MataKuliah06[jumlahElemen];
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah06();
            arrayOfMataKuliah[i].tambahData06();
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo06();
        }

        sc.close();
    }
}
