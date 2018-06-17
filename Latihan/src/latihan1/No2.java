package latihan1;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan x = ");
        int x = in.nextInt();
        System.out.print("masukan y = ");
        int y = in.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("kuadran I");
        } else if (x < 0 && y > 0) {
            System.out.println("kuadran II");
        } else if (x < 0 && y < 0) {
            System.out.println("Kuadran III");
        } else {
            System.out.println("kuadran IV");
        }
    }
}
