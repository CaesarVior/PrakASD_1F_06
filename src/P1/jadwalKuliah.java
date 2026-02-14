package P1;

import java.util.Scanner;

public class jadwalKuliah {
    static Scanner caesar06 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Program Pengelola Jadwal Kuliah 06 ===");
        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n06 = caesar06.nextInt();
        caesar06.nextLine();

        String[][] jadwal06 = new String[n06][4];

        inputDataJadwal06(jadwal06);
        tampilkanSemuaJadwal06(jadwal06);

        System.out.print("\nCari jadwal berdasarkan HARI: ");
        String cariHari06 = caesar06.nextLine();
        cariBerdasarkanHari06(jadwal06, cariHari06);

        System.out.print("\nCari jadwal berdasarkan NAMA MK: ");
        String cariMK06 = caesar06.nextLine();
        cariBerdasarkanMK06(jadwal06, cariMK06);
    }

    public static void inputDataJadwal06(String[][] data06) {
        for (int i06 = 0; i06 < data06.length; i06++) {
            System.out.println("\nInput Jadwal ke-" + (i06 + 1));
            System.out.print("Nama Mata Kuliah : ");
            data06[i06][0] = caesar06.nextLine();
            System.out.print("Ruang            : ");
            data06[i06][1] = caesar06.nextLine();
            System.out.print("Hari Kuliah      : ");
            data06[i06][2] = caesar06.nextLine();
            System.out.print("Jam Kuliah       : ");
            data06[i06][3] = caesar06.nextLine();
        }
    }

    public static void tampilkanSemuaJadwal06(String[][] data06) {
        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("------------------------------------------------------------");
        for (int i06 = 0; i06 < data06.length; i06++) {
            System.out.printf("%-20s %-10s %-10s %-10s\n",
                    data06[i06][0], data06[i06][1], data06[i06][2], data06[i06][3]);
        }
    }

    public static void cariBerdasarkanHari06(String[][] data06, String hariCari06) {
        System.out.println("Hasil pencarian hari " + hariCari06 + ":");
        for (int i06 = 0; i06 < data06.length; i06++) {
            if (data06[i06][2].equalsIgnoreCase(hariCari06)) {
                System.out.println("- " + data06[i06][0] + " di " + data06[i06][1] + " jam " + data06[i06][3]);
            }
        }
    }

    public static void cariBerdasarkanMK06(String[][] data06, String mkCari06) {
        System.out.println("Hasil pencarian MK " + mkCari06 + ":");
        for (int i06 = 0; i06 < data06.length; i06++) {
            if (data06[i06][0].equalsIgnoreCase(mkCari06)) {
                System.out.println("- Hari " + data06[i06][2] + " di " + data06[i06][1] + " jam " + data06[i06][3]);
            }
        }
    }
}
