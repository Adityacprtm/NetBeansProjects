package ADT_LIST_BARU;
class Node1 {
    Mahasiswa data;
    Node1 next;
}
public class SingleLinkedListObject {
    private Node1 pointer;
    public SingleLinkedListObject() {
        pointer = null;
    }
    public void buatNode(Mahasiswa dt) {
        Node1 nodeBaru = new Node1();
        nodeBaru.data = dt;
        nodeBaru.next = pointer;
        pointer = nodeBaru;
    }
    public boolean sisip(Mahasiswa dt1, Mahasiswa dt2) {
        Node1 n = pointer;
        while ((n != null) && (n.data != dt2)) {
            n = n.next;
        }
        if (n == null) {
            return false;
        }
        Node1 nn = new Node1();
        nn.data = dt1;
        nn.next = n.next;
        n.next = nn;
        return true;
    }
    public Object hapusDiDepan() {
        Node1 hapus = pointer;
        pointer = pointer.next;
        return hapus.data;
    }
    public void sisipDataDiAkhir(Mahasiswa data) {
        Node1 pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node1 baru = new Node1();
        baru.data = data;
        baru.next = null;
        while (pAkhir != null) {
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }
    public void sisipDataUrut(Mahasiswa data) {
        Node1 baru = new Node1();
        Node1 i = pointer;
        Node1 j = pointer;
        baru.data = data;
        baru.next = null;
        if (pointer == null) {
            pointer = baru;
        } else {
            while (i != null) {
                if (data.getIpk() > pointer.data.getIpk()) {
                    baru.next = pointer;
                    pointer = baru;
                    break;
                } else if (data.getIpk() > i.data.getIpk()) {
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
    public void hapusData(Mahasiswa dataHapus) {
        Node1 temp = pointer;
        while (temp != null) {
            if (temp.next.data == dataHapus) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }
    public Node1 getPointer() {
        return pointer;
    }
    public static SingleLinkedListObject gabung(SingleLinkedListObject L1, SingleLinkedListObject L2) {
        SingleLinkedListObject temp = new SingleLinkedListObject();
        SingleLinkedListObject L3 = new SingleLinkedListObject();
        while (L1.pointer != null) {
            temp.buatNode(L1.pointer.data);
            L1.pointer = L1.pointer.next;
        }
        while (L2.pointer != null) {
            temp.buatNode(L2.pointer.data);
            L2.pointer = L2.pointer.next;
        }
        while (temp.pointer != null) {
            L3.buatNode(temp.pointer.data);
            temp.pointer = temp.pointer.next;
        }
        return L3;
    }
    public void cetak(String kom) {
        System.out.println(kom);
        Node1 n = pointer;
        while (n != null) {
            System.out.print("|" + n.data.getNama() + "|" + n.data.getNim() + "|" + n.data.getIpk() + "| -> ");
            n = n.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        SingleLinkedListObject l = new SingleLinkedListObject();
        Mahasiswa M1 = new Mahasiswa("Suarez", "123", 3);
        Mahasiswa M2 = new Mahasiswa("Alba", "132", 2.5);
        Mahasiswa M3 = new Mahasiswa("Neymar", "213", 3.6);
        Mahasiswa M4 = new Mahasiswa("Ter Stegen", "231", 2.75);
        Mahasiswa M5 = new Mahasiswa("Messi", "312", 4.0);
        Mahasiswa M6 = new Mahasiswa("Umtiti", "321", 2.1);
        l.buatNode(M1);
        l.buatNode(M2);
        l.buatNode(M3);
        l.buatNode(M4);
        l.buatNode(M5);
        l.cetak("Data asal: ");
        l.sisipDataDiAkhir(M6);
        l.cetak("Data setelah sisip di akhir : ");
        l.hapusDiDepan();
        l.cetak("Data setelah dihapus di depan : ");
        l.hapusData(M3);
        l.cetak("Data setelah M2 dihapus : ");
        SingleLinkedListObject l2 = new SingleLinkedListObject();
        l2.sisipDataUrut(new Mahasiswa("Roberto", "124", 3.4));
        l2.sisipDataUrut(new Mahasiswa("Rafinha", "214", 3.0));
        l2.sisipDataUrut(new Mahasiswa("Denis", "400", 2.8));
        l2.cetak("Data terurut IPK : ");
        SingleLinkedListObject l3 = SingleLinkedListObject.gabung(l, l2);
        l3.cetak("Data gabungan : ");
    }
}