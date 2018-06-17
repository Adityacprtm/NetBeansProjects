package praktikumpemlan;

import java.util.Arrays;

public class NadaDasar {

    public static void main(String[] args) {
        String nadaSkrng = "f";
        String nada[] = {"A", "B", "C", "D", "E", "F", "G"};
        int n = 0, a = 0;
        for (int i = 0; i < nada.length; i++) {
            if (nada[i].equalsIgnoreCase(nadaSkrng)) {
                a = i;
                while (n < 8) {
                    if (a > 6) {
                        a = 0;
                    }
                    System.out.print(nada[a] + " ");
                    n++;
                    a++;
                }
            }
        }
        int[] b = methode();
        System.out.println(Arrays.toString(b));
    }

    public static int[] methode() {
        int[] a = {1, 2, 3, 4, 5};
        return a;
    }
}
