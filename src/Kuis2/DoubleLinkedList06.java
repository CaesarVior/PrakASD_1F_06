package Kuis2;

public class DoubleLinkedList06 {
    NodePembeli06 headPembeli06;
    NodePembeli06 tailPembeli06;

    NodePesanan06 headPesanan06;
    NodePesanan06 tailPesanan06;

    NodeRekap06 headRekap06;
    NodeRekap06 tailRekap06;

 
    int counterAntrian = 1;

    public void tambahAntrian(String nama, String noHp){
        Pembeli06 pembeli06 = new Pembeli06(nama, noHp);
        pembeli06.noAntrian = counterAntrian++;
        NodePembeli06 newNode06 = new NodePembeli06(pembeli06);

        if (headPembeli06 == null) {
            headPembeli06 = tailPembeli06 = newNode06;
        } else {
            tailPembeli06.next = newNode06;
            newNode06.prev = tailPembeli06;
            tailPembeli06 = newNode06;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + pembeli06.noAntrian);
    }

    public void cetakAntrian(){
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.println("No Antrian          Nama          No Hp");

        NodePembeli06 current = headPembeli06;
        if (current == null) {
            System.out.println("Antrian Kosong");
        } else {
                while (current != null) {
                System.out.println(current.data.noAntrian + "\t\t    " + current.data.nama + "       " + current.data.noHp);
                current = current.next;
            }
        }
    }

    public void hapusAntrian(int noAntrian){
        NodePembeli06 current = headPembeli06;
        while (current != null) {
            if (current.data.noAntrian == noAntrian) {
                Pembeli06 p = current.data;
                if (current == headPembeli06 && current == tailPembeli06) {
                    headPembeli06 = tailPembeli06 = null;
                } else if (current == headPembeli06) {
                    headPembeli06 = headPembeli06.next;
                    headPembeli06.prev = null;
                } else if (current == tailPembeli06) {
                    tailPembeli06 = tailPembeli06.prev;
                    tailPembeli06.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
            }
            current = current.next; 
        }
    }


    public void tambahPesanan(int kode, String namaMenu, int harga){
        Pesanan06 pesanan06 = new Pesanan06(kode, harga, namaMenu);
        NodePesanan06 newNode = new NodePesanan06(pesanan06);

        if (headPesanan06 == null) {
            headPesanan06 = tailPesanan06 = newNode;
        } else {
            tailPesanan06.next = newNode;
            newNode.prev = tailPesanan06;
            tailPesanan06 = newNode;
        }
    }

    //File Modifikasi: Membuat function masukkan menu rekap
    public void tambahRekapMenu(String namaMenu, int jumlah){
        Rekap06 rekap06 = new Rekap06(jumlah, namaMenu);
        NodeRekap06 newNode = new NodeRekap06(rekap06);

        if (headRekap06 == null) {
            headRekap06 = tailRekap06 = newNode;
        } else {
            tailRekap06.next = newNode;
            newNode.prev = tailRekap06;
            tailRekap06 = newNode;
        }
    }

    //File Modifikasi: Membuat function rekap
    public void laporanRekap(){
        System.out.println("=========================================");
        System.out.println("LAPORAN REKAP PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.println("Jumlah         Nama Pesanan");

        if (headRekap06 == null) {
            System.out.println("Belum ada pesanan masuk");
        } else {
            int size = 0;
            NodeRekap06 temp = headRekap06;
            while (temp != null) {
                size++;
                temp = temp.next;
            }

            NodeRekap06[] array = new NodeRekap06[size];
            temp = headRekap06;
            for (int i = 0; i < size; i++) {
                array[i] = temp;
                temp = temp.next;

            }

            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (array[j].data.namaPesanan.compareToIgnoreCase(array[j + 1].data.namaPesanan) == array[j].data.namaPesanan.compareToIgnoreCase(array[j + 1].data.namaPesanan)) {
                        Rekap06 t =array[j].data;
                        
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.println(array[i].data.jumlah + "       " + array[i].data.namaPesanan );
            }
        }     
    }
    

    public void laporanPesanan(){
        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.println("No Antrian          Nama          No Hp");

        if (headPesanan06 == null) {
            System.out.println("Belum ada pesanan masuk");
        } else {
            int size = 0;
            NodePesanan06 temp = headPesanan06;
            while (temp != null) {
                size++;
                temp = temp.next;
            }

            NodePesanan06[] arr = new NodePesanan06[size];
            temp = headPesanan06;
            for (int i = 0; i < size; i++) {
                arr[i] = temp;
                temp = temp.next;
            }

            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i; j++) {
                    if (arr[j].data.namaPesanan.compareToIgnoreCase(arr[j + 1].data.namaPesanan) > 0) {
                        Pesanan06 t =arr[j].data;
                        arr[j].data = arr[j + 1].data;
                        arr[j+1].data = t;
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i].data.kodePesanan + "       " + arr[i].data.namaPesanan + "       " + arr[i].data.harga);
            }
        }     
    }
}
