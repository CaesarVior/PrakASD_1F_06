package P2;

public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 dsn06 = new Dosen06();

        dsn06.idDosen = "001";
        dsn06.nama = "Muhammad Abdur";
        dsn06.statusAktif = true;
        dsn06.tahunBergabung = 2020;
        dsn06.keahlian = "Matematika";

        dsn06.tampilkanInformasi();

        Dosen06 dosen06 = new Dosen06("002", "Muhammad Amin", false, 2025, "Programming");
        System.out.println("================================================");
        dosen06.tampilkanInformasi();
        System.out.println("================================================");

        dosen06.hitungMasaKerja(2026);
        dosen06.ubahKeahlian("UI/UX");
        dosen06.setStatusAktif(true);

        dosen06.tampilkanInformasi();

    }
}
