package UAS;

public class Node06 {
    Pasien06 pasien;
    Node06 left, right;

    public Node06() {
    }

    public Node06(Pasien06 pasien) {
        this.pasien = pasien;
        this.left = null;
        this.right = null;
    }
}