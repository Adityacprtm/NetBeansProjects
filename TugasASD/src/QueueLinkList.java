class Node1 {
    public int data;
    public Node1 next;
    public Node1 prev;
    public Node1(int dt) {
        data = dt;
    }
    public void cetakLagi() {
        System.out.print(data + " ");
    }
}
public class QueueLinkList {
    private Node1 front;
    private Node1 rear;
    public QueueLinkList() {
        front = rear = null;
    }
    public boolean isEmpty() {
        return (front == null);
    }
    public void enqueue(int dt) {
        Node1 baru = new Node1(dt);
        if (front == null) {
            front = rear = baru;
        } else {
            rear.next = baru;
            baru.prev = rear;
            rear = baru;
            baru.next = null;
        }
    }
    public Node1 dequeue() {
        Node1 temp = null;
        if (front == null) {
            System.out.println("Queue Kosong");
        } else if (front == rear) {
            temp = front;
            front = rear = null;
        } else {
            temp = front;
            front = front.next;
            front.prev = null;
        }
        return temp;
    }
    public void cetak() {
        Node1 n = front;
        if (n == null) {
            System.out.println("Queue Kosong");
        } else {
            while (n != null) {
                n.cetakLagi();
                n = n.next;
            }
        }
        System.out.println("");
    }
}
class QueueLinkListApp {
    public static void main(String[] args) {
        QueueLinkList Q1 = new QueueLinkList();
        System.out.println("Masukan Data :");
        Q1.enqueue(22);
        Q1.cetak();
        Q1.enqueue(44);
        Q1.cetak();
        Q1.enqueue(66);
        Q1.cetak();
        System.out.println("Tampil Queue :");
        Q1.cetak();
        System.out.println("Hapus Depan Queue :");
        while (!Q1.isEmpty()) {
            Node1 n = Q1.dequeue();
            System.out.print("Hapus ");
            n.cetakLagi();
            System.out.println("");
            Q1.cetak();
        }
    }
}