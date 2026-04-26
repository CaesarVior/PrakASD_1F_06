package P9;

import java.util.Scanner;

public class MainSurat06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas tumpukan surat: ");
        int cap = sc.nextInt();
        StackSurat06 stack = new StackSurat06(cap);

        int pilih;
        do {
            System.out.println("\n=== MENU ADMIN PRODI ===");
            System.out.println("1. Terima Surat Izin (Push)");
            System.out.println("2. Proses Surat Izin (Pop)");
            System.out.println("3. Lihat Surat Izin Terakhir (Peek)");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    String jenis = sc.nextLine();
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();

                    Surat06 s = new Surat06(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat06 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses/Validasi surat milik: " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
            }
        } while (pilih != 5);

        System.out.println("Selesai.");
    }
}