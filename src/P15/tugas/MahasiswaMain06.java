package P15.tugas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class MahasiswaMain06 {
    List<Mahasiswa06> listMhs = new ArrayList<>();
    List<MataKuliah06> listMk = new ArrayList<>();
    Queue<Nilai06> listNilai = new LinkedList<>();

    public void initDataAwal() {
        listMhs.add(new Mahasiswa06("20001", "Thalhah", "021xxx"));
        listMhs.add(new Mahasiswa06("20002", "Zubair", "021xxx"));
        listMhs.add(new Mahasiswa06("20003", "Abdur-Rahman", "021xxx"));
        listMhs.add(new Mahasiswa06("20004", "Sa'ad", "021xxx"));
        listMhs.add(new Mahasiswa06("20005", "Sa'id", "021xxx"));
        listMhs.add(new Mahasiswa06("20006", "Ubaidah", "021xxx"));

        listMk.add(new MataKuliah06("00001", "Internet of Things", 3));
        listMk.add(new MataKuliah06("00002", "Algoritma dan Struktur Data", 2));
        listMk.add(new MataKuliah06("00003", "Algoritma dan Pemrograman", 2));
        listMk.add(new MataKuliah06("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMk.add(new MataKuliah06("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public void cetakHeaderMenu() {
        System.out.println("*****************************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("*****************************************************\n");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Hapus Data Nilai Paling Awal (Queue - Poll)");
        System.out.println("6. Keluar");
        System.out.println("*****************************************************");
    }

    public static void main(String[] args) {
        MahasiswaMain06 app = new MahasiswaMain06();
        app.initDataAwal();
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        do {
            app.cetakHeaderMenu();
            System.out.print("Pilih     : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan data");
                    System.out.print("Kode      : ");
                    String inputKode = sc.next();
                    System.out.print("Nilai   : ");
                    double inputNilai = sc.nextDouble();
                    System.out.println();

                    System.out.println("DAFTAR MAHASISWA");
                    System.out.println("*****************************************************");
                    System.out.printf("%-10s %-20s %-15s\n", "NIM", "Nama", "Telf");
                    for (Mahasiswa06 m : app.listMhs) {
                        System.out.printf("%-10s %-20s %-15s\n", m.nim, m.nama, m.telf);
                    }
                    System.out.print("Pilih mahasiswa by nim: ");
                    String pilihNim = sc.next();
                    System.out.println();

                    System.out.println("DAFTAR MATA KULIAH");
                    System.out.println("*****************************************************");
                    System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
                    for (MataKuliah06 mk : app.listMk) {
                        System.out.printf("%-10s %-40s %-5d\n", mk.kode, mk.namaMatkul, mk.sks);
                    }
                    System.out.print("Pilih MK by kode: ");
                    String pilihKodeMk = sc.next();
                    System.out.println();

                    Mahasiswa06 mhsTerpilih = null;
                    for (Mahasiswa06 m : app.listMhs) {
                        if (m.nim.equals(pilihNim)) {
                            mhsTerpilih = m;
                            break;
                        }
                    }

                    MataKuliah06 mkTerpilih = null;
                    for (MataKuliah06 mk : app.listMk) {
                        if (mk.kode.equals(pilihKodeMk)) {
                            mkTerpilih = mk;
                            break;
                        }
                    }

                    if (mhsTerpilih != null && mkTerpilih != null) {
                        app.listNilai.add(new Nilai06(mhsTerpilih, mkTerpilih, inputNilai));
                    } else {
                        System.out.println("Data NIM atau Kode MK tidak ditemukan!");
                    }
                    break;

                case 2:
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("*********************************************************************************");
                    System.out.printf("%-10s %-15s %-40s %-5s %-10s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai06");
                    for (Nilai06 n : app.listNilai) {
                        System.out.printf("%-10s %-15s %-40s %-5d %-10.2f\n", 
                                          n.mhs.nim, n.mhs.nama, n.mk.namaMatkul, n.mk.sks, n.nilaiAngka);
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("*********************************************************************************");
                    System.out.printf("%-10s %-15s %-40s %-5s %-10s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai06");
                    for (Nilai06 n : app.listNilai) {
                        System.out.printf("%-10s %-15s %-40s %-5d %-10.2f\n", 
                                          n.mhs.nim, n.mhs.nama, n.mk.namaMatkul, n.mk.sks, n.nilaiAngka);
                    }
                    
                    System.out.print("Masukkan data mahasiswa[nim] :");
                    String cariNim = sc.next();
                    
                    System.out.printf("%-10s %-15s %-40s %-5s %-10s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai06");
                    int totalSks = 0;
                    boolean ditemukan = false;
                    for (Nilai06 n : app.listNilai) {
                        if (n.mhs.nim.equals(cariNim)) {
                            System.out.printf("%-10s %-15s %-40s %-5d %-10.2f\n", 
                                              n.mhs.nim, n.mhs.nama, n.mk.namaMatkul, n.mk.sks, n.nilaiAngka);
                            totalSks += n.mk.sks;
                            ditemukan = true;
                        }
                    }
                    if (ditemukan) {
                        System.out.println("Total SKS " + totalSks + " telah diambil.");
                    } else {
                        System.out.println("Mahasiswa06 dengan NIM tersebut belum memiliki transkrip nilai.");
                    }
                    System.out.println();
                    break;

                case 4:
                    List<Nilai06> tempList = new ArrayList<>(app.listNilai);
                    Collections.sort(tempList, new Comparator<Nilai06>() {
                        @Override
                        public int compare(Nilai06 n1, Nilai06 n2) {
                            return Double.compare(n1.nilaiAngka, n2.nilaiAngka);
                        }
                    });

                    System.out.println("DAFTAR NILAI MAHASISWA (TERURUT ASCENDING)");
                    System.out.println("*********************************************************************************");
                    System.out.printf("%-10s %-15s %-40s %-5s %-10s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai06");
                    for (Nilai06 n : tempList) {
                        System.out.printf("%-10s %-15s %-40s %-5d %-10.2f\n", 
                                          n.mhs.nim, n.mhs.nama, n.mk.namaMatkul, n.mk.sks, n.nilaiAngka);
                    }
                    System.out.println();
                    break;

                    case 5:
                    if (!app.listNilai.isEmpty()) {
                        Nilai06 removedNilai = app.listNilai.poll(); 
                        System.out.println("BERHASIL MENGHAPUS DATA DARI ANTRIAN!");
                        System.out.println("Mahasiswa yang dihapus nilainya: " + removedNilai.mhs.nama + " (" + removedNilai.mhs.nim + ")");
                    } else {
                        System.out.println("Antrian data nilai kosong, tidak ada data yang bisa dihapus!");
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 5);
        
        sc.close();
    }
}