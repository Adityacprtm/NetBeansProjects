package array.s;

import java.util.Scanner;

public class MedianArray {

    public static void main(String[] args) {
        int i, j, k, l, m;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan n : ");
        int n = in.nextInt();
        int A[] = new int[n];

        for (i = 0; i < A.length; i++) {
            System.out.print("indeks ke " + (i) + " = ");
            A[i] = in.nextInt();
        }
        
        A = urut(A);
        for (l = 0; l < A.length; l++) {
            System.out.print(A[l] + " ");
        }
        System.out.println("");

        double B = median(A);
        System.out.println("median = " + B);
    }

    static double median(int[] A) {
        double median = 0;
        if (A.length % 2 == 0) {
            median = (A[A.length / 2] + A[A.length / 2 - 1]) / (double) 2;
        } else {
            median = (double) A[(A.length) / 2];
        }
        return median;
    }

    static int[] urut(int[] A) {
        int j = 0;
        int k = 0;
        while (j < A.length) {
            k = j;
            while (k < A.length) {
                if (A[j] > A[k]) {
                    int temp = A[j];
                    A[j] = A[k];
                    A[k] = temp;
                }
                k++;
            }
            j++;
        }

        return A;
    }
}
