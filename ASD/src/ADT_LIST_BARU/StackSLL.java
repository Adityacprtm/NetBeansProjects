package ADT_LIST_BARU;
class Node2 {
    int data;
    Node2 next;
    Node2(int dt) {
        this.data = dt;
    }
    Node2(int dt, Node2 pointer) {
        this.data = dt;
        this.next = pointer;
    }
}
public class StackSLL {
    Node2 head, tail, top;
    void inisialisasi() {
        this.head = this.tail = this.top = null;
    }
    boolean isEmpty() {
        return (top == null);
    }
    int popStack() {
        if (!isEmpty()) {
            int tampungData = top.data;
            hapusAkhir();
            top = tail;
            return tampungData;
        } else {
            return -9999;
        }
    }
    void hapusAkhir() {
        Node2 temp = head;
        if (tail == head) {
            head = tail = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            temp = null;
        }
    }
    void pushStack(Node2 baru) {
        sisipAkhir(baru);
        top = tail;
    }
    void sisipAkhir(Node2 input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
    }
    public static void main(String[] args) {
        StackSLL st = new StackSLL();
        st.pushStack(new Node2(0));
        st.pushStack(new Node2(7));
        st.pushStack(new Node2(4));
        st.pushStack(new Node2(2));
        st.pushStack(new Node2(10));
        while (!st.isEmpty()) {
            System.out.println(st.popStack());
        }
    }
}