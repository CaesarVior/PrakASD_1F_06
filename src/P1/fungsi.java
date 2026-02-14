import java.util.Scanner;

public class fungsi {
    static int[][] stokBunga06 = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    static int hargaAglonema06 = 75000;
    static int hargaKeladi06 = 50000;
    static int hargaAlocasia06 = 60000;
    static int hargaMawar06 = 10000;

    public static void main(String[] args) {
        Scanner caesar06 = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   LAPORAN PENDAPATAN ROYAL GARDEN 06");
        System.out.println("=========================================");

        tampilkanPendapatanDanStatus06();
    }

    public static void tampilkanPendapatanDanStatus06() {
        for (int i06 = 0; i06 < stokBunga06.length; i06++) {
            int pendapatanAglonema06 = stokBunga06[i06][0] * hargaAglonema06;
            int pendapatanKeladi06 = stokBunga06[i06][1] * hargaKeladi06;
            int pendapatanAlocasia06 = stokBunga06[i06][2] * hargaAlocasia06;
            int pendapatanMawar06 = stokBunga06[i06][3] * hargaMawar06;
            int totalPendapatan06 = pendapatanAglonema06 + pendapatanKeladi06 +
                    pendapatanAlocasia06 + pendapatanMawar06;

            String status06;
            if (totalPendapatan06 > 1500000) {
                status06 = "Sangat Baik";
            } else {
                status06 = "Perlu Evaluasi";
            }

            System.out.println("RoyalGarden " + (i06 + 1) + ":");
            System.out.println("- Pendapatan : Rp " + totalPendapatan06);
            System.out.println("- Status     : " + status06);
            System.out.println("-----------------------------------------");
        }
    }
}
