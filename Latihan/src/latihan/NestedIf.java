package latihan;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int nilai = in.nextInt();
        if (nilai * 2 < 50) {
            nilai += 10;
        }
        if (nilai <= 20 && nilai % 2 == 1) {
            System.out.println("Filkom UB");
        } else if (nilai <= 20 && nilai % 2 == 0) {
            System.out.println("Filkom Brawijaya");
        } else if (nilai > 20 && nilai % 2 == 1) {
            System.out.println("PTIIK UB");
        } else {
            System.out.println("PTIIK Brawijaya");
        }
    }
}
