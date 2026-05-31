package P11;

public class QueueLinkedList06 {
    NodeQueue06 front; 
    NodeQueue06 rear;  
    int size;          
    int maxCapacity;   

    public QueueLinkedList06(int maxCapacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.maxCapacity = maxCapacity;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public boolean isFull() {
        return (size >= maxCapacity);
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Semua antrian mahasiswa telah dikosongkan!");
    }

    public void enqueue(MahasiswaTugas06 input) {
        if (isFull()) {
            System.out.println("Maaf, antrian penuh! Tidak dapat menambahkan mahasiswa.");
            return;
        }
        NodeQueue06 newNode = new NodeQueue06(input);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Sukses mendaftarkan " + input.nama + " ke dalam antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang bisa dipanggil.");
            return;
        }
        MahasiswaTugas06 mhsDipanggil = front.data;
        front = front.next;
        if (front == null) {
            rear = null; 
        }
        size--;
        System.out.println("=== MEMANGGIL ANTRIAN ===");
        System.out.println("Silakan menuju loket layanan:");
        mhsDipanggil.tampilInformasi();
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\n--- STATUS PEER ANTRIAN ---");
        System.out.print("Antrian Terdepan (Front)      : ");
        System.out.println(front.data.nama + " (" + front.data.nim + ")");
        System.out.print("Antrian Paling Akhir (Rear)   : ");
        System.out.println(rear.data.nama + " (" + rear.data.nim + ")");
    }

    public void displaySize() {
        System.out.println("Jumlah mahasiswa dalam antrian saat ini: " + size + " orang.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Daftar Antrian: (Kosong)");
            return;
        }
        System.out.println("\n================= DAFTAR SELURUH ANTRIAN =================");
        System.out.println("NAMA\t\tNIM\t\tKELAS\t\tIPK");
        System.out.println("----------------------------------------------------------");
        NodeQueue06 current = front;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
        System.out.println("==========================================================");
    }
}