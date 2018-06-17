package SeninB;

import java.util.Scanner;

public class UTSPD001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Tahun = ");
        int tahun = in.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0 && tahun % 400 == 0) {
                System.out.println(tahun + " merupakan kabisat");
            } else if (tahun % 100 == 0 && tahun % 400 != 0) {
                System.out.println(tahun + " bukan merupakan kabisat");
            } else {
                System.out.println(tahun + " merupakan kabisat");
            }
        } else {
            System.out.println(tahun + " bukan merupakan kabisat");
        }
    }
}
