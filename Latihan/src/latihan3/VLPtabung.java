package latihan3;

import java.util.Scanner;

public class VLPtabung {

    public static void main(String[] args) {
        final double phi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("jari-jari = ");
        int r = in.nextInt();
        System.out.print("tinggi = ");
        int t = in.nextInt();

        System.out.print("Volume atau luaspermukaan = ");
        String x = in.next();

        switch (x) {
            case "Volume":
                System.out.println("V = " + (phi * r * r * t));
                break;
            case "luaspermukaan":
                System.out.println("LP = " + (2 * phi * r * (r + t)));
                break;
        }
    }
}
