package P6;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();

        // for (int i = 0; i < list.listMhs.length; i++) {
        // System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
        // System.out.print("Nama: ");
        // String nama = sc.nextLine();
        // System.out.print("NIM : ");
        // String nim = sc.nextLine();
        // System.out.print("IPK : ");
        // double ipk = sc.nextDouble();
        // sc.nextLine();
        // System.out.print("Kelas: ");
        // String kelas = sc.nextLine();

        // Mahasiswa06 m = new Mahasiswa06(nim, nama, kelas, ipk);
        // list.tambah(m);
        // }

        Mahasiswa06 m1 = new Mahasiswa06("123", "Ali", "2B", 3.9);
        Mahasiswa06 m2 = new Mahasiswa06("124", "Ila", "2B", 3.1);
        Mahasiswa06 m4 = new Mahasiswa06("126", "Tika", "2B", 3.3);
        Mahasiswa06 m3 = new Mahasiswa06("125", "Agus", "2B", 3.6);
        Mahasiswa06 m5 = new Mahasiswa06("127", "Udin", "2B", 3.2);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        // System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC)
        // dengan Bubble Sort: ");
        // list.bubbleSort();
        // list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
    }
}

// public static void main(String[] args) {
// MahasiswaBerprestasi list = new MahasiswaBerprestasi();
// Mahasiswa06 m1 = new Mahasiswa06("123", "Zidan", "2A", 3.2);
// Mahasiswa06 m2 = new Mahasiswa06("124", "Ayu", "2A", 3.5);
// Mahasiswa06 m3 = new Mahasiswa06("125", "Sofi", "2A", 3.1);
// Mahasiswa06 m4 = new Mahasiswa06("126", "Sita", "2A", 3.9);
// Mahasiswa06 m5 = new Mahasiswa06("127", "Miki", "2A", 3.7);

// list.tambah(m1);
// list.tambah(m2);
// list.tambah(m3);
// list.tambah(m4);
// list.tambah(m5);

// System.out.println("\nData mahasiswa sebelum sorting: ");
// list.tampil();

// System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) :
// ");
// list.bubbleSort();
// list.tampil();

// }

// Mahasiswa06 m1 = new Mahasiswa06("111", "Ayu", "2C", 3.7);
// Mahasiswa06 m2 = new Mahasiswa06("222", "Dika", "2C", 3.0);
// Mahasiswa06 m3 = new Mahasiswa06("333", "Ila", "2C", 3.8);
// Mahasiswa06 m4 = new Mahasiswa06("444", "Susi", "2C", 3.1);
// Mahasiswa06 m5 = new Mahasiswa06("555", "Yayuk", "2C", 3.4);