package TugasPrakPemDas5;

import java.util.Scanner;

public class BilanganPrima {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan bilangan prima : ");
        int angka = in.nextInt();
        if (bilPrim(angka) == 0 || angka <= 1) {
            System.out.println("bilangan " + angka + " termasuk bukan bilangan prima ");
        } else {
            System.out.println("Bilangan " + angka + " termasuk bilangan prima ");
        }
        System.out.println("Program Menentukan Bilangan Prima 1-100");
        bilPrim100();
    }

    static int bilPrim(int angka) {
        int x = 1;
        for (int i = 2; i < angka; i++) {
            if (angka % i == 0) {
                x = 0;
                break;
            } else {
                x = 1;
            }
        }
        return x;
    }

    static void bilPrim100() {
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
