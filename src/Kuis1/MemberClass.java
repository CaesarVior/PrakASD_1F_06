package Kuis1;

public class MemberClass {
    double biayaMembership = 35000, diskon, biayaAkhirMembership = 0;
    int totalUmur, jumlahLatihan;

    // Menghitung biaya jika member diatas 15 jam
    double totalCost(int pilihAnggota, String[] nama, int[] umur, int[] jumlahJamLatihan) {
        int anggotaDipilih = pilihAnggota - 1;
        if (jumlahJamLatihan[anggotaDipilih] > 15) {
            diskon = biayaMembership * 0.1;
            biayaAkhirMembership = biayaMembership - diskon;
            return biayaAkhirMembership;

        } else {
            System.out.println("Total jam latihan kurang dari 15 jam");
        }
        return biayaAkhirMembership;

    }

    // Menampilkan data member
    void printData(int jumlahAnggota, String[] nama, int[] umur, int[] jumlahJamLatihan) {
        for (int i = 0; i < jumlahAnggota; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " " + umur[i] + " tahun " + jumlahJamLatihan[i] + " jam");
        }

    }

    // Menghitung jumlah jam latihan member berusia diatas 40 tahun
    void totalPraticeHours(int[] umurArrays, int[] jumlahJamLatihan) {
        for (int i = 0; i < jumlahJamLatihan.length; i++) {
            if (umurArrays[i] > 40) {
                jumlahLatihan = jumlahJamLatihan[i] + jumlahJamLatihan[i];
            }
        }
        System.out.println("Total jumlah latihan member berusia diatas 40 tahun adalah " + jumlahLatihan);
    }

    // Menghitung jumlah anggota
    void totalMember(int[] umurArrays) {
        for (int i = 0; i < umurArrays.length; i++) {
            if (umurArrays[i] >= 35 || umurArrays[i] <= 40) {
                totalUmur += 1;

            }
        }
        System.out.println("Jumlah anggota yang berumur antara 35 sampai 40 adalah: " + totalUmur);

    }
}
