package P7.CM;

public class Buku06 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    public Buku06(String bookCode, String title, int publicationYear) {
        kodeBuku = bookCode;
        judul = title;
        tahunTerbit = publicationYear;
    }

    public void tampilBuku06() {
        System.out.println("Kode: " + kodeBuku + "\s | \sJudul" + judul + "\s | \s Tahun Terbit: " + tahunTerbit);
    }
}
