package latihan2;

public class NestedLoop2_1 {

    public static void main(String[] args) {
        int y, z;
        for (y = 1; y <= 5; y++) {
            for (z = 1; z <= y; z++) {
                System.out.print(" + ");
            }
            System.out.println("");
        }
    }
}
