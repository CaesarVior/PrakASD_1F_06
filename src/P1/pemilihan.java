import java.util.Scanner;

public class pemilihan {
    static Scanner caesar06 = new Scanner(System.in);

    public static void main(String[] args) {

        double bobotKuis06, bobotTugas06, bobotUTS06, bobotUAS06, nilaiTugas06, nilaiKuis06, nilaiUts06, nilaiUas06,
                nilaiAngka06,
                nilaiAkhir06 = 0;
        int tugas06, kuis06, uts06, uas06;
        String nilaiHuruf06;
        bobotTugas06 = 0.2;
        bobotKuis06 = 0.2;
        bobotUTS06 = 0.3;
        bobotUAS06 = 0.4;

        System.out.println("==========================================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==========================================");

        System.out.print("Masukkan nilai tugas: ");
        tugas06 = caesar06.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        kuis06 = caesar06.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        uts06 = caesar06.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        uas06 = caesar06.nextInt();
        System.out.println("==========================================");

        if (tugas06 < 0 && tugas06 > 100 || kuis06 < 0 || kuis06 > 100 || uts06 < 0 || uts06 > 100 || uas06 < 0
                || uas06 > 100) {
            System.out.println("==========================================");
            System.out.println("Nilai Tidak Valid");
            System.out.println("==========================================");
        } else {
            nilaiTugas06 = tugas06 * bobotTugas06;
            nilaiKuis06 = kuis06 * bobotKuis06;
            nilaiUts06 = uts06 * bobotUTS06;
            nilaiUas06 = uas06 * bobotUAS06;
            nilaiAkhir06 = nilaiTugas06 + nilaiKuis06 + nilaiUts06 + nilaiUas06;
        }

        if (nilaiAkhir06 > 80 && nilaiAkhir06 <= 100) {
            nilaiHuruf06 = "A";
            nilaiAngka06 = 4;
        } else if (nilaiAkhir06 > 73 && nilaiAkhir06 <= 80) {
            nilaiHuruf06 = "B+";
            nilaiAngka06 = 3.5;
        } else if (nilaiAkhir06 > 65 && nilaiAkhir06 <= 73) {
            nilaiHuruf06 = "B";
            nilaiAngka06 = 3;
        } else if (nilaiAkhir06 > 60 && nilaiAkhir06 <= 65) {
            nilaiHuruf06 = "C+";
            nilaiAngka06 = 2.5;
        } else if (nilaiAkhir06 > 50 && nilaiAkhir06 <= 60) {
            nilaiHuruf06 = "C";
            nilaiAngka06 = 2;
        } else if (nilaiAkhir06 > 39 && nilaiAkhir06 <= 50) {
            nilaiHuruf06 = "D";
            nilaiAngka06 = 1;
        } else {
            nilaiHuruf06 = "E";
            nilaiAngka06 = 0;
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir06);
        System.out.println("Nilai Huruf: " + nilaiHuruf06);

        if (nilaiHuruf06.equalsIgnoreCase("D") || nilaiHuruf06.equalsIgnoreCase("E")) {
            System.out.println("==========================================");
            System.out.println("Anda Tidak Lulus");
        } else {
            System.out.println("==========================================");
            System.out.println("Selamat Anda Lulus");
        }
    }

}