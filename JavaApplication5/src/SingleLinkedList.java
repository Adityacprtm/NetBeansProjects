
class Node {

    Pasien data;
    Node next;
}

class Pasien {

    String nama;
    String penyakit;

    public Pasien(String nama, String penyakit) {
        this.nama = nama;
        this.penyakit = penyakit;
    }

    public String getNama() {
        return nama;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public int lvlPenyakit() {
        if (this.penyakit.equals("sekarat")) {
            return 1;
        } else if (this.penyakit.equals("jantung")) {
            return 2;
        } else if (this.penyakit.equals("sedang")) {
            return 3;
        } else if (this.penyakit.equals("ringan")) {
            return 4;
        } else {
            return -999;
        }
    }
}

public class SingleLinkedList {

    private Node pointer;

    public SingleLinkedList() {
        pointer = null;
    }

    public void buatNode(Pasien dt) {
        Node nodeBaru = new Node();
        nodeBaru.data = dt;
        nodeBaru.next = pointer;
        pointer = nodeBaru;
    }

    public boolean sisip(Pasien dt1, Pasien dt2) {
        Node n = pointer;
        while ((n != null) && (n.data != dt2)) {
            n = n.next;
        }
        if (n == null) {
            return false;
        }
        Node nn = new Node();
        nn.data = dt1;
        nn.next = n.next;
        n.next = nn;
        return true;
    }

    public Object hapusDiDepan() {
        Node hapus = pointer;
        pointer = pointer.next;
        return hapus.data;
    }

    public void sisipDataUrut(Pasien dt) {
        Node baru = new Node();
        Node i = pointer;
        Node j = pointer;
        baru.data = dt;
        baru.next = null;
        if (pointer == null) {
            pointer = baru;
        } else {
            while (i != null) {
                if (dt.lvlPenyakit() < pointer.data.lvlPenyakit()) {
                    baru.next = pointer;
                    pointer = baru;
                    break;
                } else if (dt.lvlPenyakit() < i.data.lvlPenyakit()) {
                    j.next = baru;
                    baru.next = i;
                    break;
                } else {
                    j = i;
                    i = i.next;
                }
            }
            if (i == null) {
                j.next = baru;
            }
        }
    }

    public void hapusData(Pasien dataHapus) {
        Node temp = pointer;
        while (temp != null) {
            if (temp.next.data == dataHapus) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    public Node getPointer() {
        return pointer;
    }

    public void cetak(String kom) {
        System.out.println(kom);
        Node n = pointer;
        while (n != null) {
            System.out.print(n.data.getNama() + " -> ");
            n = n.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Pasien p1 = new Pasien("parjo", "sekarat");
        Pasien p2 = new Pasien("pario", "jantung");
//        sll.buatNode(p1);
//        sll.buatNode(p2);
//        sll.cetak("data asal");
        sll.sisipDataUrut(p1);
        sll.sisipDataUrut(p2);
        sll.cetak("urut");
    }
}
