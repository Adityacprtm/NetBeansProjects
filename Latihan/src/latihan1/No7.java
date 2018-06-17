package latihan1;

import java.util.Scanner;

public class No7 {

    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        String a, b, c;
        System.out.print("Masukan kata\t= ");
        String emot = mlebu.nextLine();
        a = "sebel";
        b = "semangat";
        c = "bingung";
        if (emot.equals(a)) {
            System.out.println(">.<\"");
        } else if (emot.equals(b)) {
            System.out.println("\\(^_^)/");
        } else if (emot.equals(c)) {
            System.out.println("('')?");
        } else {
            System.out.println("Unknown");
        }
    }
}
