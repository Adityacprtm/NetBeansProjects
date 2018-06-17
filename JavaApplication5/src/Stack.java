
import java.util.Scanner;

public class Stack {

    private int size;
    private int top;
    private int[] data;

    public Stack(int n) {
        top = -1;
        size = n;
        data = new int[size];
    }

    public boolean isPalindrome() {
        return true;
    }

    public boolean isFull() {
        return top == (size - 1) ? true : false;
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    public void push(int dt) {
        if (!isFull()) {
            data[++top] = dt;
        }
    }

    public int pop() {
        int hasil = -999;
        if (!isEmpty()) {
            hasil = data[top--];
        }
        return hasil;
    }

    public void decimalOctal(int nilai) {
        Stack s = new Stack(100);
        while (nilai != 0) {
            int sisa = nilai % 8;
            s.push(sisa);
            nilai = nilai / 8;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public void decimalBiner(int nilai) {
        Stack s = new Stack(100);
        while (nilai != 0) {
            int sisa = nilai % 2;
            s.push(sisa);
            nilai = nilai / 2;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
    
    public void binerDecimal(int biner){
        
    }

    public static void main(String[] args) {
        Stack s = new Stack(100);
        Scanner in = new Scanner(System.in);
        System.out.print("nilai : ");
        int x = in.nextInt();
//        s.decimalBiner(x);
//        System.out.println("");
//        s.decimalOctal(x);
//        System.out.println("");
        s.binerDecimal(x);
    }
}
