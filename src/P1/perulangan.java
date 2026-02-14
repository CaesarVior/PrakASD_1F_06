package P1;

import java.util.Scanner;

public class perulangan {
    static Scanner caesar06 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan NIM anda: ");
        long nim06 = caesar06.nextLong();
        int temp06 = 0;

        temp06 = (int) (nim06 % 100);
        if (temp06 < 10) {
            temp06 += 10;
        }

        for (int i = 1; i <= temp06; i++) {
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

    }
}
