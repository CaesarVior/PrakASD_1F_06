package P5;

import java.util.Scanner;

public class mainfaktorial06 {
    public static void main(String[] args) {
        Scanner caesar06 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = caesar06.nextInt();

        faktorial06 fk06 = new faktorial06();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk06.faktorialBF06(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk06.faktorialDC06(nilai));
    }
}
