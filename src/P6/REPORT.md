|            | Algorithm and Data Structure                                 |
| ---------- | ------------------------------------------------------------ |
| NIM        | 254107020055                                                 |
| Nama       | Caesar Vior Byrnanda                                         |
| Kelas      | TI - 1F                                                      |
| Repository | https://github.com/CaesarVior/PrakASD_1F_06/tree/main/src/P6 |

# JOBSHEET - 5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

# Percobaan 1: Screenshot hasil percobaan

Class Sorting (BUBBLE SORT)
![Screenshot](img/Percobaan1_Class_BUBBLE_SORT.png)

Main Sorting (BUBBLE SORT)
![Screenshot](img/Percobaan1_Main_BUBBLE_SORT.png)

Class Sorting (SELECTION SORT)
![Screenshot](img/Percobaan1_Class_SELECTION_SORT.png)

Main Sorting (SELECTION SORT)
![Screenshot](img/Percobaan1_Main_SELECTION_SORT.png)

Class Sorting (INSERTION SORT)
![Screenshot](img/Percobaan1_Class_INSERTION_SORT.png)

Main Sorting (INSERTION SORT)
![Screenshot](img/Percobaan1_Main_INSERTION_SORT.png)

Hasil Percobaan
![Screenshot](img/Percobaan1_Hasil.png)

## Pertanyaan

### 1: Jelaskan fungsi kode program berikut

Kode tersebut adalah logika Swap dalam algoritma sorting. Tujuannya adalah untuk memindahkan elemen yang nilainya lebih besar ke arah kanan (indeks lebih tinggi) agar data menjadi urut secara mengecil ke membesar (ascending).

### 2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!

```
void selectionSort() {
    for (int i = 0; i < jumData - 1; i++) {
        int min = i;
        for (int j = i + 1; j < jumData; j++) {
            if (data[j] < data[min]) {
                min = j;
            }
        }

        int temp = data[i];
        data[i] = data[min];
        data[min] = temp;
    }
}
```

Kode tersebut menunjukkan algoritma dan pencarian nilai minimum pada selection sort.

### 3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan

Fungsi while berfungsi untuk menggeser (shifting) semua angka yang "lebih besar" ke kanan agar si angka "kecil" (temp) bisa disisipkan ke posisi yang benar di deretan angka yang sudah terurut.

### 4. Pada Insertion sort, apakah tujuan dari perintah

Fungsinya adalah untuk menggeser data ke kanan agar tersedia tempat kosong bagi elemen yang sedang diurutkan (temp).
