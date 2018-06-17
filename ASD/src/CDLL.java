class NodeCDLL1 {
    Object data;
    NodeCDLL1 next;
    NodeCDLL1 prev;
}
public class CDLL {
    private NodeCDLL1 pAwal, pAkhir;
    private int counter;
    public CDLL() {
        pAwal = null;
        pAkhir = null;
        counter = -1;
    }
    public void SisipDataDiAwal(Object data) {
        NodeCDLL1 pBaru = new NodeCDLL1();
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
            NodeCDLL1 pSbl;
            NodeCDLL1 pKini, pHapus;
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
        NodeCDLL1 pKini = pAwal;
        NodeCDLL1 pHapus;
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
        NodeCDLL1 pCetak;
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
        CDLL cdll = new CDLL();
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