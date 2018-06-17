package SeninP;

import java.util.Scanner;

public class UTSPD001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama Karyawan\t= ");
        String nakar = in.nextLine();
        System.out.println("Jumlah Project (per bulan)\t= ");
        int probul = in.nextInt();
        System.out.println("Jumlah Project Berhasil\t= ");
        int probulber = in.nextInt();
        System.out.println("Nama Bulan\t= ");
        String bulan = in.next();

        int probulga = probul - probulber;
        int a = probul * 500000;
        int c = 250000 * probul;

        if (probulber > 7) {
            int b = probul * 40000;
        }
        if (bulan == "januari" || bulan == "maret" || bulan == "april" || bulan == "oktober" || bulan == "desember") {
            int d = probulber * 2;
        } else {
            double e = probulber * 0.75;
        }
        if (probulber > probulga) {
            double f = probulber * 0.5;
        } else {
            double g = probul * 200000;
        }
    }
}
