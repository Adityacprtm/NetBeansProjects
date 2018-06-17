
package PrakKB3;

class node {
    String operasi;
    node prev;
    node next[] = new node[7];
    int hn;
}
public class Astar_Search {
    private node pKepala, pEkor;
    private int n, m, k;
    private int isiN, isiM;
    private int jarak[][] = new int[7][7];
    public Astar_Search() {
        pKepala = null;
        pEkor = null;
    }
   public void sisipDipKepala(String dt, int n, int hn) {
        node baru = new node();
        baru.operasi = dt;
        baru.hn = hn;
        if (pEkor == null) {
            baru.prev = pKepala;
            baru.next[n] = pEkor;
            this.jarak(baru, baru, 0);
            pKepala = baru;
            pEkor = baru;
        } else {
            baru.prev = pEkor;
            pEkor.next[n] = baru;
            this.jarak(baru, baru, 0);
            pEkor = baru;
        }
    }    
     public void tambahEdge(node root, String dt, int n, int hn, int gn) {
        node baru = new node();
        baru.operasi = dt;
        baru.hn = hn;
        root.next[n] = baru;
        root.next[n].prev = root;
        this.jarak(root, root.next[n], gn);
    }
    public int ins(String a) {
        if ("A".equals(a)) {
            return 0;
        } else if ("B".equals(a)) {
            return 1;
        } else if ("C".equals(a)) {
            return 2;
        } else if ("D".equals(a)) {
            return 3;
        } else if ("E".equals(a)) {
            return 4;
        } else if ("F".equals(a)) {
            return 5;
        } else {
            return 6;
        }
    }
    public void jarak(node a, node b, int gn) {
        this.jarak[ins(a.operasi)][ins(b.operasi)] = gn;
    }
    public void sambung(node a, node b, int n, int gn) {
        a.next[n] = b;
        this.jarak(a, b, gn);
        a.next[n].prev = a;
    }
    public void proses(String t) {
        int totalCost = 0;
        String rute = "";
        boolean ketemu = false;
        node p = pKepala;
        int hasil, hasil2;
        System.out.printf("Mencari rute %s ke lokasi %s\n", p.operasi, t);
        System.out.println("========================");
        while (p != null) {
            rute = rute + "-->" + p.operasi;
            if (p == pKepala) {
                System.out.printf("Dari lokasi %s = %d + %d ; %d\n", p.operasi,
                        0, p.hn, p.hn);
                totalCost = totalCost + p.hn;
               System.out.println("========== ==============");
           } else {
                System.out.printf("Dari lokasi %s = %d + %d ; %d\n", p.operasi, jarak[this.ins(p.prev.operasi)] [this.ins(p.operasi)], p.hn, jarak[ins(p.prev.operasi)] [ins(p.operasi)] + p.hn);
                totalCost = totalCost + jarak[ins(p.prev.operasi)][ins(p.operasi)] + p.hn;
                System.out.println("=============== =========");
                if ("D".equals(p.operasi)) {
                    System.out.println("==--sampai--==");
                    ketemu = true;
                    break;
                }
                System.out.printf("Cek nilai cost dari lokasi %s ; ", p.prev.operasi);
                hasil = this.jarak [this.ins(p.prev.operasi)][this.ins(p.operasi)] + p.hn;
                System.out.printf("%d + %d = %d\n", jarak[this.ins(p.prev.operasi)] [this.ins(p.operasi)],
                        p.hn, hasil);
            }
            node temp = null;
            node temp2 = null;
            for (int i = 0; p.next[i] != null; i++) {
                System.out.printf("Cek nilai cost dari lokasi %s ; ", p.next[i].operasi);
                hasil = this.jarak[this.ins(p.operasi)] [this.ins(p.next[i].operasi)] + p.next[i].hn;
                System.out.printf("%d + %d = %d\n", jarak[this.ins(p.operasi)] [this.ins(p.next[i].operasi)],
                        p.next[i].hn, hasil);
                if (p.next[i].operasi == t) {
                    ketemu = true;
                }
                if (temp == null) {
                    temp = p.next[i];
                } else {
                   if (this.jarak[ins(temp.prev.operasi)] [ins(temp.operasi)] + temp.hn > hasil) {
                        if (i >= 1) {
                            temp2 = temp;
                            temp = p.next[i];
                        } else {
                            temp = p.next[i];
                        }
                    }
                    if (i == 1 && temp2 == null) {
                        temp2 = p.next[i];
           } else if (this.jarak[ins(temp2.prev.operasi)] [ins(temp2.operasi)] + temp2.hn > hasil && p.next[i] != temp) {
                        temp2 = p.next[i];
                    }
                }
            }
            int check1 = 0;
            int check2 = 0;
            if (!ketemu) {
                check1 = this.checkOpt(temp, this.jarak [ins(temp.prev.operasi)][ins(temp.operasi)] + temp.hn, t);
                check2 = this.checkOpt(temp2, this.jarak [ins(temp2.prev.operasi)][ins(temp2.operasi)] + temp2.hn, t);
                if (check1 < check2) {
                    p = temp;
                } else {
                    p = temp2;
                }
            } else {
                p = temp;
            }
        System.out.println("\n========================");
            System.out.printf("Pilih lokasi %s\n", p.operasi);
          System.out.println("========================");
        }
        if (ketemu) {
            System.out.printf("\nPencarian selesai dengan rute %s\n", rute);
            System.out.printf("Dengan total cost %d\n", totalCost);
        }
    }
   public int checkOpt(node p, int cost, String tujuan) {
        int hasil;
        node temp = null;
        int nil = 0;     
        System.out.println("\n\t======================== ===========");
        System.out.printf("\tTest optimal lokasi %s ke %s\n", p.operasi, tujuan);
        System.out.println("\t================== =================");
        for (int i = 0; p.next[i] != null; i++) {
            System.out.printf("\tCek nilai cost dari lokasi %s ; ", p.next[i].operasi);
            hasil = this.jarak[this.ins(p.operasi)] [this.ins(p.next[i].operasi)] + p.next[i].hn;
            System.out.printf("%d + %d = %d\n", jarak[this.ins(p.operasi)][this.ins(p.next[i].operasi)],
                    p.next[i].hn, hasil);
            if (temp == null) {
                temp = p.next[i];
            } else {
                if (this.jarak[ins(temp.prev.operasi)] [ins(temp.operasi)] + temp.hn > hasil) {
                    temp = p.next[i];
                }
            }
            if (p.next[i].operasi == tujuan) {
                nil = hasil;
                break;
            }
        }
        if (p.operasi == tujuan) {
            return 0;
        } else {
            return nil;
        }
    }
    public static void main(String[] args) {
        Astar_Search n = new Astar_Search();
        n.sisipDipKepala("A", 0, 200);
        n.tambahEdge(n.pKepala, "F", 0, 110, 81);
        n.tambahEdge(n.pKepala, "G", 1, 175, 63);
        n.tambahEdge(n.pKepala, "B", 2, 120, 79);
        n.tambahEdge(n.pKepala.next[0], "E", 0, 85, 148);
        n.tambahEdge(n.pKepala.next[0], "D", 1, 0, 126);
        n.sambung(n.pKepala.next[0], n.pKepala.next[1], 2, 60);
        n.sambung(n.pKepala.next[2], n.pKepala.next[1], 2, 55);//balik
        n.tambahEdge(n.pKepala.next[2], "C", 0, 83, 131);
        n.sambung(n.pKepala.next[2], n.pKepala.next[0].next[1], 1, 109);
        n.sambung(n.pKepala.next[0].next[0], n.pKepala.next[0].next[1], 0, 92);
        n.sambung(n.pKepala.next[2].next[0], n.pKepala.next[0].next[1], 0, 109);
        n.proses("D");
    }
}
