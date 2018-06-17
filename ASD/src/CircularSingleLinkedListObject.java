class NodeCSLL1 {
    Mahasiswa data;
    NodeCSLL1 next;
}
public class CircularSingleLinkedListObject {
    private NodeCSLL1 pAwal, pAkhir;
    private int counter;
    public CircularSingleLinkedListObject() {
        pAwal = null;
        pAkhir = null;
        counter = -1;
    }
    public void SisipDataDiAwal(Mahasiswa data) {
        NodeCSLL1 pBaru = new NodeCSLL1();
        pBaru.data = data;
        pBaru.next = null;
        if (pAwal == null) {
            pAwal = pBaru;
            pAkhir = pBaru;
            pBaru.next = pAwal;
            counter = 0;
        } else {
            pBaru.next = pAwal;
            pAwal = pBaru;
            pAkhir.next = pAwal;
            counter++;
        }
    }
    public void hapusData(Mahasiswa dtHapus) {
        if (pAwal != null) {
            NodeCSLL1 pSbl, pKini, pHapus;
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
                    pHapus = pKini;
                    pHapus = null;
                }
                this.counter--;
            }
        }
    }
    public Object hapusSatuDataDiAkhir() {
        NodeCSLL1 pKini = pAwal, pHapus;
        while (pKini.next != pAkhir) {
            pKini = pKini.next;
        }
        pHapus = pKini.next;
        pHapus = null;
        pKini.next = pAwal;
        this.counter--;
        return pKini;
    }
    public void cetak(String Komentar) {
        System.out.println(Komentar);
        NodeCSLL1 pCetak;
        pCetak = pAwal;
        int i = -1;
        while ((i < counter)) {
            System.out.print("|" + pCetak.data.getNim() + "|" + pCetak.data.getNama() + "|" + pCetak.data.getIpk() + "| -> ");
            pCetak = pCetak.next;
            i++;
        }
        System.out.println();
    }
    public void cetakIpk3() {
        System.out.println("IPK diatas 3.0");
        NodeCSLL1 pCetak;
        pCetak = pAwal;
        int i = -1;
        while ((i < counter)) {
            if (pCetak.data.getIpk() > 3.0) {
                System.out.print("|" + pCetak.data.getNim() + "|" + pCetak.data.getNama() + "|" + pCetak.data.getIpk() + "| -> ");
            }
            pCetak = pCetak.next;
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularSingleLinkedListObject csll = new CircularSingleLinkedListObject();
        Mahasiswa M1 = new Mahasiswa("Suarez", "123", 3.3);
        Mahasiswa M2 = new Mahasiswa("Alba", "132", 2.5);
        Mahasiswa M3 = new Mahasiswa("Neymar", "213", 3.6);
        Mahasiswa M4 = new Mahasiswa("Ter Stegen", "231", 2.75);
        Mahasiswa M5 = new Mahasiswa("Messi", "312", 4.0);
        Mahasiswa M6 = new Mahasiswa("Umtiti", "321", 2.1);
        csll.SisipDataDiAwal(M6);
        csll.SisipDataDiAwal(M5);
        csll.SisipDataDiAwal(M4);
        csll.SisipDataDiAwal(M3);
        csll.SisipDataDiAwal(M2);
        csll.SisipDataDiAwal(M1);
        csll.cetak("csll Asal");
        csll.cetakIpk3();
        csll.hapusData(M2);
        csll.cetak("csll stl M2(Alba) di hapus");
        csll.hapusData(M4);
        csll.cetak("csll stl M4(Ter stegen) di hapus");
        csll.hapusSatuDataDiAkhir();
        csll.cetak("csll stl data akhir dihapus");
    }
}