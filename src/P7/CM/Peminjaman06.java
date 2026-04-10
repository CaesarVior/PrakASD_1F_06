package P7.CM;

public class Peminjaman06 {
    Mahasiswa06 student;
    Buku06 book;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman06(Mahasiswa06 student, Buku06 book, int lamaPinjam) {
        this.student = student;
        this.book = book;
        this.lamaPinjam = lamaPinjam;

    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.println(
                student.nama + "\s | \s" + book.judul + "\s | \s Lama: " + lamaPinjam + "\s | \s Terlambat: "
                        + terlambat
                        + "\s | \s Denda: " + denda);
    }
}
