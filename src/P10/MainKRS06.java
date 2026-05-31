package P10;
import java.util.Scanner;

public class MainKRS06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS06 antrian = new AntrianKRS06(10); 
        
        int pilihan;
        int jumlahPanggilanDPA = 0; 
        int maxPanggilanDPA = 3;   

        do {
            System.out.println("\n================================================");
            System.out.println("    SISTEM ANTRIAN PERSETUJUAN KRS MAHASISWA    ");
            System.out.println("================================================");
            System.out.println("1. Mahasiswa Masuk Antrian (Daftar)");
            System.out.println("2. Panggil & Proses KRS (Langsung 2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Jumlah Antrian & Status KRS");
            System.out.println("7. Kosongkan Antrian (Clear)");
            System.out.println("0. Keluar Program");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    
                    MahasiswaKRS06 mhs = new MahasiswaKRS06(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    if (jumlahPanggilanDPA >= maxPanggilanDPA) {
                        System.out.println("Maaf, DPA ini sudah menangani batas maksimal 3x panggilan!");
                        System.out.println("Silakan ganti atau tunggu jadwal DPA berikutnya.");
                    } else {
                        if (antrian.getJumlahAntrian() >= 2) {
                            antrian.panggilProsesKRS();
                            jumlahPanggilanDPA++;
                            System.out.println("Sesi Panggilan DPA saat ini: " + jumlahPanggilanDPA + " / " + maxPanggilanDPA);
                        } else {
                            antrian.panggilProsesKRS(); 
                        }
                    }
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 5:
                    antrian.tampilkanPalingAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian saat ini : " + antrian.getJumlahAntrian() + " orang");
                    System.out.println("Jumlah mahasiswa yang SUDAH sukses KRS  : " + antrian.getJumlahSudahKRS() + " orang");
                    System.out.println("Sisa kuota panggilan DPA saat ini       : " + (maxPanggilanDPA - jumlahPanggilanDPA) + " kali panggil");
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}
