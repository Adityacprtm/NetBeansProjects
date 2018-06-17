package SeninB;

import java.util.Scanner;

public class UTSPD002 {

    public static void main(String[] args) {
        int a, b, c, d, e, f, u, v, w, x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan tabungan (dibawah 1 juta) = ");
        int tabung = in.nextInt();

        a = tabung / 100000;
        u = tabung % 100000;
        b = u / 10000;
        v = u % 10000;
        c = v / 1000;
        w = v % 1000;
        d = w / 100;
        x = w % 100;
        e = x / 10;
        y = x % 10;
        f = y;

        System.out.print("Uang tabungan nasabah sebesar "+a + " lembar ratusan ribu, ");
        System.out.print(b + " lembar puluhan ribu, ");
        System.out.print(c + " lembar ribuan, ");
        System.out.print(d + " lembar ratusan, ");
        System.out.print(e + " lembar puluhan dan ");
        System.out.println(f + " lembar satuan.");
    }
}
