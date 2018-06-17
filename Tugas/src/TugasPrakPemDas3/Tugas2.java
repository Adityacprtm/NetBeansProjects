package TugasPrakPemDas3;

public class Tugas2 {

    public static void main(String[] args) {
        int i, j, k, n = 6;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("A");
            if (i >= 2) {
                for (k = 2; k < 2 * i - 1; k++) {
                    if (i == n / 2 + 1) {
                        System.out.print("A");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
