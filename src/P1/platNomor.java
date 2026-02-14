package P1;

import java.util.Scanner;

public class platNomor {
    static Scanner caesar06 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan plat nomor yang ingin dicari: ");
        char cari06 = caesar06.next().charAt(0);
        char kode06[] = {
                'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'
        };

        char kota06[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        for (int i = 0; i < kode06.length; i++) {
            if (cari06 == kode06[i]) {
                System.out.print(kode06[i]);
                System.out.print("\t");
                for (int j = 0; j < kota06[i].length; j++) {
                    System.out.print(kota06[i][j]);
                    System.out.print("\t");

                }
                break;
            }

        }

    }
}
