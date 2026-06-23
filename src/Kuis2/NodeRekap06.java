// //File Modifikasi: Membuat NodeRekap

package Kuis2;

public class NodeRekap06 {
    Rekap06 data;
    NodeRekap06 prev;
    NodeRekap06 next;

    public NodeRekap06(Rekap06 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}