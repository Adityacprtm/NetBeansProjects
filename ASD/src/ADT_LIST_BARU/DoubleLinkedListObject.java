package ADT_LIST_BARU;
import java.util.Scanner;
class NodeDLL1 {
    Mahasiswa data;
    NodeDLL1 prev, next;
}
public class DoubleLinkedListObject {
    private NodeDLL1 pKepala, pEkor;
    public DoubleLinkedListObject() {
        pKepala = null;
        pEkor = null;
    }
    public void sisipDipKepala(Mahasiswa dt) {
        NodeDLL1 baru = new NodeDLL1();
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
    public void sisipDipEkor(Mahasiswa data) {
        NodeDLL1 baru = new NodeDLL1();
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
        NodeDLL1 p = pKepala;
        while (p != pEkor.next) {
            System.out.print("|" + p.data.getNama() + "|" + p.data.getNim() + "|" + p.data.getIpk() + "| -> ");
            p = p.next;
        }
        System.out.println();
    }
    public void hapusDataTertentu(String dataHapus) {
        // lengkapi bagian ini
        NodeDLL1 temp = pKepala;
        while (!temp.data.getNim().equals(dataHapus)) {
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
    public void sisipDataTerurut(Mahasiswa data) {
        // lengkapi bagian ini
        NodeDLL1 baru = new NodeDLL1();
        baru.data = data;
        baru.next = null;
        baru.prev = null;
        if (pKepala == null) {
            pKepala = baru;
            pEkor = baru;
        } else {
            NodeDLL1 temp = pKepala;
            while (temp != null) {
                if (data.getIpk() >= pKepala.data.getIpk()) {
                    baru.next = pKepala;
                    pKepala.prev = baru;
                    pKepala = baru;
                    break;
                } else if (data.getIpk() > temp.data.getIpk()) {
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
    public void urutData() {
        DoubleLinkedListObject a = new DoubleLinkedListObject();
        NodeDLL1 temp = pKepala;
        while (temp != null) {
            a.sisipDataTerurut(temp.data);
            temp = temp.next;
        }
        a.cetak("DATA SETELAH DI URUT : ");
    }
    public static void main(String s[]) {
        DoubleLinkedListObject dll = new DoubleLinkedListObject();
        Scanner in = new Scanner(System.in);
        int pilih = 0;
        String nama, nim;
        double ipk;
        System.out.println("============= MENU =============");
        System.out.println("1. Sisip di Kepala");
        System.out.println("2. Sisip di Ekor");
        System.out.println("3. Data Terurut IPK");
        System.out.println("4. Hapus Data");
        System.out.println("5. Cetak");
        System.out.println("6. Exit");
        System.out.println("================================");
        do {
            System.out.print("Pilihan : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("SISIP DATA DI KEPALA");
                    System.out.print("Input Nama\t:");
                    nama = in.next();
                    System.out.print("Input NIM\t:");
                    nim = in.next();
                    System.out.print("Input IPK\t:");
                    ipk = in.nextDouble();
                    dll.sisipDipKepala(new Mahasiswa(nama, nim, ipk));
                    System.out.println("================================");
                    break;
                case 2:
                    System.out.println("SISIP DATA DI EKOR");
                    System.out.print("Input Nama\t:");
                    nama = in.next();
                    System.out.print("Input NIM\t:");
                    nim = in.next();
                    System.out.print("Input IPK\t:");
                    ipk = in.nextDouble();
                    dll.sisipDipEkor(new Mahasiswa(nama, nim, ipk));
                    System.out.println("================================");
                    break;
                case 3:
                    dll.urutData();
                    System.out.println("================================");
                    break;
                case 4:
                    System.out.print("NIM yang dihapus : ");
                    nim = in.next();
                    dll.hapusDataTertentu(nim);
                    System.out.println("Data Telah Dihapus\n================================");
                    break;
                case 5:
                    dll.cetak("Data Mahasiswa : ");
                    System.out.println("================================");
                    break;
                case 6:
                    System.out.println("Program dihentikan..");
                    System.out.println("================================");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    System.out.println("================================");
                    break;
            }
        } while (pilih != 6);
    }
}
