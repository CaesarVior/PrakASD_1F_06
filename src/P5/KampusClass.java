package P5;

public class KampusClass {
    String namaMahasiswa;
    int nimMahasiswa;
    int tahunMasuk;
    int nilaiUts;
    int nilaiUas;

    public KampusClass() {
    }

    public KampusClass(String nama, int nim, int tahun, int uts, int uas) {
        namaMahasiswa = nama;
        nimMahasiswa = nim;
        tahunMasuk = tahun;
        nilaiUts = uts;
        nilaiUas = uas;
    }

    public int nilaiUtsPalingBesar(KampusClass[] dataMahasiswa, int batasKiri, int batasKanan) {
        if (batasKiri == batasKanan) {
            return dataMahasiswa[batasKiri].nilaiUts;
        }

        int posisiTengah = (batasKiri + batasKanan) / 2;

        int palingBesarDiKiri = nilaiUtsPalingBesar(dataMahasiswa, batasKiri, posisiTengah);
        int palingBesarDiKanan = nilaiUtsPalingBesar(dataMahasiswa, posisiTengah + 1, batasKanan);

        if (palingBesarDiKiri > palingBesarDiKanan) {
            return palingBesarDiKiri;
        } else {
            return palingBesarDiKanan;
        }
    }

    public int nilaiUtsPalingKecil(KampusClass[] dataMahasiswa, int batasKiri, int batasKanan) {
        if (batasKiri == batasKanan) {
            return dataMahasiswa[batasKiri].nilaiUts;
        }

        int posisiTengah = (batasKiri + batasKanan) / 2;
        int palingKecilDiKiri = nilaiUtsPalingKecil(dataMahasiswa, batasKiri, posisiTengah);
        int palingKecilDiKanan = nilaiUtsPalingKecil(dataMahasiswa, posisiTengah + 1, batasKanan);

        if (palingKecilDiKiri < palingKecilDiKanan) {
            return palingKecilDiKiri;
        } else {
            return palingKecilDiKanan;
        }
    }

    public double hitungRataRataUas(KampusClass[] dataMahasiswa) {
        double totalNilaiUas = 0;
        for (int i = 0; i < dataMahasiswa.length; i++) {
            totalNilaiUas = totalNilaiUas + dataMahasiswa[i].nilaiUas;
        }

        double hasilRataRata = totalNilaiUas / dataMahasiswa.length;

        return hasilRataRata;
    }
}