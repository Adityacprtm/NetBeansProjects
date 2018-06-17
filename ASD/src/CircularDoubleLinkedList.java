class NodeCDLL {
    Object data;
    NodeCDLL next;
    NodeCDLL prev;
}
public class CircularDoubleLinkedList {
    private NodeCDLL pAwal, pAkhir;
    private int counter;
    public CircularDoubleLinkedList() {
        pAwal = null;
        pAkhir = null;
        counter = -1;
    }
    public void SisipDataDiAwal(Object data) {
        NodeCDLL pBaru = new NodeCDLL();
        pBaru.data = data;
        pBaru.next = null;
        if (pAwal == null) {
            pAwal = pBaru;
            pAkhir = pBaru;
            pBaru.next = pAwal;
            pBaru.prev = pAwal;
            counter = 0;
        } else {
            pBaru.next = pAwal;
            pBaru.prev = pAkhir;
            pAwal.prev = pBaru;
            pAkhir.next = pBaru;
            pAwal = pBaru;
            counter++;
        }
    }
    public void hapusData(Object dtHapus) {
        if (pAwal != null) {
            NodeCDLL pSbl;
            NodeCDLL pKini, pHapus;
            pSbl = null;
            pKini = pAwal;
            boolean ketemu = false;
            int i = -1;
            if (pAwal != null) {
                i = 0;
            }
            while (!ketemu && (i <= counter) && (i != -1)) {
                if (pKini.data.equals(dtHapus)) {
                    ketemu = true;
                } else {
                    pSbl = pKini;
                    pKini = pKini.next;
                }
                i++;
            }
            if (ketemu) {
                if (pSbl == null) {
                    pHapus = pAwal;
                    pHapus = null;
                } else {
                    pSbl.next = pKini.next;
                    pKini.next.prev = pSbl;
                    pHapus = pKini;
                    pHapus = null;
                }
                this.counter--;
            }
        }
    }
    public Object hapusSatuDataDiAkhir() {
        NodeCDLL pKini = pAwal;
        NodeCDLL pHapus;
        while (pKini.next != pAkhir) {
            pKini = pKini.next;
        }
        pHapus = pKini.next;
        pHapus = null;
        pKini.next = pAwal;
        pAwal.prev = pKini;
        this.counter--;
        return pKini;
    }
    public void cetak(String Komentar) {
        System.out.println(Komentar);
        NodeCDLL pCetak;
        pCetak = pAwal;
        int i = -1;
        while ((i < counter)) {
            System.out.print(pCetak.data + "->");
            pCetak = pCetak.next;
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
        cdll.SisipDataDiAwal(new Integer(50));
        cdll.SisipDataDiAwal(new Integer(60));
        cdll.SisipDataDiAwal(new Integer(70));
        cdll.SisipDataDiAwal(new Integer(8));
        cdll.SisipDataDiAwal(new Integer(9));
        cdll.SisipDataDiAwal(new Integer(90));
        cdll.SisipDataDiAwal(new Integer(19));
        cdll.cetak("cdll Asal");
        cdll.hapusData(8);
        cdll.cetak("cdll stl 8 di hapus");
        cdll.hapusData(90);
        cdll.cetak("cdll stl 90 di hapus");
        cdll.hapusSatuDataDiAkhir();
        cdll.cetak("cdll stl data akhir dihapus");
    }
}