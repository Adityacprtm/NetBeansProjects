package looping;

public class ContohWhile1 {

    public static void main(String[] args) {
        int i = 1, jumlah = 0;
        while (i <= 100) {
            if (i == 99) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + "+");
            }
            jumlah = jumlah + i;
            i += 2;
        }
        System.out.println(jumlah);
    }
}
