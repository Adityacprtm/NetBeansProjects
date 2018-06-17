package array.s;

import java.util.Scanner;

public class NamaHari1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih Hari : ");
        int pilih = in.nextInt();
        String hari[] = new String[8];
        hari[1] = "senin";
        hari[2] = "selasa";
        hari[3] = "rabu";
        hari[4] = "kamis";
        hari[5] = "jumat";
        hari[6] = "sabtu";
        hari[7] = "minggu";
        System.out.println("hari : " + hari[pilih]);
    }
}
