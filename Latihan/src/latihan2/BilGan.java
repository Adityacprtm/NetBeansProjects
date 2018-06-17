package latihan2;

public class BilGan {

    public static void main(String[] args) {
        int i, jumlah = 0;
        for (i = 1; i <= 100; i += 2) {
            System.out.print(i);
            if (i == 99) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + "+");
            }
            jumlah += i;
            System.out.print(jumlah);
        }
    }
}
