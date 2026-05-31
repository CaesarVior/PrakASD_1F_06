package P10;

public class AntrianKRS06 {
    MahasiswaKRS06[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS; 

    public AntrianKRS06(int max) {
        this.max = max;
        this.data = new MahasiswaKRS06[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0; 
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan!");
    }

    public void tambahAntrian(MahasiswaKRS06 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh (Maksimal 10 orang)!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil mendaftar ke antrian KRS.");
    }

    public void panggilProsesKRS() {
        if (size < 2) {
            System.out.println("Proses KRS gagal! Mahasiswa di antrian kurang dari 2 orang.");
            System.out.println("Panggilan KRS minimal membutuhkan 2 mahasiswa sekaligus.");
            return;
        }

        System.out.println("--- MEMPROSES KRS UNTUK 2 MAHASISWA TERDEPAN ---");
        
        MahasiswaKRS06 mhs1 = data[front];
        front = (front + 1) % max;
        size--;
        System.out.print("1. ");
        mhs1.tampilkanData();
        sudahKRS++;

        MahasiswaKRS06 mhs2 = data[front];
        front = (front + 1) % max;
        size--;
        System.out.print("2. ");
        mhs2.tampilkanData();
        sudahKRS++;

        System.out.println(">> Status: Kedua mahasiswa di atas telah disetujui KRS-nya oleh DPA.");
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== DAFTAR SEMUA ANTRIAN KRS ===");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print("Antrian ke-" + (i + 1) + ": ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else if (size == 1) {
            System.out.println("Hanya ada 1 mahasiswa di antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("=== 2 ANTRIAN TERDEPAN ===");
            System.out.print("Urutan 1: ");
            data[front].tampilkanData();
            
            int indexKedua = (front + 1) % max;
            System.out.print("Urutan 2: ");
            data[indexKedua].tampilkanData();
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("=== ANTRIAN PALING AKHIR ===");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return sudahKRS;
    }
}
