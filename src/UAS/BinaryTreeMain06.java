package UAS;

public class BinaryTreeMain06 {
    public static void main(String[] args) {
        BinaryTree06 bst = new BinaryTree06();

        bst.add(new Pasien06(1, 45, "Andro Wijaya", "Kesakitan 1"));
        bst.add(new Pasien06(3, 55, "Andri Wijayo", "Kesakitan 2"));
        bst.add(new Pasien06(2, 50, "Andre Wijayi", "Kesakitan 3"));
        bst.add(new Pasien06(5, 15, "Andra Wijayu", "Kesakitan 5"));
        bst.add(new Pasien06(4, 35, "Andru Wijaye", "Kesakitan 4"));

        System.out.println("\nDaftar semua pasien:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nDaftar semua pasien yang paling muda:");
        bst.youngestTraverseInOrder(bst.root);

        System.out.println();
        System.out.print("Total Pasien adalah ");
        System.out.print(bst.hitungTotal(bst.root));

    }
}