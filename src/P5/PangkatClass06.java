package P5;

public class PangkatClass06 {
    int nilai, pangkat, hasil;

    PangkatClass06(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    // int pangkatBF(int a, int n) {
    // int hasilLocal = 1;
    // for (int i = 0; i < n; i++) {
    // hasilLocal = hasilLocal * a;
    // }
    // return hasilLocal;
    // }

    int pangkatBF() {
        int hasilLocal = 1;
        for (int i = 0; i < this.pangkat; i++) {
            hasilLocal = hasilLocal * this.nilai;
        }
        return hasilLocal;
    }

    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}