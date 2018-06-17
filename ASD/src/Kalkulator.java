import java.util.Scanner;
public class Kalkulator {
    static int jumlah(int angka1, int angka2) {
        return (angka1 + angka2);
    }
    static int kurang(int angka1, int angka2) {
        return (angka1 - angka2);
    }
    static int kali(int angka1, int angka2) {
        return (angka1 * angka2);
    }
    static double bagi(int angka1, int angka2) {
        return ((double) angka1 / angka2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilih;
        do {
            System.out.print("angka pertama\t\t= ");
            int angka1 = input.nextInt();
            System.out.print("angka kedua\t\t= ");
            int angka2 = input.nextInt();
            System.out.print("Hitung (+,-,*,/)\t= ");
            String simbol = input.next();
            switch (simbol) {
                case "+":
                    System.out.println("Hasil Penjumlahan\t= " + jumlah(angka1, angka2));
                    break;
                case "-":
                    System.out.println("Hasil Pengurangan\t= " + kurang(angka1, angka2));
                    break;
                case "*":
                    System.out.println("Hasil Perkalian\t\t= " + kali(angka1, angka2));
                    break;
                case "/":
                    System.out.println("Hasil Pembagian\t\t= " + bagi(angka1, angka2));
                    break;
                default:
                    System.out.println("Simbol yang dimasukan salah");
                    break;
            }
            System.out.print("Hitung Ulang? (y/n)\t= ");
            pilih = input.next();
            System.out.println("");
        } while (pilih.equalsIgnoreCase("y"));
    }
}