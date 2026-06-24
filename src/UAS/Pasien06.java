package UAS;

public class Pasien06 {
    String namaPasien;
    String penyakit;
    int umur;
    int noAntrian;

    public Pasien06() {
    }

    public Pasien06(int noAntrian, int umur, String namaPasien, String penyakit) {
        this.noAntrian  = noAntrian;
        this.umur       = umur;
        this.namaPasien = namaPasien;
        this.penyakit   = penyakit;

    }

    public void tampilInformasi() {
        System.out.println("Umur: " + this.umur + " No Antrian: " + this.noAntrian +  " Nama Pasien: " + this.namaPasien + " Penyakit: " + this.penyakit);
    }
}