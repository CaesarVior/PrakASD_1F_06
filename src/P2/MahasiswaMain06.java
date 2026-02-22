package P2;

public class MahasiswaMain06 {
    public static void main(String[] args) {
        Mahasiswa06 mhs1 = new Mahasiswa06(); // object 1
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.6);
        mhs1.tampilkanInformasi();

        Mahasiswa06 mhs2 = new Mahasiswa06("Annisa Nabila", "214172060", 3.25, "TI 2L"); // object 2
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa06 mhs3 = new Mahasiswa06("Caesar Vior Byrnanda", "254107020055", 3.65, "TI 1F"); // object 2
        mhs3.tampilkanInformasi();
    }

}
