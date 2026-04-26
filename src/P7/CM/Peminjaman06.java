package P7.CM;

public class Peminjaman06 {
    Mahasiswa06 student;
    Buku06 book;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    // Modifikasi jawaban A -> menambahkan denda > 20000 di fungsi hitung denda
    // Modifikasi jawaban B -> menambahkan atribut isCanceled bertipe boolean lalu
    // dimasukkan kekonstruktor;
    boolean isCanceled = false;

    public Peminjaman06(Mahasiswa06 student, Buku06 book, int lamaPinjam, boolean isCanceled) {
        this.student = student;
        this.book = book;
        this.lamaPinjam = lamaPinjam;
        this.isCanceled = isCanceled;
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;

            if (denda > 20000) {
                denda = 20000;
            }
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
