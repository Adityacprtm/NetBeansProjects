package TugasPrakPemDas2;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int berat;
        float tinggi, imt;
        System.out.print("Masukan berat badan (Kg)\t= ");
        berat = masuk.nextInt();
        System.out.print("Masukan tinggi badan (m)\t= ");
        tinggi = masuk.nextFloat();
        imt = berat / (tinggi * tinggi);
        System.out.println("Berat badan\t= " + berat);
        System.out.println("Tinggi badan\t= " + tinggi);
        if (imt <= 18.5) {
            System.out.printf("%s%.2f%20s\n", "IMT\t\t= ", imt, "Termasuk kurus");
        } else if (18.5 < imt && imt <= 25) {
            System.out.printf("%s%.2f%20s\n", "IMT\t\t= ", imt, "Termasuk normal");
        } else if (25 < imt && imt <= 30) {
            System.out.printf("%s%.2f%20s\n", "IMT\t\t= ", imt, "Termasuk gemuk");
        } else {
            System.out.printf("%s%.2f%20s\n", "IMT\t\t= ", imt, "Termasuk kegemukan");
        }
    }
}
