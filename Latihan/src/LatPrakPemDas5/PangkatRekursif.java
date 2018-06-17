package LatPrakPemDas5;
import java.util.Scanner;
public class PangkatRekursif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan bilangan : ");
        int bilangan = in.nextInt();
        System.out.print("Masukan pangkat  : ");
        int pangkat = in.nextInt();
        System.out.println(bilangan + " pangkat " + pangkat + " = "
                + hasilPangkat(bilangan, pangkat));
    }
    static int hasilPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hasilPangkat(x, y - 1);
        }
    }
}
