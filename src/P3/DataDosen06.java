package P3;

public class DataDosen06 {
    public static void dataSemuaDosen(Dosen06[] daftarDosen) {
        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (Dosen06 data : daftarDosen) {
            System.out.println("Kode    : " + data.kode);
            System.out.println("Nama    : " + data.nama);
            System.out.println("Gender  : " + (data.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia    : " + data.usia);
            System.out.println("------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen06[] daftarDosen) {
        int pria = 0, wanita = 0;
        for (Dosen06 data : daftarDosen) {
            if (data.jenisKelamin)
                pria++;
            else
                wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen06[] daftarDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen06 data : daftarDosen) {
            if (data.jenisKelamin) {
                totalUsiaPria += data.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += data.usia;
                jumlahWanita++;
            }
        }
        System.out.println("Rerata Usia Pria   : " + (jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0));
        System.out.println("Rerata Usia Wanita : " + (jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0));
    }

    public static void infoDosenPalingTua(Dosen06[] daftarDosen) {
        Dosen06 palingTua = daftarDosen[0];
        for (Dosen06 data : daftarDosen) {
            if (data.usia > palingTua.usia)
                palingTua = data;
        }
        System.out.println("Dosen Paling Tua : " + palingTua.nama + " (" + palingTua.usia + " thn)");
    }

    public static void infoDosenPalingMuda(Dosen06[] daftarDosen) {
        Dosen06 palingMuda = daftarDosen[0];
        for (Dosen06 data : daftarDosen) {
            if (data.usia < palingMuda.usia)
                palingMuda = data;
        }
        System.out.println("Dosen Paling Muda: " + palingMuda.nama + " (" + palingMuda.usia + " thn)");
    }
}
