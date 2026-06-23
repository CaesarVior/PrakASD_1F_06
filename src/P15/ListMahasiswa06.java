package P15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa06 {
    List<Mahasiswa06> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa06... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa06 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int binarySearch(String nim) {
        sortByNimAsc();
        Mahasiswa06 key = new Mahasiswa06(nim, "", "");
        
        return Collections.binarySearch(mahasiswas, key, new Comparator<Mahasiswa06>() {
            @Override
            public int compare(Mahasiswa06 m1, Mahasiswa06 m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public void sortByNimAsc() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa06>() {
            @Override
            public int compare(Mahasiswa06 m1, Mahasiswa06 m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public void sortByNimDesc() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa06>() {
            @Override
            public int compare(Mahasiswa06 m1, Mahasiswa06 m2) {
                return m2.nim.compareTo(m1.nim);
            }
        });
    }

    public static void main(String[] args) {
        ListMahasiswa06 lm = new ListMahasiswa06();
        
        Mahasiswa06 m = new Mahasiswa06("201234", "Noureen", "021xx1");
        Mahasiswa06 m1 = new Mahasiswa06("201235", "Akhleema", "021xx2");
        Mahasiswa06 m2 = new Mahasiswa06("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();

        int indexData = lm.binarySearch("201235");
        if (indexData >= 0) {
            lm.update(indexData, new Mahasiswa06("201235", "Akhleema Lela", "021xx2"));
        }
        
        System.out.println("\nSetelah Di-update (dan otomatis Ascending):");
        lm.tampil();

        lm.sortByNimDesc();
        System.out.println("\nSetelah Di-sort Descending:");
        lm.tampil();
    }
}