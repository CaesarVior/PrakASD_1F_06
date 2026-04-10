package P7.Jobsheet;

import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int amountStudent = sc.nextInt();

        sc.nextLine();
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06(amountStudent);

        for (int i = 0; i < amountStudent; i++) {
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

        // System.out.println("menggunakan sequential searching");
        // int posisi = list.sequentialSearching(cari);
        // list.tampilPosisi(cari, posisi);
        // list.tampilDataSearch(cari, posisi);

        System.out.println("------------------------------------------");
        System.out.println("Menggunakan Binary Search");

        list.selectionSort();
        System.out.println("Data setelah diurutkan (Ascending):");
        list.tampil();

        int posisiBinary = list.findBinarySearch(cari, 0, list.idx - 1);
        list.tampilPosisi(cari, posisiBinary);
        list.tampilDataSearch(cari, posisiBinary);

    }
}
