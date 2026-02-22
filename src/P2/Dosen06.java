package P2;

public class Dosen06 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String keahlian;
    int tahun;

    public Dosen06() {

    }

    public Dosen06(String iD, String nama, boolean statusAktif, int tahunBergabung, String keahlian) {
        idDosen = iD;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.keahlian = keahlian;
    }

    void tampilkanInformasi() {
        System.out.println("Id Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        if (statusAktif == true) {
            System.out.println("Status Aktif: Aktif");
        } else {
            System.out.println("Status Aktif: Tidak Aktif");
        }
        System.out.println("Tahun Bergabung: " + tahunBergabung);

        if (tahun != 0) {
            System.out.println("Masa Aktif: " + tahun + " Tahun");
        }

        System.out.println("Keahlian: " + keahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSekarang) {
        tahun = thnSekarang - tahunBergabung;
        return tahun;
    }

    void ubahKeahlian(String ubahAhli) {
        keahlian = ubahAhli;

    }
}
