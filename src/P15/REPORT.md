|            | Algorithm and Data Structure                                            |
| ---------- | ----------------------------------------------------------------------- |
| NIM        | 254107020055                                                            |
| Nama       | Caesar Vior Byrnanda                                                    |
| Kelas      | TI - 1F                                                                 |
| Repository | https://github.com/CaesarVior/PrakASD_1F_06/blob/main/src/P15/REPORT.md |

# JOBSHEET XV Collection Framework

# Percobaan 1

### Class ContohList

![Screenshot](img/Percobaan1/P15_ContohList.png)

# Hasil Running

![Screenshot](img/Percobaan1/P15_HasilPercobaan.png)

## Pertanyaan

### 1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?

Class ArrayList berbasis array dinamis yang unggul dalam kecepatan mengakses data, sedangkan LinkedList berbasis simpul berantai yang unggul dalam kecepatan menambah atau menghapus data di tengah list.

### 2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!

![Screenshot](img/Percobaan1/P15_Pertanyaan2_1.png)
![Screenshot](img/Percobaan1/P15_Pertanyaan2_2.png)

Hasilnya adalah seperti pada gambar diatas. Sehingga, ketika data isi dengan tipe data lain tidak bisa

### 3. Ubah kode pada baris kode 38 menjadi seperti ini

![Screenshot](img/Percobaan1/P15_Pertanyaan3.png)
Hasilnya adalah seperti pada gambar diatas.

### 4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya

![Screenshot](img/Percobaan1/P15_Pertanyaan4.png)
![Screenshot](img/Percobaan1/P15_HasilPercobaan_Pertanyaan4.png)

Hasilnya adalah seperti pada gambar diatas. Sehingga hasilnya akan seperti itu

### 5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!

Kode program tersebut menunjukkan bagaimana data dalam daftar (list) bisa ditambah, dihapus, diubah nilainya, serta disisipkan di posisi awal secara dinamis, di mana perubahan tersebut langsung memengaruhi urutan, total elemen, dan nilai elemen pertama atau terakhir saat dicetak

# Percobaan 2

### Class LoopCollection

![Screenshot](img/Percobaan2/P15_LoopCollectionClass.png)

# Hasil Running

![Screenshot](img/Percobaan2/P15_HasilPercobaan.png)

## Pertanyaan

### 1. Apakah perbedaan fungsi push() dan add() pada objek fruits?

Fungsi push() dan add(): Keduanya sama-sama digunakan untuk memasukkan buah ke dalam daftar, namun push() dirancang khusus untuk struktur tumpukan (stack) sedangkan add() merupakan fungsi umum untuk semua jenis daftar.

### 2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?

![Screenshot](img/Percobaan2/P15_Pertanyaan2.png)

Tiga baris terakhir pada keluaran program akan menjadi kosong karena buah "Melon" dan "Durian" tidak jadi dimasukkan ke dalam daftar yang sebelumnya sudah dikosongkan.

### 3. Jelaskan fungsi dari baris 46-49?

Baris tersebut berfungsi untuk menampilkan seluruh isi daftar buah secara berurutan menggunakan alat bantu penjelajah (iterator).

### 4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?

![Screenshot](img/Percobaan2/P15_Pertanyaan4.png)

Program akan mengalami error saat dijalankan karena perintah push(), empty(), dan pop() tidak dikenali di dalam struktur List biasa.

### 5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!

![Screenshot](img/Percobaan2/P15_Pertanyaan5.png)

### 6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

# Percobaan 3

### Class Mahasiswa

![Screenshot](img/Percobaan3/P15_ListMahasiswaClass.png)

### Class ListMahasiswa

![Screenshot](img/Percobaan3/P15_ListMahasiswaClass.png)

### Class Utama

![Screenshot](img/Percobaan3/P15_ListMahasiswaMain.png)

# Hasil Running

![Screenshot](img/Percobaan3/P15_HasilPercobaan.png)

## Pertanyaan

### 1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?

Konsep: Fungsi tersebut menggunakan konsep Varargs (Variable Arguments) yang ditandai dengan simbol tiga titik (...). Kelebihan: Kita bisa memasukkan jumlah data mahasiswa secara fleksibel (boleh satu, dua, banyak, atau bahkan kosong) ke dalam fungsi tersebut hanya dengan satu baris panggilan tanpa perlu membuat daftar atau array secara manual terlebih dahulu.

### 2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
