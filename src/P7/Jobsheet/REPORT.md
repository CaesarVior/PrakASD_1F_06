|            | Algorithm and Data Structure                                          |
| ---------- | --------------------------------------------------------------------- |
| NIM        | 254107020055                                                          |
| Nama       | Caesar Vior Byrnanda                                                  |
| Kelas      | TI - 1F                                                               |
| Repository | https://github.com/CaesarVior/PrakASD_1F_06/tree/main/src/P7/Jobsheet |

# JOBSHEET VI SEARCHING

# Percobaan 1: Sequential Search

Hasil Percobaan
![Screenshot](img/Percobaan1_Class.png)
![Screenshot](img/Percobaan1_Main.png)

Hasil Running
![Screenshot](img/Percobaan1_Hasil1.png)
![Screenshot](img/Percobaan1_Hasil2.png)

## Pertanyaan

### 1. Jelaskan perbedaan method tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!

tampilPosisi: Hanya menampilkan informasi letak index array di mana data tersebut ditemukan.

tampilDataSearch: Menampilkan secara detail seluruh atribut (NIM, Nama, Kelas, IPK) dari mahasiswa pada index yang ditemukan tersebut.

### 2. Jelaskan fungsi break pada kode program di bawah ini!

Perintah break berfungsi untuk menghentikan perulangan (looping) secara paksa. Dalam Sequential Search, jika data yang dicari sudah ditemukan, kita tidak perlu mengecek sisa data di belakangnya lagi. Ini membuat algoritma lebih efisien.

### 3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?

Variabel pos berfungsi untuk menyimpan letak indeks (posisi) elemen array yang nilainya cocok dengan data yang dicari. Nilai indeks ini nantinya digunakan untuk memanggil dan menampilkan data dari array (misal: listMhs[pos].nama). Jika data tidak ditemukan, nilainya akan tetap -1.

### 4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.

Akan menampilkan data yang pertama kali ditemukan (data dengan indeks terkecil yang cocok). Hal ini terjadi karena ada perintah break. Begitu program menemukan kecocokan pertama, perulangan langsung dihentikan sehingga data kembar di indeks selanjutnya tidak akan terdeteksi.

### 5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?

Jika break dihapus, perulangan akan terus berjalan sampai elemen terakhir array meskipun data sudah ditemukan. Akibatnya, jika ada data yang nilainya sama (kembar), variabel posisi akan terus ditimpa (di- overwrite). Sehingga, program akan menampilkan data kembar yang letaknya paling akhir (indeks terbesar).

# Percobaan 1: Binary Search
