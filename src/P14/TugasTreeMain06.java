package P14;

public class TugasTreeMain06 {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN LINKED LIST BST ===");
        BinaryTree06 bstRekursif = new BinaryTree06();

        bstRekursif.addRekursif(new Mahasiswa06("244160121", "Ali", "A", 3.57));
        bstRekursif.addRekursif(new Mahasiswa06("244160221", "Badar", "B", 3.85));
        bstRekursif.addRekursif(new Mahasiswa06("244160185", "Candra", "C", 3.21));
        bstRekursif.addRekursif(new Mahasiswa06("244160220", "Dewi", "B", 3.54));

        System.out.println("\nHasil traversal setelah penambahan rekursif (InOrder):");
        bstRekursif.traverseInOrder(bstRekursif.root);

        System.out.println();
        bstRekursif.cariMinIPK();
        bstRekursif.cariMaxIPK();

        System.out.println();
        bstRekursif.tampilMahasiswaIPKdiAtas(3.50);

        System.out.println("\n=== PENGUJIAN ARRAY BINARY TREE ===");
        BinaryTreeArray06 bta = new BinaryTreeArray06();

        bta.add(new Mahasiswa06("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa06("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa06("244160221", "Badar", "B", 3.75));

        System.out.println("\nHasil PreOrder Traversal pada Array Tree:");
        bta.traversePreOrder();
    }
}