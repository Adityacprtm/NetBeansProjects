

class NodeDLL {

    Pasien data;
    NodeDLL next, prev;
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
        } else if (this.penyakit.equalsIgnoreCase("penyakit jantung")) {
            return 2;
        } else if (this.penyakit.equalsIgnoreCase("stroke")) {
            return 3;
        } else if (this.penyakit.equalsIgnoreCase("sakit sedang") || this.penyakit.equalsIgnoreCase("demam") || this.penyakit.equalsIgnoreCase("batuk")) {
            return 4;
        } else if (this.penyakit.equalsIgnoreCase("sakit ringan") || this.penyakit.equalsIgnoreCase("flu") || this.penyakit.equalsIgnoreCase("batuk biasa")) {
            return 5;
        } else {
            return -999;
        }
    }
}

public class DoubleLinkedList {

    private NodeDLL pKepala, pEkor;

    public DoubleLinkedList() {
        pKepala = null;
        pEkor = null;
    }

    public void sisipDipKepala(Pasien dt) {
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

    public void sisipDipEkor(Pasien data) {
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
        NodeDLL n = pKepala;
        while (n != null) {
            System.out.print(n.data.getNama() + " --> ");
            n = n.next;
        }
        System.out.println("NULL");
    }

    public void hapusDataTertentu(String dataHapus) {
        // lengkapi bagian ini
        NodeDLL temp = pKepala;
        while (!temp.data.getNama().equalsIgnoreCase(dataHapus)) {
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

    public void sisipDataTerurut(Pasien data) {
        // lengkapi bagian ini
        NodeDLL baru = new NodeDLL();
        baru.data = data;
        baru.next = null;
        baru.prev = null;
        if (pKepala == null) {
            pKepala = baru;
            pEkor = baru;
        } else {
            NodeDLL temp = pKepala;
            while (temp != null) {
                if (data.lvlPenyakit() <= pKepala.data.lvlPenyakit()) {
                    baru.next = pKepala;
                    pKepala.prev = baru;
                    pKepala = baru;
                    break;
                } else if (data.lvlPenyakit() < temp.data.lvlPenyakit()) {
                    baru.next = temp;
                    baru.prev = temp.prev;
                    temp.prev.next = baru;
                    temp.prev = baru;
                    break;
                }
                temp = temp.next;
            }
            if (temp == null) {
                baru.prev = pEkor;
                pEkor.next = baru;
                pEkor = baru;
            }
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList sll = new DoubleLinkedList();
        Pasien p1 = new Pasien("Parjo", "sekarat");
        Pasien p2 = new Pasien("Paijo", "sakit ringan");
        Pasien p3 = new Pasien("Parno", "stroke");
        Pasien p4 = new Pasien("paido", "stroke");
        sll.sisipDataTerurut(p1);
        sll.sisipDataTerurut(p2);
        sll.sisipDataTerurut(p3);
        sll.sisipDataTerurut(p4);
        sll.cetak("Data Urut : ");
//        sll.hapusDataTertentu("paijo");
//        sll.cetak("hapus");
    }
}
