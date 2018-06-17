
public class Node {

    Object data;
    Node pointer;
    Node head, tail;
    int size = 0;

    public Node() {
    }

    Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node pointer) {
        this.data = data;
        this.pointer = pointer;
    }

    void inisialisasi() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (size == 0);
    }

    int size() {
        return size;
    }

    void addFirst(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            input.pointer = head;
            head = input;
        }
        size++;
    }

    void addLast(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            tail.pointer = input;
            tail = input;
        }
        size++;
    }

    void insertAfter(Object key, Node input) {
        Node temp = head;
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

    void insertBefore(Object key, Node input) {
        Node temp = head;
        while (temp != null) {
            if ((temp.data == key) && (temp == head)) {
                this.addFirst(input);
                System.out.println("Insert data is succeed.");
                break;
            } else if (temp.pointer.data == key) {
                input.pointer = temp.pointer;
                temp.pointer = input;
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.pointer;
        }
    }

    void removeFirst() {
        Node temp = head;
        if (!isEmpty()) {
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

    void removeLast() {
        Node temp = head;
        if (!isEmpty()) {
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

    void remove(Object key) {
        Node temp = head;
        if (!isEmpty()) {
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

    public void cetakLinkedlist() {
        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.pointer;
        }
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + "  size = " + size);
        }
    }

    public Object get(int index) {
        checkIndex(index);

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.pointer;
        }
        return currentNode.data;
    }

    public int indexOf(Object theElement) {
        // search the chain for theElement
        Node currentNode = head;
        int index = 0;  // index of currentNode
        while (currentNode != null && !currentNode.data.equals(theElement)) {
            // move to next node
            currentNode = currentNode.pointer;
            index++;
        }
        // make sure we found matching element
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public Object remove(int index) {
        checkIndex(index);
        Object removedElement;
        if (index == 0) // remove first node
        {
            removedElement = head.data;
            head = head.pointer;
        } else {  // use q to get to predecessor of desired node
            Node q = head;
            for (int i = 0; i < index - 1; i++) {
                q = q.pointer;
            }
            removedElement = q.pointer.data;
            q.pointer = q.pointer.pointer; // remove desired node
            tail = q;
        }
        size--;
        return removedElement;
    }

    public void add(int index, Object theElement) {
        if (index < 0 || index > size) // invalid list position
        {
            throw new IndexOutOfBoundsException("index = " + index + "  size = " + size);
        }
        if (index == 0) // insert at front
        {
            head = new Node(theElement, head);
        } else { // find predecessor of new element
            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.pointer;
            }
            // insert after p
            p.pointer = new Node(theElement, p.pointer);
        }
        size++;
    }
}
