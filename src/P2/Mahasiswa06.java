package P2;

public class Mahasiswa06 {
    // Attribute
    String nama;
    String nim;
    String kelas;
    double ipk;
    // End Of Attribute

    public Mahasiswa06() {

    }

    // Konstruktor
    public Mahasiswa06(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    // End of Konstruktor

    // function
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    // function
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    // function
    void updateIpk(double ipkBaru) {
        if (ipk <= 0.0 || ipk >= 4.0) {
            System.out.println("IPK Tidak valid. Harus antara 0.0 dan 4.0");
        } else {
            ipk = ipkBaru;
        }
    }

    // function
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
