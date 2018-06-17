package fungsi;

import java.util.Scanner;

public class VolTabKerGanGen {

    public static void main(String[] args) {
        final double phi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("d = ");
        double d = in.nextDouble();
        System.out.print("t = ");
        double t = in.nextDouble();
        System.out.println(GanGen(d));
        System.out.println(VolTab(d, t, phi));
        System.out.println(VolKer(d, t, phi));
    }

    static double GanGen(double n) {
        if (n % 2 == 1) {
            System.out.println("ganjil");
        } else {
            System.out.println("genap");
        }
        return 1;
    }

    static double VolTab(double t, double d, double phi) {
        double v;
        v = phi * d * t;
        System.out.println("Volume Tabung = " + v);
        return 1;
    }

    static double VolKer(double t, double d, double phi) {
        double v;
        v = (double) 1 / 3 * phi * d * t;
        System.out.println("Volume Kerucut = " + v);
        return 1;
    }
}
