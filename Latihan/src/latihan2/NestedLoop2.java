package latihan2;

public class NestedLoop2 {

    public static void main(String[] args) {

        int v, w, x, y, z;
        for (v = 1; v <= 5; v++) {
            System.out.print(" + ");
            for (x = 1; x <= 1 && v >= 2; x++) {
                System.out.print(" + ");
                for (y = 1; y <= 1 && v >= 3; y++) {
                    System.out.print(" + ");
                    for (y = 1; y <= 1 && v >= 4; y++) {
                        System.out.print(" + ");
                        for (z = 1; z <= 1 && v >=5; z++) {
                            System.out.print(" + ");
                        }
                    }
                }
            }System.out.println("");
        }
    }
}
