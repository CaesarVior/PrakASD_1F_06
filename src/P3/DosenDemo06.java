package P3;

import java.util.Scanner;

public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen06[] daftarDosen = new Dosen06[3];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = input.nextLine();
            System.out.print("Nama          : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jkStr = input.nextLine();
            boolean jk = jkStr.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = input.nextInt();
            input.nextLine();

            daftarDosen[i] = new Dosen06(kode, nama, jk, usia);
            System.out.println("------------------------------");
        }

        System.out.println("\n>>> LAPORAN DATA DOSEN (MENGGUNAKAN CLASS DATADOSEN) <<<");
        DataDosen06.dataSemuaDosen(daftarDosen);
        DataDosen06.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen06.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen06.infoDosenPalingTua(daftarDosen);
        DataDosen06.infoDosenPalingMuda(daftarDosen);

        input.close();
    }
}