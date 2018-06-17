package array.s;

public class Array2Dimensi1 {

    public static void main(String[] args) {
        int matriks[][] = new int[4][5];
        int a = 1;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                matriks[i][j] = a;
                a++;
            }
        }
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
