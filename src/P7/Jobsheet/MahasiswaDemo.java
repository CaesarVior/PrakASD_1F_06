package P7.Jobsheet;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();

        for (int i = 0; i < list.listMhs.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();

            sc.nextLine();

            Mahasiswa06 m = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println("--------------------");
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        // System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC)
        // dengan Bubble Sort: ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT
        // (ASC): ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT
        // (ASC): ");
        // list.insertionSort();
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT
        // (DESC): ");
        // list.insertionSortDescending();
        // list.tampil();

        System.out.println("--------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}
