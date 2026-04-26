package P9;

public class Surat06 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    String jenisIzin;
    int durasi;

    public Surat06(String idSurat, String namaMahasiswa, String kelas, String jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.durasi = durasi;

        if (jenisIzin.equalsIgnoreCase("s")) {
            this.jenisIzin = "Sakit";
        } else if (jenisIzin.equalsIgnoreCase("i")) {
            this.jenisIzin = "Izin Keperluan Lain";
        } else {
            this.jenisIzin = jenisIzin;
        }
    }

    public void tampilData() {
        System.out.println("ID Surat: " + idSurat);
        System.out.println("Nama    : " + namaMahasiswa);
        System.out.println("Kelas   : " + kelas);
        System.out.println("Kategori: " + jenisIzin);
        System.out.println("Durasi  : " + durasi + " hari");
        System.out.println("---------------------------------");
    }
}