package SeninP;

import java.util.Scanner;

public class UTSPD002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan suhu (dalam celcius) = ");
        float suhu = in.nextFloat();

        float fahrenheit = (float) (1.8 * suhu + 32);
        float reamur = (float) (0.8 * suhu);
        float kelvin = (float) (suhu + 273.15);

        System.out.printf("%s%.3f\n", "Fahrenheit = ", fahrenheit);
        System.out.printf("%s%.3f\n", "Reamur = ", reamur);
        System.out.printf("%s%.3f\n", "Kelvin = ", kelvin);
    }
}
