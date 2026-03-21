package P5;

public class faktorial06 {
    int faktorialBF06(int n) {
        int fakto06 = 1;
        for (int i = 1; i <= n; i++) {
            fakto06 = fakto06 * i;
        }
        return fakto06;
    }

    // int faktorialBF06(int n) {
    // if (n <= 1) {
    // return 1;
    // } else {
    // return n * faktorialBF06(n - 1);
    // }
    // }

    int faktorialDC06(int n) {
        if (n == 1) {
            return 1;

        } else {
            System.out.println("Nilai n: " + n);

            int fakto06 = n * faktorialDC06(n - 1);
            return fakto06;
        }
    }

}
