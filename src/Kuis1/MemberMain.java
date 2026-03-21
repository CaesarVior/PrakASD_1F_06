package Kuis1;

import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        int jumlahAnggota = 0;
        Scanner caesar06 = new Scanner(System.in);
        int menu;

        System.out.println("Selamat datang di Admin Fitness Center");
        System.out.print("Masukkan jumlah anggota yang ingin dimasukkan: ");

        jumlahAnggota = caesar06.nextInt();

        String[] namaArrays = new String[jumlahAnggota];
        int[] umurArrays = new int[jumlahAnggota];
        int[] jumlahJamLatihanArrays = new int[jumlahAnggota];
        int pilihAnggota = 0;

        MemberClass mc = new MemberClass();

        System.out.println("=====================================================");

        for (int i = 0; i < jumlahAnggota; i++) {
            System.out.print("Masukkan nama anggota ke-" + (i + 1) + " : ");
            namaArrays[i] = caesar06.next();

            System.out.print("Masukkan umur anggota ke-" + (i + 1) + " : ");
            umurArrays[i] = caesar06.nextInt();

            System.out.print("Masukkan jumlah jam latihan anggota ke-" + (i + 1) + " : ");
            jumlahJamLatihanArrays[i] = caesar06.nextInt();

            System.out.println("=====================================================");
        }

        System.out.println("Data Member");
        mc.printData(jumlahAnggota, namaArrays, umurArrays, jumlahJamLatihanArrays);

        System.out.println("=====================================================");

        System.out.println("List Menu");

        System.out.println("1. Hitung Total Jam Latihan dari semua anggota yang berusia 40 tahun");
        System.out.println("2. Hitung jumlah anggota yang berusia antara 35 sampai 40 tahun");
        System.out.println("3. Hitung diskon member");
        System.out.print("Pilih Menu: ");

        menu = caesar06.nextInt();

        if (menu < 0 || menu > 3) {
            System.out.println("Menu tidak valid");
        } else if (menu == 1) {
            mc.totalPraticeHours(umurArrays, jumlahJamLatihanArrays);
        } else if (menu == 2) {
            mc.totalMember(umurArrays);
        } else if (menu == 3) {
            System.out.print(
                    "Masukkan nomor anggota yang ditampilkan untuk mendapatkan diskon dengan syarat jam latihan lebih dari 15 jam: ");
            pilihAnggota = caesar06.nextInt();
            double totalBiaya = mc.totalCost(pilihAnggota, namaArrays, umurArrays, jumlahJamLatihanArrays);
            System.out.println("Anggota nomor " + pilihAnggota + " Mendapatkan diskon sebeesar Rp." + totalBiaya);
        }

    }

}
