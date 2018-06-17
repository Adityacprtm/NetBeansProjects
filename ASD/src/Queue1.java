
public class Queue1 {

    public class List {

        private Node nodeAwal;
        private Node nodeAkhir;
        private String nama;

        public List() {
            this("list");
        }

        public List(String namaList) {
            nama = namaList;
            nodeAwal = nodeAkhir = null;
        }

        public void sisipDiAwal(Object dt) {
            if (kosong()) {
                nodeAwal = nodeAkhir = new Node(dt);
            } else {
                nodeAwal = new Node(dt, nodeAwal);
                nodeAkhir.next = nodeAwal;
            }
        }

        public void sisipDiAkhir(Object dt) {
            if (kosong()) {
                nodeAwal = nodeAkhir = new Node(dt);
            } else {
                nodeAkhir = nodeAkhir.next = new Node(dt);
                nodeAkhir.next = nodeAwal;
            }
        }

        public Object hapusDrDepan() {
            Object itemDihapus = null;
            if (!kosong()) {
                itemDihapus = nodeAwal.data;
                if (nodeAwal == nodeAkhir) {
                    nodeAwal = nodeAkhir = null;
                } else {
                    nodeAwal = nodeAwal.next;
                    nodeAkhir.next = nodeAwal;
                }
            }
            return itemDihapus;
        }

        public boolean kosong() {
            return nodeAwal == null;
        }

        public void cetak() {
            if (kosong()) {
                System.out.printf("Kosong %s\n", nama);
                return;
            }
            Node kini = nodeAwal;
            if (nodeAwal != nodeAkhir) {
                System.out.printf("Isi %s adalah : ", nama);
                while (kini.next != nodeAwal) {
                    System.out.printf("%s ", kini.data);
                    kini = kini.next;
                }
                System.out.printf("%s ", nodeAkhir.data);
                System.out.println("\n");
            } else {
                System.out.printf("Isi %s adalah : ", nama);
                System.out.printf("%s ", kini.data);
                System.out.println("\n");
            }
        }
    }

    public class Node {

        Object data;
        Node next;

        Node(Object object) {
            this(object, null);
        }

        Node(Object object, Node node) {
            data = object;
            next = node;
        }

        Object getObject() {
            return data;
        }

        Node getNext() {
            return next;
        }
    }
    private List listAntrian;

    public Queue1() {
        listAntrian = new List("queue");
    }

    public void enqueue(Object object) {
        listAntrian.sisipDiAkhir(object);
    }

    public Object dequeue() {
        return listAntrian.hapusDrDepan();
    }

    public boolean kosong() {
        return listAntrian.kosong();
    }

    public void cetak() {
        listAntrian.cetak();
    }

    public static void main(String args[]) {
        System.out.println("====== QUEUE C S L L ======");
        Queue1 q = new Queue1();
        q.enqueue(10);
        q.cetak();
        q.enqueue(40);
        q.cetak();
        q.enqueue(25);
        q.cetak();
        q.enqueue(30);
        q.cetak();
        Object dtHapus = null;
        while (!q.kosong()) {
            dtHapus = q.dequeue();
            System.out.printf("%s dihapus \n", dtHapus);
            q.cetak();
        }
        System.out.println("\n===== QUEUE ROUND ROBIN =====");
        Queue1 qrr = new Queue1();
        qrr.enqueue(4);
        qrr.cetak();
        qrr.enqueue(2);
        qrr.cetak();
        qrr.enqueue(3);
        qrr.cetak();
        Object dtHapusQrr = null;
        while (!qrr.kosong()) {
            dtHapusQrr = qrr.dequeue();
            if ((int) dtHapusQrr - 1 != 0) {
                qrr.enqueue((int) dtHapusQrr - 1);
            }
            System.out.printf("%s dequeue \n", dtHapusQrr);
            qrr.cetak();
        }
    }
}