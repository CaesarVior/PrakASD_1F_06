package P7.CM;

import java.util.Scanner;

public class Menu06 {
    int choices;

    int displayMenu() {
        System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari berdasarkan NIM");
        System.out.println("0. Keluar");

        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih: ");
        choices = sc.nextInt();

        sc.close();
        return choices;

    }
}
