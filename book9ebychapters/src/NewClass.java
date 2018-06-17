
public class NewClass {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException x) {
            System.out.println("Pembagi 0");
        }
//        System.out.println("eror gan");
    }
}
