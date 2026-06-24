package UAS;

public class BinaryTree06 {
    Node06 root;

    public BinaryTree06() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Menampilkan data pasien dengan urutan In-Order (Telusuri anak kiri -> Cetak node saat ini -> Telusuri anak kanan) | IPK terkecil ke terbesar.
    public void traverseInOrder(Node06 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.pasien.tampilInformasi();
            traverseInOrder(node.right);

        }
    }

    // Menampilkan data pasien termuda (Telusuri anak kiri -> Cetak node saat ini -> Telusuri anak kanan) | IPK terkecil ke terbesar.
    public void youngestTraverseInOrder(Node06 node) {
        if (node != null) {
            youngestTraverseInOrder(node.right);
            node.pasien.tampilInformasi();
            youngestTraverseInOrder(node.left);
        }
    }

    public int hitungTotal(Node06 node) {
        if (node == null) {
            return 0;
        }
        return 1 + hitungTotal(node.left) + hitungTotal(node.right);
    }

    // Menambahkan data pasien baru ke dalam tree
    public void add(Pasien06 pasien) {
        Node06 newNode = new Node06(pasien);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node06 current = root;
            Node06 parent = null;
            while (true) {
                parent = current;
                if (pasien.noAntrian < current.pasien.noAntrian) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
}