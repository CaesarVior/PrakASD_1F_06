package P2;

public class MataKuliahMain06 {
    public static void main(String[] args) {
        MataKuliah06 mk06 = new MataKuliah06();
        mk06.nama = "Algortima & Struktur Data";
        mk06.kodeMK = "ASD";
        mk06.sks = 6;
        mk06.jumlahJam = 8;

        System.out.println("==================================");
        mk06.tampilkanInformasi();
        System.out.println("==================================");

        mk06.ubahSKS(7);
        mk06.tampilkanInformasi();
        System.out.println("==================================");

        mk06.tambahJam(5);
        mk06.tampilkanInformasi();
        System.out.println("==================================");

        mk06.kurangiJam(14);
        System.out.println("==================================");

        mk06.kurangiJam(4);
        mk06.tampilkanInformasi();

    }

}
