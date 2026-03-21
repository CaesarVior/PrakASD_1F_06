|            | Algorithm and Data Structure |
| ---------- | ---------------------------- |
| NIM        | 254107020055                 |
| Nama       | Caesar Vior Byrnanda         |
| Kelas      | TI - 1F                      |
| Repository | [link] ()                    |

# JobSheet 5 #5 BRUTE FORCE DAN DIVIDE CONQUER

# Percobaan 1: Screenshot hasil percobaan

Class faktorial
![Screenshot](img/Percobaan1_Class.png)

Main faktorial
![Screenshot](img/Percobaan1_Main.png)

## Pertanyaan

### 1: Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!

Fungsi if adalah untuk menjadi rem agar tidak terjadi pemanggilan fungsi yang tidak ada batasnya. Sedangkan, else berfungsi untuk memanggil fungsi itu sendiri dan menjadi logikanya. Mudahnya, if itu adalah sebuah validasi sebelum else mengekseksui parameternya.

### 2: Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!

![Screenshot](img/Percobaan1_Pertanyaan2.png)

Bisa dengan merubah struktur kode seperti diatas.

### 3: Jelaskan perbedaan antara fakto _= i; dan int fakto = n _ faktorialDC(n-1); !

`fakto *=1;` merupakan hasil pencarian faktorial tetapi menggunakan for loop atau Brute Force. Sedangkan ` int fakto = n * faktorialDC(n-1);` merupakan pencarian faktorial tetapi menggunakan fungsi rekursif atau Divide Conquer

### 4: Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!

`faktorialBF()` menggunakan pendekatan brute force, tetapi cara ini tidak disarankan jika bilangan sudah besar. Sedangkan `faktorialDC()` menggunakan pendekatan divide conquer. Pendekatan ini merupakan cara yang paling sesuai jika berkaitan dengan aritmatika yang memiliki jumlah cukup besar.

# Percobaan 2: Screenshot hasil percobaan

Class Pangkat
![Screenshot](img/Percobaan2_Class.png)

Main Pangkat
![Screenshot](img/Percobaan2_Main.png)

Hasil
![Screenshot](img/Percobaan2_Hasil.png)

## Pertanyaan

### 1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!

`pangkatBF()` menggunakan metode perulangan biasa yaitu menggunakan perulangan for untuk mengalikan basis (a) dengan dirinya sendiri secara berurutan sebanyak nilai pangkat (b)

`pangkatDC()` menggunakan pendekatan dengan memanggil fungsi nya sendiri didalam logika nya. Method ini memecah masalah dengan cara membagi nilai pangkat (n) menjadi dua secara terus-menerus hingga mencapai basis kasus (n == 1). Setelah itu, hasil pecahan digabungkan kembali dengan cara dikalikan.

### 2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

Ada, Tahap combine terjadi ketika hasil dari pemanggilan method secara rekursif (pada fungsi Divide and Conquer) dikalikan satu sama lain untuk mendapatkan hasil akhir dari pemecahan masalah tersebut. Buktinya dapat dilihat dari logika

![Screenshot](img/Percobaan2_Pertanyaan2.png)

Jika pangkat ganjil: return (pangkatDC(a, n / 2) _ pangkatDC(a, n / 2) _ a);
Jika pangkat genap: return (pangkatDC(a, n / 2) \* pangkatDC(a, n / 2));

### 3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?

Karena atribut nilai dan pangkat sudah ada didalam class dan diisi melalui parameter pada method `pangkatBF(int a, int n)`
