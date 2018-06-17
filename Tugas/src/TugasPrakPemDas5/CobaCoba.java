package TugasPrakPemDas5;

import java.util.Scanner;

public class CobaCoba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan prima : ");
        int bilangan = input.nextInt();
        if (bil_prima(bilangan) == true) {
            System.out.println("bilangan " + bilangan + " termasuk  bilangan prima ");
        } else {
            System.out.println("bilangan " + bilangan + " termasuk bilangan bukan prima");
        }
        System.out.println("Program Menentukan Bilangan Prima 1-100");
        bilprim();
    }

    static boolean bil_prima(int bilangan) {
        boolean prima = true;
        for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
                prima = false;
                break;
            } else {
                prima = true;
            }
        }
        return prima;
    }

    static void bilprim() {
        int bilangan, pembagi, a;
        for (bilangan = 2; bilangan < 100; bilangan++) {
            a = 1;
            for (pembagi = 2; pembagi < bilangan; pembagi++) {
                if (bilangan % pembagi == 0) {
                    a = 0;
                }
            }
            if (a == 1) {
                System.out.print(bilangan + " ");
            }
        }
        System.out.println();
    }
}
