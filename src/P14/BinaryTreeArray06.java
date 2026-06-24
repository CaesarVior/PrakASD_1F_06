package P14;

public class BinaryTreeArray06 {
    Mahasiswa06[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray06() {
        this.dataMahasiswa = new Mahasiswa06[10];
        this.idxLast = -1;
    }

    // memasukkan data array
    void populateData(Mahasiswa06 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    // menambahkan (insert) data mahasiswa baru ke dalam array tree
    void add(Mahasiswa06 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Array tree sudah penuh");
        }
    }

    // melakukan penelusuran (traversal) pohon secara In-Order (Left-Root-Right)
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // method pembuka (helper/overload) untuk memulai proses penelusuran secara Pre-Order
    void traversePreOrder() {
        traversePreOrder(0);
    }

    // Untuk melakukan penelusuran (traversal) pohon secara Pre-Order (Root-Left-Right)
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}