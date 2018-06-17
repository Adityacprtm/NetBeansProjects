package latihan3;

import java.util.Scanner;

public class GajiKar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long jam, gaji, lembur, denda;
        System.out.print("Masukan jam per bulan: ");
        jam = in.nextLong();
        gaji = jam * 5000;
        if (jam > 60) {
            gaji = (jam * 5000) - ((jam - 60) * 2500);
            lembur = (jam - 60) * 2500;
            denda = jam * 0;
        } else if (jam >= 50 && jam <= 60) {
            lembur = jam * 0;
            denda = jam * 0;
        } else {
            lembur = jam * 0;
            denda = (50 - jam) * 2500;
        }
        System.out.println("Total : " + (gaji + lembur - denda));
    }
}
