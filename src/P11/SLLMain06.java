package P11;

import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList06 sll = new SingleLinkedList06();

        System.out.println("--- INPUT DATA MAHASISWA ---");
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();

        Mahasiswa06 mhsBaru = new Mahasiswa06(nim, nama, kelas, ipk);

        sll.addFirst(mhsBaru);

        System.out.println("\n--- HASIL CETAK LINKED LIST ---");
        sll.print();
        
        sc.close();
    }
}