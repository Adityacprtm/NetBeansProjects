package ADT_LIST_BARU;
class NodeDLL {
    int data;
    NodeDLL prev, next;
}
public class DoubleLinkedList {
    private NodeDLL pKepala, pEkor;
    public DoubleLinkedList() {
        pKepala = null;
        pEkor = null;
    }
    public void sisipDipKepala(int dt) {
        NodeDLL baru = new NodeDLL();
        baru.data = dt;
        if (pKepala == null) {
            baru.prev = pKepala;
            baru.next = pEkor;
            pKepala = baru;
            pEkor = baru;
        } else {
            baru.next = pKepala;
            pKepala.prev = baru;
            pKepala = baru;
        }
    }
    public void sisipDipEkor(int data) {
        NodeDLL baru = new NodeDLL();
        baru.data = data;
        if (pEkor == null) {
            baru.prev = pKepala;
            baru.next = pEkor;
            pKepala = baru;
            pEkor = baru;
        } else {
            baru.prev = pEkor;
            pEkor.next = baru;
            pEkor = baru;
            pEkor.next = null;
        }
    }
    public void cetak(String kom) {
        System.out.println(kom);
        NodeDLL p = pKepala;
        while (p != pEkor.next) {
            System.out.print(p.data + "->");
            p = p.next;
        }
        System.out.println();
    }
    public void hapusDataTertentu(int dataHapus) {
        NodeDLL temp = pKepala;
        while (temp.data != dataHapus) {
            temp = temp.next;
        }
        if (temp == pKepala) {
            pKepala = temp.next;
            pKepala.prev = null;
        } else if (temp == pEkor) {
            pEkor = temp.prev;
            pEkor.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
    public void sisipDataTerurut(int data) {
        sisipDipKepala(data);
        NodeDLL baru = pKepala;
        NodeDLL i = pKepala;
        while (i != null) {
            NodeDLL j = i.next;
            while (j != null) {
                if (i.data > j.data) {
                    int tmp = i.data;
                    i.data = j.data;
                    j.data = tmp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }
    public static void main(String s[]) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.sisipDipKepala(10);
        dll.sisipDipKepala(20);
        dll.sisipDipKepala(30);
        dll.cetak("Isi DLL setelah sisip data di pKepala");
        dll.sisipDipEkor(55);
        dll.sisipDipEkor(56);
        dll.sisipDipEkor(57);
        dll.cetak("Isi DLL setelah sisip data di pEkor");
        dll.hapusDataTertentu(55);
        dll.cetak("Isi DLL setelah data 55 dihapus");
        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.sisipDataTerurut(30);
        dll2.sisipDataTerurut(10);
        dll2.sisipDataTerurut(25);
        dll2.sisipDataTerurut(100);
        dll2.sisipDataTerurut(20);
        dll2.cetak("Isi dll2 sisip data terurut");
    }
}
