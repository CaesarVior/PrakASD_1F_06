package P12;

import java.util.Scanner;


public class DoubleLinkedListMain06 {
    public static Mahasiswa06 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa06(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList06 list = new DoubleLinkedList06();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Tambah data pada indeks tertentu");
            System.out.println("5. Hapus data di awal");
            System.out.println("6. Hapus data di akhir");
            System.out.println("7. Hapus data setelah NIM tertentu ");
            System.out.println("8. Hapus data pada indeks tertentu");
            System.out.println("9. Tampilkan data pertama");
            System.out.println("10. Tampilkan data terakhir");
            System.out.println("11. Tampilkan data indeks tertentu");
            System.out.println("12. Tampilkan semua data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    list.addFirst(inputMahasiswa(scan));
                    break;
                case 2:
                    list.addLast(inputMahasiswa(scan));
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    list.insertAfter(keyNim, inputMahasiswa(scan));
                    break;
                case 4:
                    System.out.print("Masukkan indeks tujuan: ");
                    int idxAdd = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    list.add(idxAdd, inputMahasiswa(scan));
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
                case 7:
                    System.out.print("Masukkan NIM key: ");
                    String keyDel = scan.nextLine();
                    list.removeAfter(keyDel);
                    break;
                case 8:
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    int idxDel = scan.nextInt();
                    scan.nextLine();
                    list.remove(idxDel);
                    break;
                case 9:
                    list.getFirst();
                    break;
                case 10:
                    list.getLast();
                    break;
                case 11:
                    System.out.print("Masukkan indeks yang dicari: ");
                    int idxGet = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idxGet);
                    break;
                case 12:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }
}
