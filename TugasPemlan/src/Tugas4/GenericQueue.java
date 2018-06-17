package Tugas4;

public class GenericQueue<E> {

    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

    public void enqueue(E e) {
        list.add(e);
    }

    public E dequeue() {
        return list.remove(0);
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
}
