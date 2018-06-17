
public class DLLC {

    Object data;
    DLLC head = null;
    DLLC tail = null;
    DLLC next, previous;
    int size = 0;

    public DLLC() {
    }

    public DLLC(Object data) {
        this.data = data;
    }

    public DLLC(Object data, DLLC next, DLLC previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public int size() {
        return size;
    }

    public void addFirst(DLLC input) {
        if (size == 0) {
            head = input;
            tail = input;
            head.previous = input;
        } else {
            input.next = head;
            head.previous = input;
            head = input;
            tail.next = input;
            head.previous = tail;
        }
        size++;
    }

    public void addLast(DLLC input) {
        if (size == 0) {
            head = input;
            tail = input;
            head.previous = input;
        } else {
            input.previous = tail;
            tail.next = input;
            tail.next = head.previous;
            tail = input;
        }
        size++;
    }

    public void insertAfter(int key, DLLC input) {
        DLLC temp = head;
        do {
            if (temp.data.equals(key)) {
                input.previous = temp;
                input.next = temp.next;
                temp.next.previous = input;
                temp.next = input;
                size++;
                System.out.println("Data berhasil dimasukkan");
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertBefore(Object key, DLLC input) {
        DLLC temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                if (temp == head) {
                    this.addFirst(input);
                    System.out.println("Insert data is succeed.");
                    size++;
                    break;
                } else {
                    input.previous = temp.previous;
                    input.next = temp;
                    temp.previous.next = input;
                    temp.previous = input;
                    System.out.println("Insert data is succeed.");
                    size++;
                    break;
                }
            }
            temp = temp.next;
        }
    }

    void remove(int key) {
        DLLC temp = head;
        if (size != 0) {
            while (temp != null) {
                if (temp.data.equals(key)) {
                    if (temp == head) {
                        this.removeFirst();
                        size--;
                        break;
                    } else {
                        if (temp.next == null) {
                            tail = temp.previous;
                            tail.next = null;
                        } else {
                            temp.previous.next = temp.next;
                            temp.next.previous = temp.previous;
                        }
                        size--;
                        break;
                    }
                }
                temp = temp.next;
            }
        } else {
            System.out.println("Data is empty!");
        }
        size--;
    }

    public void removeFirst() {
        DLLC temp = head;
        if (size != 0) {
            if (head == tail) {
                head = tail = null;
            } else {
                head.next.previous = null;
                head = temp.next;
            }
            size--;
        } else {
            System.out.println("Data is empty!");
        }
    }

    public void removeLast() {
        DLLC temp = tail;
        if (size != 0) {
            if (tail == head) {
                head = tail = null;
            } else {
                tail.previous.next = head;
                tail = temp.previous;
                head.previous = tail;
            }
            size--;
        } else {
            System.out.println("Data is empty!");
        }
    }

    public void cetak() {
        DLLC d = head;
        while (d != null) {
            System.out.printf("%s%15s%5d%15s\n", d.previous, d, d.data, d.next);
            d = d.next;
            if (d.equals(head)) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        DLLC daftar = new DLLC();
        daftar.addFirst(new DLLC(400));
        daftar.addFirst(new DLLC(300));
        daftar.addFirst(new DLLC(200));
        daftar.addFirst(new DLLC(100));
        daftar.insertAfter(200, new DLLC(250));
        daftar.insertBefore(200, new DLLC(150));
        daftar.removeFirst();
        daftar.removeLast();
        daftar.remove(300);
        daftar.cetak();
    }
}
