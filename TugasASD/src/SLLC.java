
public class SLLC {

    Object data;
    SLLC pointer, head, tail;
    int size = 0;

    SLLC() {
    }

    SLLC(Object data) {
        this.data = data;
    }

    SLLC(Object data, SLLC pointer) {
        this.data = data;
        this.pointer = pointer;
    }

    public void inisialisasi() {
        head = tail = null;
    }

    public int size() {
        return size;
    }

    public void addFirst(SLLC input) {
        if (size == 0) {
            head = input;
            tail = input;
            tail.pointer = input;
        } else {
            input.pointer = head;
            head = input;
            tail.pointer = input;
        }
        size++;
    }

    public void addLast(SLLC input) {
        if (size == 0) {
            head = input;
            tail = input;
            tail.pointer = input;
        } else {
            tail.pointer = input;
            tail = input;
            tail.pointer = head;
        }
        size++;
    }

    public void insertAfter(Object key, SLLC input) {
        SLLC temp = head;
        do {
            if (temp.data.equals(key)) {
                input.pointer = temp.pointer;
                temp.pointer = input;
                size++;
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.pointer;
        } while (temp != null);
    }

    public void insertBefore(Object key, SLLC input) {
        SLLC temp = head;
        while (temp != null) {
            if ((temp.data == key) && (temp == head)) {
                this.addFirst(input);
                System.out.println("Insert data is succeed.");
                break;
            } else if (temp.pointer.data.equals(key)) {
                input.pointer = temp.pointer;
                temp.pointer = input;
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.pointer;
        }
    }

    public void removeFirst() {
        SLLC temp = head;
        if (size != 0) {
            if (head == tail) {
                head = tail = null;
            } else {
                temp = temp.pointer;
                head = temp;
                temp = null;
            }
            size--;
        } else {
            System.out.println("Data is empty!");
        }
    }

    public void removeLast() {
        SLLC temp = head;
        if (size != 0) {
            if (tail == head) {
                head = tail = null;
            } else {
                while (temp.pointer != tail) {
                    temp = temp.pointer;
                }
                temp.pointer = null;
                tail = temp;
                temp = null;
            }
            size--;
        } else {
            System.out.println("Data is empty!");
        }
    }

    public void remove(Object key) {
        SLLC temp = head;
        if (size != 0) {
            while (temp != null) {
                if (temp.pointer.data.equals(key)) {
                    temp.pointer = temp.pointer.pointer;
                    if (temp.pointer == null) {
                        tail = temp;
                    }
                    break;
                } else if ((temp.data == key) && (temp == head)) {
                    this.removeFirst();
                    break;
                }
                temp = temp.pointer;
            }
        } else {
            System.out.println("Data is empty!");
        }
        size--;
    }

    public void cetak() {
        SLLC s = head;
        while (s != null) {
            System.out.printf("%s%5d%15s\n",s,s.data,s.pointer);
            s = s.pointer;
            if (s.equals(head)) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        SLLC data = new SLLC();
        data.addFirst(new SLLC(900));
        data.addFirst(new SLLC(800));
        data.addFirst(new SLLC(700));
        data.addFirst(new SLLC(600));
        data.addLast(new SLLC(950));
        data.insertAfter(700, new SLLC(770));
        data.insertBefore(800, new SLLC(200));
        data.remove(700);
        data.cetak();
    }
}
