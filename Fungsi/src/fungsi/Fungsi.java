package fungsi;

public class Fungsi {

    static void Penjumlahan(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    public static void main(String[] args) {
        Penjumlahan(5, 4);
        Penjumlahan(7, 9);
        Penjumlahan(1, 5);
        Penjumlahan2(10, 5);
    }

    static int Penjumlahan2(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        return c;
    }
}
