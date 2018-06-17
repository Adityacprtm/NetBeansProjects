
public class StackObject {

    // Struktur Data
    private int size;
    private int top;
    private Object[] data;

    // method
    public StackObject(int n) {
        top = -1;
        size = n;
        data = new Object[size];
    }

    public void push(Object dt) {
        if (!isFull()) {
            data[++top] = dt;
        }
    }

    public boolean isFull() {
        return top == (size - 1) ? true : false;
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    public Object pop() {
        Object hasil = null;
        if (!isEmpty()) {
            hasil = data[top--];
        }
        return hasil;
    }

    public void DesimalToBiner(int nilai) {
        StackObject s = new StackObject(100);
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
