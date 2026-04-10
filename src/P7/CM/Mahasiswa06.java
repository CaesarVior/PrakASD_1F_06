package P7.CM;

public class Mahasiswa06 {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa06(String studentIdNumber, String name, String studyProgram) {
        nim = studentIdNumber;
        nama = name;
        prodi = studyProgram;
    }

    public void tampilMahasiswa06() {
        System.out.println("NIM: " + nim + "\s | \s Nama: " + nama + "\s | \s Prodi: " + prodi);
    }
}
