package P11;

public class MahasiswaTugas06 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaTugas06(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
