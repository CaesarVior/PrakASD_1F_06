package P7.CM;

import java.util.Scanner;

public class ManajemenBuku06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choices06;

        // Modifikasi jawaban A -> mengagnti instansiasi di line 28 untuk menguji
        // lamaPinjam apakah berhasil jika lebih dari 20 hari
        // Modifikasi jawaban B -> menambahkan logika p.isCanceled = true maka
        // ditemukan=false

        Mahasiswa06[] mahasiswa06 = {
                new Mahasiswa06("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa06("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa06("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku06[] buku06 = {
                new Buku06("B001", "Algoritma", 2020),
                new Buku06("B002", "Basis Data", 2019),
                new Buku06("B003", "Pemrograman", 2021),
                new Buku06("B004", "Fisika", 2024)
        };

        Peminjaman06[] peminjaman06 = {
                new Peminjaman06(mahasiswa06[0], buku06[0], 15, true), // andi
                new Peminjaman06(mahasiswa06[1], buku06[1], 3, false), // budi
                new Peminjaman06(mahasiswa06[2], buku06[2], 10, false), // citra
                new Peminjaman06(mahasiswa06[2], buku06[3], 6, true), // citra
                new Peminjaman06(mahasiswa06[0], buku06[1], 4, false), // andi
        };

        for (Peminjaman06 p : peminjaman06) {
            p.hitungDenda();
        }

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            choices06 = sc.nextInt();
            sc.nextLine();

            switch (choices06) {
                case 1:
                    System.out.println("\n--- Daftar Mahasiswa ---");
                    for (Mahasiswa06 s : mahasiswa06) {
                        s.tampilMahasiswa06();
                    }
                    break;

                case 2:
                    System.out.println("\n--- Daftar Buku ---");
                    for (Buku06 b : buku06) {
                        b.tampilBuku06();
                    }
                    break;

                case 3:
                    System.out.println("\n--- Data Peminjaman ---");
                    for (Peminjaman06 p : peminjaman06) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 4:
                    for (int i = 1; i < peminjaman06.length; i++) {
                        Peminjaman06 temp = peminjaman06[i];
                        int j = i - 1;
                        while (j >= 0 && peminjaman06[j].denda < temp.denda) {
                            peminjaman06[j + 1] = peminjaman06[j];
                            j--;
                        }
                        peminjaman06[j + 1] = temp;
                    }
                    System.out.println("\nData Berhasil Diurutkan (Denda Terbesar)!");
                    for (Peminjaman06 p : peminjaman06) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 5:
                    System.out.print("\nMasukkan NIM yang dicari: ");
                    String cariNim = sc.nextLine();
                    boolean ditemukan = false;
                    int i = 0;

                    System.out.println("Hasil Pencarian:");
                    for (Peminjaman06 p : peminjaman06) {
                        if (p.student.nim.equalsIgnoreCase(cariNim)) {
                            // Modifikasi
                            if (p.isCanceled == true) {
                                ditemukan = false;
                            } else {
                                p.tampilPeminjaman();
                                ditemukan = true;
                            }
                        }

                        i++;
                    }

                    if (!ditemukan) {
                        System.out.println("Data dengan NIM " + cariNim + " tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choices06 != 0);

        sc.close();
    }
}