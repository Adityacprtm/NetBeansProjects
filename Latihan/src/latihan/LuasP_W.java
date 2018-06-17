package latihan;

import java.util.Scanner;

public class LuasP_W {

    public static void main(String[] args) {
        int p, l;
        Scanner luas = new Scanner(System.in);
        System.out.print("Masukan panjang\t= ");
        p = luas.nextInt();
        System.out.print("Masukan lebar\t= ");
        l = luas.nextInt();
        int L = p * l;
        System.out.println("Luasnya\t\t= " + L);
        System.out.println("====================================");

        int j, m;
        Scanner detik = new Scanner(System.in);
        System.out.print("Masukan jam\t= ");
        j = detik.nextInt();
        System.out.print("Masukan menit\t= ");
        m = detik.nextInt();
        int d1 = j * 3600;
        int d2 = m * 60;
        System.out.println("Hasilnya\t= " + d1 + " detik" + " dan " + d2 + " detik");

    }
}
