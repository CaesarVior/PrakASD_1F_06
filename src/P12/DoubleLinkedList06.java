package P12;

public class DoubleLinkedList06 {
    Node06 head;
    Node06 tail;
    int size;

    public DoubleLinkedList06() {
        head = null; 
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int index, Mahasiswa06 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node06 newNode = new Node06(data);
            Node06 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + keyNim + " untuk dihapus.");
            return;
        }
        Node06 target = current.next;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        target.data.tampil();

        if (target == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = target.next;
            target.next.prev = current;
        }
        size--;
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks tidak valid atau list kosong!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node06 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Data pada indeks " + index + " berhasil dihapus.");
            size--;
        }
    }

    public void addFirst (Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode; 
        } else {
            newNode.next = head;
            head.prev = newNode; 
            head = newNode; 
        }
    }

    public void addLast(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode; 
        } else {
            tail.next = newNode; 
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter (String keyNim, Mahasiswa06 data) {
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next; 
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node06 newNode = new Node06 (data);
        if (current == tail){
            newNode.prev = current;
            current.next = newNode;
            tail = newNode; 
        } else { 
        newNode.prev = current;
        newNode.next = current.next; 
        current.next.prev = newNode; 
        current.next = newNode; 
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
        }

    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node06 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next; 
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node06 current = tail; 
        while (current != null) {
            current.data.tampil(); 
            current = current.prev; 
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        
        System.out.println("Data berhasil dihapus.");
        head.data.tampil(); 
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        
        System.out.println("Data berhasil dihapus.");
        tail.data.tampil(); 
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            System.out.println("=== DATA PERTAMA ===");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            System.out.println("=== DATA TERAKHIR ===");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks tidak valid atau list kosong!");
            return;
        }
        Node06 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("=== DATA PADA INDEKS " + index + " ===");
        current.data.tampil();
    }
}
