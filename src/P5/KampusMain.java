package P5;

public class KampusMain {
    public static void main(String[] args) {
        KampusClass[] daftarMahasiswa = new KampusClass[8];

        daftarMahasiswa[0] = new KampusClass("Ahmad", 220101001, 2022, 78, 82);
        daftarMahasiswa[1] = new KampusClass("Budi", 220101002, 2022, 85, 88);
        daftarMahasiswa[2] = new KampusClass("Cindy", 220101003, 2021, 90, 87);
        daftarMahasiswa[3] = new KampusClass("Dian", 220101004, 2021, 76, 79);
        daftarMahasiswa[4] = new KampusClass("Eko", 220101005, 2023, 92, 95);
        daftarMahasiswa[5] = new KampusClass("Fajar", 220101006, 2020, 88, 85);
        daftarMahasiswa[6] = new KampusClass("Gina", 220101007, 2023, 80, 83);
        daftarMahasiswa[7] = new KampusClass("Hadi", 220101008, 2020, 82, 84);

        KampusClass alatHitung = new KampusClass();

        System.out.println("=============================================");
        System.out.println("      HASIL PERHITUNGAN NILAI MAHASISWA      ");
        System.out.println("=============================================");

        int batasAwal = 0;
        int batasAkhir = daftarMahasiswa.length - 1;

        int utsPalingBesar = alatHitung.nilaiUtsPalingBesar(daftarMahasiswa, batasAwal, batasAkhir);
        System.out.println("a) Nilai UTS Tertinggi (Divide & Conquer) : " + utsPalingBesar);

        int utsPalingKecil = alatHitung.nilaiUtsPalingKecil(daftarMahasiswa, batasAwal, batasAkhir);
        System.out.println("b) Nilai UTS Terendah  (Divide & Conquer) : " + utsPalingKecil);

        double rataRataUasSemua = alatHitung.hitungRataRataUas(daftarMahasiswa);
        System.out.println("c) Rata-rata UAS       (Brute Force)      : " + rataRataUasSemua);

        System.out.println("=============================================");
    }
}