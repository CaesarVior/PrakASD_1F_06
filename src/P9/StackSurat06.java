package P9;

public class StackSurat06 {
    Surat06[] tumpukan;
    int size;
    int top;

    public StackSurat06(int size) {
        this.size = size;
        tumpukan = new Surat06[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat06 surat) {
        if (!isFull()) {
            top++;
            tumpukan[top] = surat;
            System.out.println("Surat dari " + surat.namaMahasiswa + " berhasil masuk tumpukan.");
        } else {
            System.out.println("Tumpukan penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat06 pop() {
        if (!isEmpty()) {
            Surat06 surat = tumpukan[top];
            top--;
            return surat;
        } else {
            System.out.println("Tumpukan kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Surat Izin Terakhir (Teratas):");
            tumpukan[top].tampilData();
        } else {
            System.out.println("Tumpukan kosong!");
        }
    }

    public void cariSurat(String nama) {
        System.out.println(nama);
        boolean ketemu = false;
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("Surat ditemukan pada tumpukan ke-" + (i + 1));
                    tumpukan[i].tampilData();
                    ketemu = true;
                }
            }
        }
        if (!ketemu) {
            System.out.println("Surat atas nama '" + nama + "' tidak ditemukan.");
        }
    }
}