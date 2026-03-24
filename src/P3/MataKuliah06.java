package P3;

import java.util.Scanner;

public class MataKuliah06 {
    Scanner sc = new Scanner(System.in);

    public String kode;
    public String dummy;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah06() {

    }

    public MataKuliah06(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData06() {
        System.out.print("Kode          : ");
        kode = sc.nextLine();
        System.out.print("Nama          : ");
        nama = sc.nextLine();
        System.out.print("Sks           : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam    : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        new MataKuliah06(kode, nama, sks, jumlahJam);
        System.out.println("----------------------------------------");
    }

    void cetakInfo06() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("SKS           : " + sks);
        System.out.println("Jumlah Jam    : " + jumlahJam);
        System.out.println("----------------------------------------");
    }
}
