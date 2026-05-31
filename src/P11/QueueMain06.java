package P11;

import java.util.Scanner;

public class QueueMain06 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        
        System.out.print("Tentukan batas maksimal kapasitas antrian: ");
        int kapasitas = input06.nextInt();
        input06.nextLine(); 

        QueueLinkedList06 antrianMhs = new QueueLinkedList06(kapasitas);
        int pilihan;

        do {
            System.out.println("\n=== MENU UNIT LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian Terdepan (Dequeue)");
            System.out.println("3. Lihat Antrian Terdepan & Terbelakang (Peek)");
            System.out.println("4. Lihat Jumlah Mahasiswa yang Mengantre");
            System.out.println("5. Tampilkan Seluruh Daftar Antrian");
            System.out.println("6. Kosongkan Seluruh Antrian");
            System.out.println("7. Keluar Program");
            System.out.print("Pilih opsi menu (1-7): ");
            pilihan = input06.nextInt();
            input06.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Pendaftaran Antrian Baru ---");
                    System.out.print("Masukkan Nama  : ");
                    String nama = input06.nextLine();
                    System.out.print("Masukkan NIM   : ");
                    String nim = input06.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    String kelas = input06.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = input06.nextDouble();
                    input06.nextLine(); 

                    MahasiswaTugas06 mhs = new MahasiswaTugas06(nim, nama, kelas, ipk);
                    antrianMhs.enqueue(mhs);
                    break;
                case 2:
                    antrianMhs.dequeue();
                    break;
                case 3:
                    antrianMhs.peek();
                    break;
                case 4:
                    antrianMhs.displaySize();
                    break;
                case 5:
                    antrianMhs.printQueue();
                    break;
                case 6:
                    antrianMhs.clear();
                    break;
                case 7:
                    System.out.println("Keluar dari program layanan. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka antara 1 sampai 7.");
            }
        } while (pilihan != 7);

        input06.close();
    }
}