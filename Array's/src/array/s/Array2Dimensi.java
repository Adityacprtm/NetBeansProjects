package array.s;

public class Array2Dimensi {

    public static void main(String[] args) {
        int matriks[][] = new int[4][5];
        int a = 0;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                a++;
                matriks[0][0] = a;
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }
}
