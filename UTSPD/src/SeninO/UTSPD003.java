package SeninO;

import java.util.Scanner;

public class UTSPD003 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("1. Luas dan keliling persegi panjang");
        System.out.println("2. Luas dan keliling persegi");
        System.out.println("3. Luas dan keliling lingkaran");
        System.out.println("4. Luas dan keliling segitiga");
        System.out.print("Masukan pilihan = ");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukan panjang = ");
                double panjang = in.nextDouble();
                System.out.print("Masukan lebar = ");
                double lebar = in.nextDouble();
                double luaspp = panjang * lebar;
                double kelilingpp = 2 * (panjang + lebar);
                double diagonal = Math.sqrt((panjang * panjang) + (lebar * lebar));
                System.out.println("luas = " + luaspp);
                System.out.println("keliling = " + kelilingpp);
                System.out.println("diagonal = " + diagonal);
                break;
            case 2:
                System.out.print("Masukan sisi = ");
                double sisi = in.nextDouble();
                double luasp = sisi * sisi;
                double kelilingp = 4 * sisi;
                System.out.println("luas = " + luasp);
                System.out.println("keliling = " + kelilingp);
                break;
            case 3:
                final double phi = 3.14;
                System.out.print("Masukan jari-jari = ");
                double jari = in.nextDouble();
                double luasl = phi * jari * jari;
                double kelilingl = 2 * phi * jari;
                System.out.println("luas = " + luasl);
                System.out.println("keliling = " + kelilingl);
                break;
            case 4:
                System.out.print("Masukan a = ");
                double a = in.nextDouble();
                System.out.print("Masukan b = ");
                double b = in.nextDouble();
                System.out.print("Masukan t = ");
                double t = in.nextDouble();
                double luass = 0.5 * a * t;
                double kelilings = a + b + t;
                System.out.println("luas = " + luass);
                System.out.println("keliling = " + kelilings);
                break;
            default:
                System.out.println("Masukan Salah\nProgram Berhenti...");
        }
    }
}
