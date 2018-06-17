package Tugas4;

public class CircularQueue<E> {

    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

    public void enqueue(E e) {
        list.add(e);
    }

    public E dequeue() {
        return list.remove(0);
    }

    public void serve() {
        System.out.println("Melayani " + list.get(0));
        E x = dequeue();
        enqueue(x);
    }

    public int getSize() {
        return list.size();
    }

    public E get(int idx) {
        return list.get(idx);
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }

    public static void main(String[] args) {
        CircularQueue<String> cq = new CircularQueue<>();
        cq.enqueue("aku");
        cq.enqueue("kamu");
        cq.enqueue("dia");
        cq.serve();
        System.out.println(cq.toString());
        cq.serve();
        System.out.println(cq.toString());
    }
}
