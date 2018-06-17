package array.s;

import java.util.Scanner;

public class NamaHari {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DILARANG INPUT ANGKA 0!!!");
        System.out.print("Pilih Hari : ");
        int pilih = in.nextInt();
        String hari[] = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
        System.out.println(hari[pilih - 1]);
    }
}
