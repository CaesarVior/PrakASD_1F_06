package P6;

public class MahasiswaBerprestasi06 {
    Mahasiswa06[] listMhs = new Mahasiswa06[5];
    int idx;

    void tambah(Mahasiswa06 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa06 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa06 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j] != null && listMhs[idxMin] != null && listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            if (listMhs[i] != null && listMhs[idxMin] != null) {
                Mahasiswa06 tmp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp;
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            if (listMhs[i] == null)
                continue;
            Mahasiswa06 temp = listMhs[i];
            int j = i - 1;
            while (j >= 0 && listMhs[j] != null && listMhs[j].ipk > temp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = temp;
        }
    }

    void insertionSortDescending() {
        for (int i = 1; i < listMhs.length; i++) {
            if (listMhs[i] == null)
                continue;
            Mahasiswa06 temp = listMhs[i];
            int j = i - 1;

            while (j >= 0 && listMhs[j] != null && listMhs[j].ipk < temp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = temp;
        }
    }
}