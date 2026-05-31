|            | Algorithm and Data Structure                                            |
| ---------- | ----------------------------------------------------------------------- |
| NIM        | 254107020055                                                            |
| Nama       | Caesar Vior Byrnanda                                                    |
| Kelas      | TI - 1F                                                                 |
| Repository | https://github.com/CaesarVior/PrakASD_1F_06/blob/main/src/P10/REPORT.md |

# JOBSHEET XI SingleLinkedList

# Percobaan 1

# Hasil Percobaan

### Class Mahasiswa

![Screenshot](img/Percobaan1/P11_MahasiswaClass.png)

### Class Node

![Screenshot](img/Percobaan1/P11_NodeClass.png)

### Class SingleLinkedList

![Screenshot](img/Percobaan1/P11_SingleLinkedListClass_1.png)
![Screenshot](img/Percobaan1/P11_SingleLinkedListClass_2.png)

### Class Utama (Main)

![Screenshot](img/Percobaan1/P11_SLLMain.png)

# Hasil Running

![Screenshot](img/Percobaan1/P11_HasilPercobaan.png)

## Pertanyaan

### 1. Mengapa hasil compile kode program di baris pertama menghasilkan "Linked list kosong"?

Karena pada baris pertama, program baru membuat wadah Linked List baru dan belum ada data mahasiswa sama sekali yang dimasukkan ke dalamnya. Karena datanya masih kosong (head == null), program otomatis mendeteksi kondisi tersebut dan mencetak tulisan "Linked list kosong"

### 2. Jelaskan kegunaan variable temp secara umum pada setiap method!

Variabel temp (atau tmp) berguna sebagai penanda jalan sementara. Karena program harus berjalan lewat depan (head) satu per satu yang dipakai untuk bergeser dari satu data ke data berikutnya tanpa merusak urutan asli Linked List tersebut.

### 3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

![Screenshot](img/Percobaan1/P11_HasilModifikasi_Percobaan1.png)
![Screenshot](img/Percobaan1/P11_HasilPercobaan_Pertanyaan3.png)
