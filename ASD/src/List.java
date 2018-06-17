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