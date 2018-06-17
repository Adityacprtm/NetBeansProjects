package TugasPrakPemDas3;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = in.nextInt();
        int i = 1, j = n - 1, k = 1;
        while (i <= n) {
            while (j >= i) {
                System.out.print("  ");
                j--;
            }
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            j = n - 1;
            k = 1;
            i++;
            System.out.println();
        }
    }
}
