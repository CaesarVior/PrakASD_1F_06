package P2;

public class MataKuliah06 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata kuliah: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berhasil diubah menjadi: " + sks);
    }

    void tambahJam(int jamBaru) {
        jumlahJam += jamBaru;
    }

    void kurangiJam(int jamBaru) {
        if (jumlahJam < jamBaru) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam saat ini (" + jumlahJam + ") tidak mencukupi.");
        } else {
            jumlahJam -= jamBaru;
            System.out.println("Pengurangan berhasil. Jumlah jam baru: " + jumlahJam);
        }
    }
}
