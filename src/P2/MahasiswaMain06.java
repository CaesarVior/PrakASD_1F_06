package P2;

public class MahasiswaMain06 {
    public static void main(String[] args) {
        Mahasiswa06 mhs1 = new Mahasiswa06();
        mhs1.nama = "Caesar Vior Byrnanda";
        mhs1.nim = "254107020055";
        mhs1.kelas = "TI-1F";
        mhs1.ipk = 3.65;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1G");
        mhs1.updateIpk(3.75);
        mhs1.tampilkanInformasi();

        Mahasiswa06 mhs2 = new Mahasiswa06("Annisa Nabila", "214172060", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }

}
