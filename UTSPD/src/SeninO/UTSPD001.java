package SeninO;

import java.util.Scanner;

public class UTSPD001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai x = ");
        int x = in.nextInt();
        System.out.print("Masukan nilai y = ");
        int y = in.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Kuadran I");
        } else if (x < 0 && y > 0) {
            System.out.println("Kuadran II");
        } else if (x < 0 && y < 0) {
            System.out.println("Kuadran III");
        } else {
            System.out.println("Kuadran IV");
        }
    }
}
