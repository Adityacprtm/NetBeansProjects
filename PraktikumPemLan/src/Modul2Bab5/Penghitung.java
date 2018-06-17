package Modul2Bab5;
public class Penghitung {
    public static void penjumlahan(int nil1, int nil2) {
        int hasil = nil1 + nil2;
        System.out.println("Hasil penjumlahan adalah    : " + hasil);
    }
    public static void pengurangan(int nil1, int nil2) {
        int hasil = nil1 - nil2;
        System.out.println("Hasil pengurangan adalah    : " + hasil);
    }
    public void perkalian(int nil1, int nil2) {
        int hasil = nil1 * nil2;
        System.out.println("Hasil perkalian adalah      : " + hasil);
    }
    public void pembagian(double nil1, double nil2) {
        double hasil = nil1 / nil2;
        System.out.println("Hasil pembagian adalah      : " + hasil);
    }
    public void sederhana(int nil1, int nil2) {
        if (nil1 == 0 || nil2 == 0) {
            System.out.println("Hasil penyederhanaan adalah : " + nil1 + " / " + nil2);
        } else {
            int fpb = cariFpb(nil1, nil2);
            System.out.println("Hasil penyederhanaan adalah : " + (nil1 / fpb) + " / " + (nil2 / fpb));
        }
    }
    private int cariFpb(int nil1, int nil2) {
        return nil2 == 0 ? nil1 : (cariFpb(nil2, nil1 % nil2));
    }
}
