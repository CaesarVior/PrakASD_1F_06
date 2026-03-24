package P3;

import java.util.Scanner;

public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen06[] daftarDosen = new Dosen06[3];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kd = input.nextLine();
            System.out.print("Nama          : ");
            String nm = input.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jkStr = input.nextLine();
            boolean jk = jkStr.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int us = input.nextInt();
            input.nextLine();

            daftarDosen[i] = new Dosen06(kd, nm, jk, us);
            System.out.println("------------------------------");
        }

        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (Dosen06 dosen : daftarDosen) {
            System.out.println("Kode    : " + dosen.kode);
            System.out.println("Nama    : " + dosen.nama);
            System.out.println("Gender  : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia    : " + dosen.usia + " Tahun");
            System.out.println("------------------------------");
        }

        input.close();
    }
}
