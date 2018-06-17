package SeninA;

import java.util.Scanner;

public class UTSPD001 {

    public static void main(String[] args) {
        float diskon = 0, diskonM = 0, biayanormal = 0, diskontotal = 0, total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("=============== Hotel Bintang ===============");
        System.out.println("Jenis Ruangan : ");
        System.out.println("1. Deluxe Room\t\tRp 800.000/malam");
        System.out.println("2. Executive Room\tRp 1.200.000/malam");
        System.out.println("3. Presidential Room\tRp 2.400.000/malam");
        System.out.print("Nama\t\t: ");
        String nama = in.nextLine();
        System.out.print("Pilih Ruangan\t: ");
        int pilihan = in.nextInt();
        System.out.print("Member (y/n)\t: ");
        String member = in.next();
        System.out.print("Jumlah Malam\t: ");
        int malam = in.nextInt();

        if (member.equals("y")) {
            diskonM = 0.15f;
            if (malam == 3) {
                diskon = 0.05f;
            } else if (malam == 4) {
                diskon = 0.1f;
            } else if (malam == 5) {
                diskon = 0.15f;
            } else if (malam == 6) {
                diskon = 0.2f;
            } else if (malam == 7) {
                diskon = 0.25f;
            } else if (malam == 8) {
                diskon = 0.3f;
            } else if (malam == 9) {
                diskon = 0.35f;
            } else if (malam == 10) {
                diskon = 0.4f;
            } else if (malam == 11) {
                diskon = 0.45f;
            } else if (malam >= 12) {
                diskon = 0.5f;
            }
        } else {
            System.out.println("Diskon Member\t: 0");
        }
        System.out.printf("%s%.0f%s\n", "Diskon Member\t: ", (diskonM * 100), "%");
        System.out.printf("%s%.0f%s\n", "Diskon Tambahan\t: ", (diskon * 100), "%");
        System.out.printf("%s%.0f%s\n", "Total Diskon\t: ", ((diskonM * 100) + (diskon * 100)), "%");

        switch (pilihan) {
            case 1:
                biayanormal = 800000 * malam;
                diskontotal = biayanormal * (diskonM + diskon);
                total = biayanormal - diskontotal;
                break;
            case 2:
                biayanormal = 1200000 * malam;
                diskontotal = biayanormal * (diskonM + diskon);
                total = biayanormal - diskontotal;
                break;
            case 3:
                biayanormal = 2400000 * malam;
                diskontotal = biayanormal * (diskonM + diskon);
                total = biayanormal - diskontotal;
                break;
        }
        System.out.printf("%s%s%.0f\n", "Bayar Normal\t: ", "Rp ", biayanormal);
        System.out.printf("%s%s%.0f\n", "Diskon\t\t: ", "Rp ", diskontotal);
        System.out.printf("%s%s%.0f\n", "Total Bayar\t: ", "Rp ", total);
        System.out.println("==============================================");
    }
}
