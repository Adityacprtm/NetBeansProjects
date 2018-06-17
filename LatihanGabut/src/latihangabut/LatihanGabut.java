package latihangabut;

import java.util.Scanner;

public class LatihanGabut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, j;
        int angka = 0, angka1 = 0, angka2 = 0;
        String x = null;
        System.out.print("Jumlah anggota : ");
        n = in.nextInt();
        String data[] = new String[n];
        for (i = 0; i < data.length; i++) {
            x = "i+10";
            System.out.print("Anggota" + (i + 1) + " : ");
            data[i] = in.next();
            data[i] = x;
        }
    }
}
