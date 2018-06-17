package array.s;

public class NewClass {

    public static void main(String[] args) {
        int m = 256, n = 96, r;
        do {
            r = m % n;
            if (r != 0) {
                m = n;
                n = r;
            }
        } while (r != 0);
        System.out.println("n=" + n);
        int b[]={0,0,0,0,0};
        System.out.println(b.length);
    }
}
