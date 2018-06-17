
public class Main {

    public static void main(String[] args) {
        Node list = new Node();
        list.addFirst(new Node(400));
        list.addFirst(new Node(300));
        list.addFirst(new Node(200));
        list.addFirst(new Node(100));
        list.cetakLinkedlist();
        System.out.println("==========");
        list.addLast(new Node(500));
        list.addFirst(new Node(50));
        list.insertAfter(200, new Node(250));
        list.cetakLinkedlist();
        System.out.println("==========");
        list.removeFirst();
        list.removeLast();
        list.remove((Object) 300);
        list.cetakLinkedlist();
        System.out.println("==========");
    }
}
