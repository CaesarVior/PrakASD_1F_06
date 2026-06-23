package Kuis2;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        DoubleLinkedList06 dll = new DoubleLinkedList06();
        Scanner sc06 = new Scanner(System.in);   
        int menu;
        int jumlah = 1;
        do {
            System.out.println("=========================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("4. Rekap Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = sc06.nextInt();
            sc06.nextLine(); 
            
            switch (menu) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc06.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc06.nextLine();
                    dll.tambahAntrian(nama, noHp);
                    break;
                    
                case 2:
                    dll.cetakAntrian();
                    break;
                    
                case 3:
                    if (dll.headPembeli06 == null) {
                        System.out.println("Antrian Kosong, tidak ada pembeli untuk diproses.");
                        break;
                    }
                    
                    Pembeli06 pembeliSaatIni = dll.headPembeli06.data;
                    
                    System.out.print("Kode Pesanan : ");
                    int kode = sc06.nextInt();
                    sc06.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc06.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc06.nextInt();
                    
                    dll.tambahPesanan(kode, namaPesanan, harga);
                    jumlah +=1;
                    dll.tambahRekapMenu(namaPesanan, jumlah);
                    System.out.println(pembeliSaatIni.nama + " telah memesan " + namaPesanan);
                    
                    dll.hapusAntrian(pembeliSaatIni.noAntrian);
                    break;
                    
                case 4:
                    dll.laporanPesanan();
                    break;
                
                // File Modifikasi: membuat menu rekap
                case 5:
                    dll.laporanRekap();
                    break;
                    
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                    
                default:
                    System.out.println("Menu tidak valid!");
            }
            System.out.println();
        } while (menu != 0);
        
        sc06.close();
    }
}