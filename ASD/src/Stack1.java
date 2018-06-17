
public class Stack1 {
// Struktur Data

    private int size;
    private int top;
    private int[] data;
// method

    public Stack1(int n) {
        top = -1;
        size = n;
        data = new int[size];
    }

    public boolean isPalindrome() {
        return true;
    }

    public boolean isFull() {
        return top == (size - 1) ? true : false;
//if (top == size-1)return true;
//else return false;
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
//if (top == -1) return true;
//else return false;
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

    public static void main(String[] args) {
        Stack1 st = new Stack1(3);
        st.push(0);
        st.push(6);
        st.push(7);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
//app stack
        int nilai = 1234;
        Stack1 s = new Stack1(100);
        while (nilai != 0) {
            int sisa = nilai % 2;
            s.push(sisa);
            nilai = nilai / 2;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}
