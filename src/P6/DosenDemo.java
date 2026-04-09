package P6;

public class DosenDemo {
    public static void main(String[] args) {
        DataDosen06 listDosen = new DataDosen06();

        listDosen.tambah(new Dosen06("D01", "Pak Budi", true, 45));
        listDosen.tambah(new Dosen06("D02", "Bu Rina", false, 38));
        listDosen.tambah(new Dosen06("D03", "Pak Andi", true, 50));
        listDosen.tambah(new Dosen06("D04", "Bu Siti", false, 42));
        listDosen.tambah(new Dosen06("D05", "Pak Joko", true, 35));

        System.out.println("=== DATA DOSEN SEBELUM DIURUTKAN ===");
        listDosen.tampil();

        System.out.println("\n=== PENGURUTAN BUBBLE SORT (Usia Descending) ===");
        listDosen.bubbleSortDesc();
        listDosen.tampil();

        System.out.println("\n=== PENGURUTAN SELECTION SORT (Usia Ascending) ===");
        listDosen.selectionSortAsc();
        listDosen.tampil();

        System.out.println("\n=== PENGURUTAN INSERTION SORT (Usia Descending) ===");
        listDosen.insertionSortDesc();
        listDosen.tampil();
    }
}