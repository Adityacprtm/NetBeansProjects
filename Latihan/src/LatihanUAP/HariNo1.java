package LatihanUAP;

import java.util.Scanner;

public class HariNo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hari[] = {"minggu", "senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu",};

        System.out.print("Input hari ini : ");
        String hariini = in.next();

        System.out.print("n hari lalu : ");
        int n = in.nextInt();
        for (int i = 0; i < hari.length; i++) {
            if (hari[i].equals(hariini)) {
                if ((i - n) < 0) {
                    int k = n - i;
                    if (k > 7) {
                        System.out.println(hari[7 - k]);
                    } else {
                        System.out.println(hari[7 - k]);
                    }
                } else {
                    System.out.println(hari[i - n]);
                }
            }
        }
    }
}
