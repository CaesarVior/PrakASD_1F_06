|            | Algorithm and Data Structure                                         |
| ---------- | -------------------------------------------------------------------- |
| NIM        | 254107020055                                                         |
| Nama       | Caesar Vior Byrnanda                                                 |
| Kelas      | TI - 1F                                                              |
| Repository | https://github.com/CaesarVior/PrakASD_1F_06/tree/main/src/9/Jobsheet |

# JOBSHEET IX STACK

# Percobaan 1

# Hasil Percobaan

### 1.1 Class Mahasiswa06

Class ini berfungsi sebagai model data untuk menyimpan atribut mahasiswa.
![Screenshot](img/P9_ClassMahasiswa.png)

### 1.2 Class StackTugasMahasiswa06

Class ini mengimplementasikan struktur data Stack menggunakan array.
![Screenshot](img/P9_ClassStackTugasMahasiswa_1.png)
![Screenshot](img/P9_ClassStackTugasMahasiswa_2.png)

### 1.3 Class Utama (Main)

Class ini menangani antarmuka menu dan input user.
![Screenshot](img/P9_ClassUtama_1.png)
![Screenshot](img/P9_ClassUtama_2.png)

# Hasil Running

![Screenshot](img/P9_HasilPercobaan1_1.png)
![Screenshot](img/P9_HasilPercobaan1_2.png)

## Pertanyaan

### 1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?

Pada bagian class StackTugasMahasiswa06.java yang perlu dirubah karena, perulangan tersebut berjalan maju yang ditandai dengan i++. Untuk, menyesuaikan maka harus diganti perulangan nya menjadi seperti pada gambar:
![Screenshoot](img/P9_ClassStackTugasMahasiswa_Pertanyaan1.png)

### 2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!

Data yang dapat ditampung hanya 5, sesuai dengan potongan kode
`StackTugasMahasiswa06 stack = new StackTugasMahasiswa06(5);`

### 3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?

Untuk mengecek apakah array/stack sudah penuh atau tidak kapasitasnya. Sehingga data baru yang akan dimasukkan tidak bisa ditambahkan lagi. Jika dihapus maka akan ada error karena datanya tidak bisa ditampung lagi atau bisa disebut Stack Overflow.

### 4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!

Menambahkan class baru di `StackTugasMahasiswa06.java` agar bisa melihat data pertama yang dimasukkan. Sehingga ditambahkan menu baru untuk melihat data pertama.
![Screenshot](img/P9_ClassStackTugasMahasiswa_Pertanyaan4.png)
![Screenshot](img//P9_HasilPercobaan_Pertanyaan4.png)
